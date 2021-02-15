package app

fun main() {
    listOf("Luthfi", "Sugara", "Nasution").forEach {
        println(it)
    }

    mutableListOf("Luthfi", "Sugara", "Programmer").forEachIndexed { index, value ->
        println("$index : $value")
    }
}