package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Luthfi"),
        "b" to "Sugara",
        "c" to "Programmer"
    )

    for ((key, value) in map)
        println("$key to $value")
}