package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
            listOf("Luthfi", "Sugara", "Programmer"),
            listOf("Luthfi", "Sugara", "Programmer"),
            listOf("Luthfi", "Sugara", "Programmer"),
            listOf("Luthfi", "Sugara", "Programmer")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
            Member("Luthfi", listOf("Gaming", "Traveling")),
            Member("Sugara", listOf("Reading", "Sleeping"))
    )

//    val hobies = members.map { it.hobies } .flatten()
    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}