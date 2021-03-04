package app

fun main() {
    val list1 = listOf("Luthfi", "Sugara", "Programmer")
    val list2 = list1 + "TI"
    println(list2)
    val list3 = list1 + listOf("latihan", "kotlin", "dasar")
    println(list3)
    val list4 = list1 - "Luthfi"
    println(list4)
    val list5 = list1 - listOf("have", "good", "day")
    println(list5)

    val map1 = mapOf("a" to "luthfi", "b" to "sugara")
    val map2 = map1 + ("c" to "programmer")
    println(map2)
    val map3 = map1 - "a"
    println(map3)
}