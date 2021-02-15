package app

fun main() {
    val pair1: Pair<String, String> = Pair("Luthfi", "Sugara")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Luthfi" to "Sugara"
    println(pair2.first)
    println(pair2.second)
}