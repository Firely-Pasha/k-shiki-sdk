package net.pagala.kshikisdk

import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.Type

class CallAdapterFactory : CallAdapter.Factory() {
    override fun get(returnType: Type, annotations: Array<Annotation>, retrofit: Retrofit): CallAdapter<*, *>? {
        return if (returnType.toString().contains("retrofit2.Call")) {
            null
        } else {
            CallAdapter(returnType)
        }
    }

}

class CallAdapter(
    private val returnType: Type
) : CallAdapter<Any?, Any?> {
    override fun responseType(): Type {
        return returnType
    }

    override fun adapt(call: Call<Any?>): Any? {
        return try {
            val item = call.execute()
            if (item.code() >= 300) {
                null
            } else {
                item.body()
            }
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}