package objectsEverywhere3

fun isPalindrome(s: String): Boolean =  s == s.reversed()



fun isPalIgnoreCase(s: String): Boolean =
                s.toLowerCase() == s.toLowerCase().reversed()

fun isPalIgnoreSpecial(s: String): Boolean {
    var cleaned = s.replace("?", "")

    cleaned = cleaned.replace(".", "")
    cleaned = cleaned.replace("!", "")
    cleaned = cleaned.replace("-", "")
    cleaned = cleaned.replace(".", "")
    cleaned = cleaned.replace(" ", "")
    cleaned = cleaned.replace("'", "")
    cleaned = cleaned.replace(",", "")
    println(cleaned)
    return cleaned.toLowerCase() == cleaned.toLowerCase().reversed()
}

fun main(args: Array<String>) {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}