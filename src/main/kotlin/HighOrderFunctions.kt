// Learn High Order Functions
fun main(args: Array<String>) {
    val largoValorInitial = superFuncion(valorInitial = "Hello", block = { valor ->
        valor.length
    })

    println("largoValorInitial $largoValorInitial")

    val lambda:() -> String = functionInception("Felipe")
    val valorLambda: String = lambda()
    println(valorLambda)


    //Invoca la función de orden superior pasando dos valores enteros y el argumento de la función ::suma
    //:: es la notación que hace referencia a una función por su nombre en Kotlin.
    val sumResult = calculate(4, 5, ::sum)

    //Invoca la función de orden superior pasando un lambda como argumento de función.
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}

// block para ejecutar un lambda
fun superFuncion(valorInitial: String, block: (String) -> Int ) : Int {
    return block(valorInitial)
}

fun functionInception(nombre: String) : () -> String{
    return {
        "Helllo from lambda $nombre"
    }
}

/*--------------TOMANDO FUNCIONES COMO PARÁMETROS-----------------*/

//Declarando un función de orden superior. Toma dos parámetros, x e y.
//Adicionalmente toma otra función como parámetro.
//Los parámetros de operación y el tipo de retorno también se definen en la declaración
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    //La función de orden superior devuelve el resultado de la invocación de la operación con los argumentos proporcionados
    return operation(x, y)
}

//Declara una función que coincide con la firma de la operación
fun sum(x: Int, y: Int) = x + y

