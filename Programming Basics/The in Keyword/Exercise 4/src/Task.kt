package theinKeyword4


fun isValidIdentifier(s: String): Boolean {

    if (s.isEmpty()) return false

    for ((index, char) in s.withIndex()) {
        if (index == 0 && isStartChar(char)) continue
        if (index > 0 && isCommonChar(char)) continue
        return false
    }
    return true
}

fun isStartChar(char: Char): Boolean {
    if (char.isLetter() || char == '_') return true
    return false
}

fun isCommonChar(char: Char): Boolean {
    if (char.isLetterOrDigit() || char == '_') return true
    return false
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}