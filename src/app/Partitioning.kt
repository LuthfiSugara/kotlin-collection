package app

fun main() {
    val list: List<String> = listOf("Luthfi", "Sugara", "Programmer")

//    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(listMatch)
    println(listNotMatch)
}