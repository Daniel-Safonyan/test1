package collections

fun main() {

    //creating a shopping list
    val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("Original Shopping List = $mShoppingList")

    //adding coffee to the shopping list
    mShoppingList.add("Coffee")
    println("New Shopping List = $mShoppingList, it includes ${mShoppingList.last()}!")

    // Creating a new list and concatinating it with the original list
    val moreShopping = listOf("Towels", "Paper", "Razor")
    mShoppingList.addAll(moreShopping)
    println("New Shopping List = $mShoppingList!")

    //Looks like we have to buy razor blades as well as the razor...
    if(mShoppingList.contains("Razor")) mShoppingList.add(mShoppingList.indexOf("Razor") + 1,"Blades")
    println("New Shopping List = $mShoppingList!")

    //Now, I want to copy the list for my Mom,
    // the most important thing is the Razor,
    // so I should copy a reversed list

    val listForMom = mShoppingList.reversed().toMutableList()
    println("Mom's list = $listForMom")

    //Looks like my mom decided to sort the list
    listForMom.sort()
    println("Mom's list = $listForMom")

    if (listForMom.first() == "Blades") println("Good, Blades are still first!") else println("Hope she gets blades...")
}