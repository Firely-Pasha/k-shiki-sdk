import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").createAnimeService().apply {
        val anime = getList(AnimeSearchFilter().apply {

        })[0]
        anime.image.original
        println(get(1))
    }
}