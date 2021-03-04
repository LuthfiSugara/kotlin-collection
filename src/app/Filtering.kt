package app

fun main() {
    val list1 = listOf("Luthfi", "Sugara", "Programmer")
    val list2 = list1.filter { it.length > 5 }
    print(list2)
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Luthfi", "Sugara", 2, null)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}