// Learn Set
fun main(args: Array<String>) {
   // Set: a diferencia de las lista no pueden tener elementos repetidos.

    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println("vocalesRepetidas = $vocalesRepetidas")

    // mutables
    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println("numerosFavoritos => $numerosFavoritos")
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println("numerosFavoritos after add 5 => $numerosFavoritos")

    // remove
    // no tenemos posición, elimina por elemento
    numerosFavoritos.remove(5)
    println("numerosFavoritos $numerosFavoritos")

    // get
    // val valorDelSet = numerosFavoritos.first { numero -> numero > 2}
    // se agrega ? porque estamos usando el firstOrNull, por ende podria ser null.
    val valorDelSet: Int? =numerosFavoritos.firstOrNull { numero -> numero > 2 }
    println("valorDelSet $valorDelSet")

}