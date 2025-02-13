package summary2

fun reverseDecimal(number: Int): Int {

    var worker = number
    var result = 0
    while (worker > 0) {
        result += worker % 10
        worker /= 10

        if (worker > 0)
            result *= 10
    }


    return result
}

fun main(args: Array<String>) {
    println(reverseDecimal(1234))  // 4321
}