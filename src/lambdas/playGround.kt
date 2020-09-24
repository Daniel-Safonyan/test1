package lambdas

typealias Fuckers = Double

fun toConvert(x: Fuckers): Fuckers {
    return x * 2.2
}

val conversion: (Fuckers) -> Fuckers = { it * 2.2}

fun conversionWLambda(x: Fuckers, converter: (Fuckers) -> Fuckers): Fuckers{
//    val conversionValue = converter(x)
    return converter(x)
}

fun main() {

    val elResulto = toConvert(90.0)
    val segundoResulto = conversionWLambda(80.0, conversion)

    println("$elResulto = $segundoResulto")

}