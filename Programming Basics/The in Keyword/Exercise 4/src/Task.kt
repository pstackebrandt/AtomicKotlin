package theinKeyword4

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false

    for ((index, char) in s.withIndex()) {
        if (index == 0 && !getStartChars().contains(char)) return false
        if (!getSecondaryChars().contains(char)) return false
    }

    return true
}

private fun getStartChars(): String {

    val builder = StringBuilder()

    ('a'..'z').forEach { letter -> builder.append(letter) }
    ('A'..'Z').forEach { letter -> builder.append(letter) }
    builder.append("_")

    return builder.toString()
}

private fun getSecondaryChars(): String {
    val builder = StringBuilder()

    ('a'..'z').forEach { letter -> builder.append(letter) }
    ('A'..'Z').forEach { letter -> builder.append(letter) }
    (0..9).forEach { letter -> builder.append(letter) }
    builder.append("_")

    return builder.toString()
}

fun main(args: Array<String>) {
    println("StartChars: ${getStartChars()}")
    println("Secondary chars: ${getSecondaryChars()}")
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}