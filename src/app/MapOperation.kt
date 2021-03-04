package app

fun main() {
    val map = mapOf("a" to "luthfi", "b" to "sugara", "c" to "programmer")

//    println(map.getOrElse("tidak ada"))  //Exception
    println(map.getValue("a"))
    println(map.getOrElse("tidak ada"){"Ups"})
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}