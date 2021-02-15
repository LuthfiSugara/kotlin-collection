package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Luthfi")
    mutableList.add("Sugara")
    mutableList.add("Programmer")

//    mutableList[0] = "Luthfi"
//    mutableList.remove("Luthfi")

    for (value in mutableList)
        println(value)
}