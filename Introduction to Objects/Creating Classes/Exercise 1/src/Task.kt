package creatingClasses1

val letters = 'a'..'z'

fun isPalindrome(s: SimpleString): Boolean {
    var cleaned = ""

    for (i in 0 until s.length()) {
        var char = s.get(i)
        if (char in letters) {
            cleaned += char
        }
    }

    return cleaned == cleaned.reversed()
}

fun main(args: Array<String>) {
    println(isPalindrome(SimpleString("mom")))
    println(isPalindrome(SimpleString("mom!")))
}
/* Output:
true
*/