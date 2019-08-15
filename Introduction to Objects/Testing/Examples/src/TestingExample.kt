// Testing/TestingExample.kt
import atomictest.*

fun main(args: Array<String>) {
  val v1 = 11
  val v2 = "Ontology"
  val v3 = "Hannah"

  // Test expressions using 'eq' ("equals"):
  v1 eq 11
  v2 eq "Ontology"
  v3 eq "Hannah"

  // 'neq' means "not equal"
  v2 neq "Epistimology"
  v3 neq "Hannah"

  // Error: Epistimology != Ontology
  // v2 eq "Epistimology"
}
/* Output:
11
Ontology
Ontology
*/