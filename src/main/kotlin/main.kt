import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.MangaOrder
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.MangaSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.interfaces.Anime

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").apply {
//        createAnimeService().apply {
//            val anime = getList(AnimeSearchFilter().apply {
//
//            })[0]
//            anime.image.original
//            println(get(1))
//        }
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