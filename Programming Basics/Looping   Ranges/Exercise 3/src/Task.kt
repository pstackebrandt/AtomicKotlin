package loopingandRanges3

fun sumOfEven(n: Int): Int {

    var sum = 0
    for (i in 2..n step 2) {
        sum += i
    }

    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}