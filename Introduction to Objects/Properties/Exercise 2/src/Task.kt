package properties2

class Robot {
    private var x = 0
    private var y = 0
    private val rightBorder = 99
    private val downBorder = 99
    private val leftBorder = 0
    private val topBorder = 0
    private val width = rightBorder - leftBorder + 1
    private val height = downBorder - topBorder + 1
    fun goRight(steps: Int) {
        x += steps.rem(width)
        if (x > rightBorder) x = x - width
    }

    fun goLeft(steps: Int) {
        x -= steps.rem(width)
        if (x < leftBorder) x = x + width
    }

    fun goDown(steps: Int) {
        y += steps.rem(height)
        if (y > downBorder) y = y - height
    }

    fun goUp(steps: Int) {
        y -= steps.rem(height)
        if (y < topBorder) y = y + height
    }

    fun getLocation(): String = "($x,$y)"
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.goUp(1)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
/* Output:
(0,0)
(0,99)
(90,99)
*/