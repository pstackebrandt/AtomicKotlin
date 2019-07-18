package summary4

fun printSnake(rows: Int, columns: Int) {
    if (rows < 1 || columns < 1) return

    val width = (rows * columns).toString().length + 1
    var number: Int

    for (row in 0 until rows) {
        for (column in 0 until columns) {
            number = row * columns
            number += if (row % 2 == 0) {
                column
            } else {
                columns - 1 - column
            }

            print("%${width}d".format(number))
        }
        println()
    }
}

fun main(args: Array<String>) {
    printSnake(4, 5)
}
/* Output:
  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/