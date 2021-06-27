// CONSTANTE
const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)

    // variable de lectura
    val nombre = "Felipe"
    // no es posible modificar una constante
    //nombre = "Luis"
    println("nombre $nombre")
    println("CONSTANTE $PI")

    // Type of data
    // Boolean
    val boolean : Boolean = true
    //LONG -> a lot of number of add in the last L example: 9L
    val numberLong: Long = 3L
    // DOUBLE
    val double: Double = 2.7182
    // FLOAT
    val float: Float = 1.1f

    // when you assign value to variable you can use different functionalities
    val firstValue = 20
    //firstValue.and()
    //firstValue.compareTo()
    val secondValue = 10
    var thirdValue = firstValue.minus(secondValue)
    println("thirdValue 1 : $thirdValue")
    thirdValue = firstValue - secondValue
    println("thirdValue 2 :  $thirdValue")

    // characters
    val apellido = "Carrasco"
    val name  = "Felipe"
    // concatenación una manera
    var fullName = name + apellido
    println("fullname 1: $fullName")
    // concatenación segunda manera
    fullName = "my name is $name and my lastname $apellido"
    println("fullname 2: $fullName")
}