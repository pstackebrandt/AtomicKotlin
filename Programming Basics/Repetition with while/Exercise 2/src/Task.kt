package repetitionwithwhile2

fun sumOfEven(n: Int): Int {
    var i = n
    var sum = 0
    while (i > 0) {
        if (i % 2 == 0)
            sum += i
        i--
    }
    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}