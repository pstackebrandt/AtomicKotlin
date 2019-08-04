package summary1

fun countDigits(number: Int, digit: Int): Int {
    var worker = number.toString()
    val digitString = digit.toString()
    var occurrences = 0
    var lastPos: Int
    var lastValue: String

    while (worker.isNotEmpty()) {
        lastPos = worker.length - 1
        lastValue= worker[lastPos].toString()
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