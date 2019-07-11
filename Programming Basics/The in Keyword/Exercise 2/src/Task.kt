package theinKeyword2

fun sumOfEven(n: Int): Int {

    var sum = 0
    for (i in 0..n) {
        if (i % 2 != 0) continue
        sum += i
    }

    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}