// Learn ciclo FOR
fun main(args: Array<String>) {

    val listFruits = listOf("manzana", "pera", "frambuesa", "Durazno")
    //val listFruits: List<String> = listOf("manzana", "pera", "frambuesa", "Durazno")

    println("***************** for **********************")
    for (fruta in listFruits) println("fruta: $fruta")
    // another way
    /*for (item: Int in ints) {
        // ...
    }*/
    // for with index
    for ((index, value) in listFruits.withIndex()) {
        println("the fruit at $index is $value")
    }
    println("***************** for each **********************")
    // for each cuando la función tiene { } es una función anonima
    listFruits.forEach { fruta -> println("fruta llamada: $fruta")}

    println("***************** map **********************")
    // map
    val caracteresFrutas = listFruits.map { fruta -> fruta.length }
    println(caracteresFrutas)

    println("***************** filter **********************")

    val lisFiltered = caracteresFrutas.filter { lengthFruit -> lengthFruit > 5 }

    println(lisFiltered)
}