package app

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection)
        println(element)
}

fun main() {
//    displayMutableCollection(listOf("Luthfi", "Sugara")) //Error
    displayMutableCollection(mutableListOf("Luthfi", "Sugara"))
//    displayMutableCollection(setOf("Luthfi", "Sugara")) //Error
    displayMutableCollection(mutableSetOf("Luthfi", "Sugara"))
//    displayMutableCollection(mapOf("Luthfi" to "Sugara").entries) Error
    displayMutableCollection(mutableMapOf("Luthfi" to "Sugara").entries)
    //displayMutableCollection(mapOf("Luthfi" to "Sugara")) // Error map bukan turunan collection
}