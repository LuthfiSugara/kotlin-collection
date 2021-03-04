package app

fun main() {
    val numbers = (1..5).toList()

    println(numbers.windowed(3, 1, false))
    println(numbers.windowed(3, 1, false){it.size})
    println(numbers.windowed(3, 1, true))
    println(numbers.windowed(3, 1, true){it.size})

    println(numbers.windowed(3, 2, false))
    println(numbers.windowed(3, 2, true))
}