package creatingClasses2

fun isPalIgnoreCase(s: SimpleString): Boolean {
    val cleaned = StringBuilder()

    for (i in 0 until s.length()){
        cleaned.append(s.get(i)
            .toLowerCase())
    }

    return cleaned.toString() == cleaned.reverse().toString()
}

fun main(args: Array<String>) {
    println(isPalIgnoreCase(SimpleString("Mom")))
}
/* Output:
true
*/