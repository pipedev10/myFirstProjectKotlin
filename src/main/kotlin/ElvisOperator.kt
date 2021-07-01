// Learn elvis Operator
fun main(args: Array<String>) {
    // with value null
    var nombre: String? = null
    val lengthNombre : Int = nombre?.length ?: 0
    println("lengthNombre $lengthNombre")

    // without value null
    var secondName: String? = "Felipe"
    val lengthSecondName: Int = secondName?.length ?: 0
    println("lengthSecondName $lengthSecondName")
}