package app

fun main() {
    val numbers = listOf(6, 1, 4, 10, 33, 21, 5, 7, 3, 9, 12)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}