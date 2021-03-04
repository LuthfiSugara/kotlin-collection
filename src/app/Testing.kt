package app

fun main() {
    val list = listOf("Luthfi", "Sugara", "Programmer")

    println(list.any { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })
    println(list.none())
}