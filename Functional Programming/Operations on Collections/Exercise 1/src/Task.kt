package operationsonCollections1

import atomictest.eq

data class Person(val name: String, val age: Int)

fun findOldest(people: List<Person>, requiredNumber: Int): List<String> {

    return people
        .sortedByDescending { person -> person.age }
        .subList(0, minOf(requiredNumber, people.count()))
        .map { it.name }
        .sorted()
}

fun main(args: Array<String>) {
    val people = listOf(
        Person("Bob", 30),
        Person("Charlie", 20),
        Person("Alice", 25))
    findOldest(people, 1) eq listOf("Bob")
    findOldest(people, 2) eq listOf("Alice", "Bob")
    findOldest(people, 1).count() eq 1
    findOldest(people, 2).count() eq 2
    findOldest(people, 3).count() eq 3
}