package generics

abstract class Pet(open val name: String)

class Cat(override val name: String): Pet(name)

class Dog(override val name: String): Pet(name)

class Dor(val name: String)

class Contest<T: Pet>(val vet: Vet<T>) {

//    val vet = Vet<T>()
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(animal: T, score: Int) {
        if (score >= 0) scores.put(animal, score)
    }
}

interface Retailer<out T: Pet> {
    fun sell(name: String): T
}

class CatRetailer(): Retailer<Cat> {
    override fun sell(name: String): Cat {
        println("I am a retailer!")
        println("I am selling a cat named $name!")
        return Cat(name)
    }
}

class DogRetailer(): Retailer<Dog> {
    override fun sell(name: String): Dog {
        println("I am a retailer!")
        println("I am selling a dog named $name!")
        return Dog(name)
    }
}

class Vet<in T: Pet>(){
    fun treat(t: T){
        println("Treating a pet named ${t.name}!")
    }
}

fun main() {

    val retailerOfAllPets: Retailer<Pet> = DogRetailer()
    retailerOfAllPets.sell("Fufu")

//    val newContest = Contest<Cat>()

//    newContest.vet.treat(Cat("Fluffy"))
//
//    val newVet: Vet<Pet> = Vet<Pet>()
//    newVet.treat(Cat("Pussy"))
//
//    val yetAnotherContest= Contest<Cat>(Vet<Pet>())
}