package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Luthfi"))
    mutableSet.add(Person("Sugara"))
    mutableSet.add(Person("Sugara"))
    mutableSet.add(Person("Programmer"))
    mutableSet.add(Person("Luthfi"))

    for (person in mutableSet)
        println(person)

    val mutableSetString = mutableSetOf("Luthfi1", "Sugara1", "Programmer1")
}