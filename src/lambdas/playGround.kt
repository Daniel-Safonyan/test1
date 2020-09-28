abstract class Pet(var name: String)

class Cat(name: String): Pet(name)
class Dog(name: String): Pet(name)
class Fish(name: String): Pet(name)

class Contest<T: Pet> () {
    var scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): Set<T> {
        val highScore = scores.maxBy { it.value }
        println(highScore?.key?.name)
        val winners = scores.filter { it.value == highScore?.value }.keys

        winners.forEach { println("Winner: ${it.name}") }
        return winners
    }
}

fun main() {
    val catContest = Contest<Cat>()

    val cat1 = Cat("Pepep")
    val cat2 = Cat("Ryuyp")
    val cat3 = Cat("Fifif")
    val cat4 = Cat("Fifif")

    catContest.addScore(cat1, 100)
    catContest.addScore(cat2, 100)
    catContest.addScore(cat3, 90)
    catContest.addScore(cat4, 80)

    catContest.getWinners()
}