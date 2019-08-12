package objectsEverywhere5

fun main(args: Array<String>) {
    val r = IntRange(0, 10)
    val s = "abc"

    r.sum()
    s.reversed()

    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
}