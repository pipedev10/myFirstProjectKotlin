// Learn List
fun main(args: Array<String>) {
    // list mutable and inmutable
    val listName = listOf("Felipe", "Luis", "Enrique")
    println(listName)
    // es una lista inmutable
    //listName.remove

    val listEmtpty = mutableListOf<String>()
    println(listEmtpty)

    listEmtpty.add("Felipe")
    println(listEmtpty)

    // get
    val valueUsingGet = listEmtpty.get(0)
    // operado indexado
    val valueUsingOperatorIndexed = listEmtpty[0]
    println("value using get => $valueUsingGet")
    println("value using operator indexed => $valueUsingOperatorIndexed")

    // obtener el primer valor
    val primerValor: String? = listName.firstOrNull()
    println("primerValor => $primerValor")

    listEmtpty.removeAt(0)
    println("listEmtpty updated => $listEmtpty")

    listEmtpty.add("Alberto")
    listEmtpty.add("Luis")
    listEmtpty.removeIf{ caracteres -> caracteres.length > 4}
    println("list Empty delete by filter => $listEmtpty")

    // Array
    val myArray = arrayOf(1,2,3,4)
    println("my array =>  $myArray")
    println("array como list ${myArray.toList()}")
}