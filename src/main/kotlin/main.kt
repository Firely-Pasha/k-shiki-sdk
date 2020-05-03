import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter

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
        createGenreService().apply {
            println(getList())
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