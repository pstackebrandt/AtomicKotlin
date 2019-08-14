package properties3

class Counter {
    var value = 0

    private val i = 10

    fun inc() {
        value += i
    }

    fun dec() {
        value -= i
    }
}