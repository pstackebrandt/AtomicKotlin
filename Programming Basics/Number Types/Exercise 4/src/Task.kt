package numberTypes4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
        ((hours * 60L + minutes) * 60 + seconds) * 1_000


fun main(args: Array<String>) {
    println(convertToMilliseconds(1, 30, 0))
}