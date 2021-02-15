package app

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection)
        println(element)
}

fun main() {
    displayCollection(listOf("Luthfi", "Sugara"))
    displayCollection(setOf("Luthfi", "Sugara"))
    displayCollection(mapOf("Luthfi" to "Sugara").entries)
    //displayCollection(mapOf("Luthfi" to "Sugara")) // Error map bukan turunan collection
}

