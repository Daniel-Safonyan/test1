package collections

class Dog(val name: String)

fun main() {
    val dog1 = Dog("Bono")
    val dog2 = Dog("Pepe")
    val dog3 = Dog("Cocko")

    val mapOfDogs = mapOf<String, Dog>(
            "Dog1" to dog1,
            "Dog2" to dog2,
            "Dog3" to dog3)

    val dogList = mapOfDogs.values

    println(dogList)
}