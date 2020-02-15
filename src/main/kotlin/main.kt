import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.filters.search.AnimeKind
import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.filters.search.TitleStatus

fun main() {

    println(ShikimoriSdk("KShikiSdk", "Firely-Pasha").createAnimeService().getList(AnimeSearchFilter().apply {
        limit = 3
        statuses.include.add(TitleStatus.ONGOING)
        kinds.include.add(AnimeKind.ONA)
    }))
}