package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Luthfi"), Person("Sugara"), Person("Luthfi"), Person("Programmer")
    )

    println(set.size)
    println(set.contains(Person("Luthfi")))

    for (person in set)
        println(person)
}