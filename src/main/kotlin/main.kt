import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.MangaOrder
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.MangaSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.interfaces.Anime

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").apply {
        createAnimeService().apply {
            val anime = getList(AnimeSearchFilter().apply {
                limit = 10
                page = 1
            })[2]
            anime.image.original
            println(get(anime.id))
        }
        createMangaService().apply {
//            val manga = get(1)
//            println(manga)
//            println(getList(MangaSearchFilter().apply {
//                order = MangaOrder.CHAPTERS
//            }))
//            println(getRoles(1))
//            println(getSimilar(1))
        }
    }
}