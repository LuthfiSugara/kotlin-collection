package app

fun main() {
    val words = "luthfi sugara programmer belajar kotlin dasar".split(" ")

    val result = words
            .filter {
                println("Filter $it")
                it.length > 3
            }
            .map {
                println("Map $it")
                it.toUpperCase()
            }
            .take(4)

    println(result)

    println("==========")
    val sequence = words.asSequence()
    val resultSequence = sequence
            .filter {
                println("Filter $it")
                it.length > 3
            }
            .map {
                println("Map $it")
                it.toUpperCase()
            }
            .take(4)

    println(resultSequence.toList() )
}