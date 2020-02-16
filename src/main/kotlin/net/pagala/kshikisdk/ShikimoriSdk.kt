package net.pagala.kshikisdk

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import net.pagala.kshikisdk.service.AnimeService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class ShikimoriSdk(
    private val appName: String,
    private val developerName: String,
    clientBuilderMod: ((OkHttpClient.Builder) -> OkHttpClient.Builder)? = null,
    retrofitBuilderMod: ((Retrofit.Builder) -> Retrofit.Builder)? = null
) {
    companion object {
        const val SITE_URL = "https://shikimori.one/"
        const val API_PATH = "api/"
        const val API_V2_PATH = API_PATH + "v2/"
    }

    var accessToken = ""

    private val okHttpClient: OkHttpClient
    private val retrofit: Retrofit

    init {
        okHttpClient = initClient(clientBuilderMod)
        retrofit = initRetrofit(retrofitBuilderMod)
    }

    fun createAnimeService() = AnimeService(retrofit)

    private fun initClient(
        builderMod: ((OkHttpClient.Builder) -> OkHttpClient.Builder)? = null
    ) = with(OkHttpClient.Builder()) {
        addInterceptor { chain ->
            val request = chain.request()
            chain.proceed(
                request.newBuilder().apply {
                    println(request.url().toString())
                    addHeader("User-Agent", "$appName $developerName")
                    if (!accessToken.isBlank()) {
                        addHeader("Authorization", "Bearer $accessToken")
                    }
                }.build()
            )
        }
        builderMod?.invoke(this)
        build()
    }

    private fun initRetrofit(builderMod: ((Retrofit.Builder) -> Retrofit.Builder)? = null) = with(Retrofit.Builder()) {
        baseUrl(SITE_URL)
        addConverterFactory(
            MoshiConverterFactory.create(
                Moshi.Builder()
                    .add(KotlinJsonAdapterFactory())
                    .build()
            )
        )
        addCallAdapterFactory(CallAdapterFactory())
        builderMod?.invoke(this)
        client(okHttpClient)
        build()
    }

}