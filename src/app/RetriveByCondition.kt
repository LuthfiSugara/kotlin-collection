package app

fun main() {
    val numbers = (1..20).toList()

    println(numbers.first(){it > 10})
    println(numbers.last(){it > 10})
    println(numbers.firstOrNull(){it > 10})
    println(numbers.find { it > 10 })
    println(numbers.lastOrNull { it > 10 })
    println(numbers.findLast { it > 10 })
}