package summary1

fun countDigits(number: Int, digit: Int): Int {
    var worker = number.toString()
    val digitString = digit.toString()
    var occurrences = 0
    var lastValue: String

    while (worker.isNotEmpty()) {
        lastValue= worker[worker.length - 1].toString()
        if (lastValue == digitString) {
            occurrences += 1
        }
        worker = worker.substring(0, worker.length-1)
    }
    return occurrences
}

fun main(args: Array<String>) {
    println(countDigits(764241, 4)) // 2
}