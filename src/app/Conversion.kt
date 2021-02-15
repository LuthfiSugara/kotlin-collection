package app

fun main() {
    val array = arrayOf(1, 22, 73, 41, 15, 61, 7, 8, 9, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val listToMutableList = list.toMutableList()
    val listToMutableSet = list.toMutableSet()

    val sortedSet = array.toSortedSet()
}