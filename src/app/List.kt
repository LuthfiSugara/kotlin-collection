package app

fun main() {
    val list: List<String> = listOf("Luthfi", "Sugara", "Programmer")

    println(list.get(0))
    println(list[1])
    println(list[2])
    println(list.indexOf("Luthfi"))
    println(list.indexOf("Tidak Ada"))
    println(list.contains("Luthfi"))
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Luthfi", "Programmer")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}