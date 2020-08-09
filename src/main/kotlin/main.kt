import kotlinx.coroutines.coroutineScope
import net.pagala.shikimorisdk.ShikimoriSdk

suspend fun main() = coroutineScope {
    ShikimoriSdk("Firely-Pasha", "KShikiSdk").apply {
        createAnimeService().apply {
            println(get(1))
        }
        createCalendarService().apply {
            println(get())
        }
    }
    Unit
}
