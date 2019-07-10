package loopingandRanges4

fun printHalfPyramid(n: Int) {
//    if (n == 0) return
    for (i in 1 .. n)
    {
        print("${"#".repeat(i)}\n")
    }
}

fun main(args: Array<String>) {
    printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/