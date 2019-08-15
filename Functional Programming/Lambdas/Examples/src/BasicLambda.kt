// Lambdas/BasicLambda.kt
import atomictest.eq
import atomictest.neq

fun main(args: Array<String>) {
  val name ="Hannah"
  println("Hello")
  val list = listOf(1, 2, 3, 4)
  val result = list.map({ n: Int -> "[$n]" })
  result eq listOf("[1]","[2]","[3]","[4]")
  name.toLowerCase() eq "hannah"
}