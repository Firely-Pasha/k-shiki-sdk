import net.pagala.kshikisdk.ShikimoriSdk

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").apply {
        createAnimeService().apply {
//            val anime = getList(AnimeSearchFilter().apply {
//                limit = 10
//                page = 1
//            })[2]
//            anime.image.original
//            println(CollectionParameter<AnimeKind>().apply {
//                exclude.add(AnimeKind.TV)
//                include.add(AnimeKind.TV)
//            }.build())
//            println(get(1))
//            println(getRelated(1))
        }
        createCharacterService().apply {
            print(get(124989))
            print(search("Spike").size)
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