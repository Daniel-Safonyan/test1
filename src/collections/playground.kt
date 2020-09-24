package collections

fun main() {

    val pets1 = listOf("Dog", "Cat", "Elephante")
    val pets2 = listOf("Cat", "Rat", "Raton")
    val pets3 = listOf("Parrot", "Fish", "Cat", "Rat", "Dog")

    val allPets = pets1 + pets2 + pets3
    println(allPets.size)

    val petSet = allPets.toSet()
    println(petSet.size)

    println("Number of duplicates is: ${allPets.size - petSet.size}")

    println(petSet)
    val sortedPets = petSet.sorted().toMutableList()

    println(sortedPets)
}