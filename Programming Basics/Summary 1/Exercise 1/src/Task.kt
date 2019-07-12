package summary1

fun countDigits(number: Int, digit: Int): Int {
    var worker = number.toString()
    var occurrences = 0
    while (worker.length > 0) {
        if (worker[worker.length-1]) == digit.toChar()
    }
    return occurrences
}

fun main(args: Array<String>) {
    println(countDigits(764241, 4)) // 2
}