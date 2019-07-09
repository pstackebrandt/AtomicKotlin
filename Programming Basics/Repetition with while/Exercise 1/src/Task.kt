package repetitionwithwhile1

fun sum(number: Int): Int {
    var i = number
    var sum = 0
    while (i > 0) {
        sum += i
        i--
    }
    return sum
}

fun main(args: Array<String>) {
    println(sum(10))  // 55
}