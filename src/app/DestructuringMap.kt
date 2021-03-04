package app

fun main() {
    val map = mapOf(
            "a" to "luthfi",
            "b" to "sugara",
            "c" to "programmer"
    )

    for ((key, value) in map){
        println("$key : $value")
    }
    
//    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}")}
    map.forEach { (key, value) -> println("$key : $value ") }
}