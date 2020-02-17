import net.pagala.kshikisdk.ShikimoriSdk

fun main() {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").createAnimeService().apply {
        val anime = getList()[0]
        anime.image.original
        println()
    }
}