package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
            Fruit("Apple", 10),
            Fruit("Orange", 7),
            Fruit("Mango", 5)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })

    println(fruits.sortedWith( Comparator { fruit1, fruit2 ->
        fruit1.quantity.compareTo(fruit2.quantity)
    }))

    fruits.sortedWith(compareBy { it.quantity })
    fruits.sortedBy { it.quantity }
}