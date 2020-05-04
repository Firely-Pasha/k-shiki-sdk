import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.CollectionParameter
import net.pagala.kshikisdk.repository.build

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").apply {
        createAnimeService().apply {
            val anime = getList(AnimeSearchFilter().apply {
                limit = 10
                page = 1
            })[2]
            anime.image.original
            println(CollectionParameter<AnimeKind>().apply {
                exclude.add(AnimeKind.TV)
                include.add(AnimeKind.TV)
            }.build())
        }
//        createGenreService().apply {
//            println(getList())
//        }
//        createMangaService().apply {
////            val manga = get(1)
////            println(manga)
////            println(getList(MangaSearchFilter().apply {
////                order = MangaOrder.CHAPTERS
////            }))
////            println(getRoles(1))
////            println(getSimilar(1))
//        }
    }
}