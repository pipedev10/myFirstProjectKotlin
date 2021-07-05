// Learn Sort List
fun main(args: Array<String>) {
   val numeroDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numeroDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendiente = numeroDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendiente)

    val ordenarPorMultiplos = numeroDeLoteria.sortedBy { numero -> numero < 50 }
    println("ordenarPorMultiplos =>  $ordenarPorMultiplos")

    val numeroAleatorios = numeroDeLoteria.shuffled()
    println("numeroAleatorios => $numeroAleatorios")

    val numeroReverse = numeroDeLoteria.reversed()
    println("numeroReverse $numeroReverse")

   // map nos permite convertir de un tipo a otro tipo

   val mensajeDeNumeros = numeroDeLoteria.map { numero -> "tu numero de loteria es $numero" }
   println("mensajeDeNumeros $mensajeDeNumeros")

 // function filter
   val numerosFiltrados = numeroDeLoteria.filter { numero -> numero > 50 }
 println("numerosFiltrados => $numerosFiltrados ")
}