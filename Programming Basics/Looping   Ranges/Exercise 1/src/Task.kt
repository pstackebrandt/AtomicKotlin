package loopingandRanges1

fun factorial(n: Int): Long {

    var product: Long = 1
    for (x in 1 .. n   ) {
        product *= x
    }

    return product
}

fun main(args: Array<String>) {
    println(factorial(10))  // 3628800
}