package app

fun main() {
    val map: Map<Int, String> = mapOf(
            1 to "Luthfi",
            2 to "Sugara",
            3 to "Programmer"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys )

    val mapValues = map.mapValues { it.value.toUpperCase() }
    println(mapValues)
}