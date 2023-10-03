import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    DatetimeToString(Store())
}

data class Store(
    var registerAt: LocalDateTime ?= null
)

class DatetimeToString(store: Store) {

    init {
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime)
    }

    private fun toLocalDateTimeString(localDateTime: LocalDateTime?): String {
//        var temp = if (localDateTime == null) {
//            LocalDateTime.now()
//        } else {
//            localDateTime
//        }
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
    }
}