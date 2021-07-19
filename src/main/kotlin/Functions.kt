// Learn Functions
fun main(args: Array<String>) {
    // function: a function is a code that execute it every time that call.
    // sintaxis fun name_function (parameters) and return
    val fraseAleatorio = "Never Stop learning".randomCase()
    //val fraseOrdenadaAleatorio =  randomCase(fraseAleatorio)
    //println(fraseOrdenadaAleatorio)
    //println(randomCase(fraseAleatorio))

    //printPhrase(randomCase(fraseAleatorio))
    printPhrase(fraseAleatorio)
}

/*
👇 -> fun   👇 -> name function
fun       suma(primerParameter: Int, segundoParameter: Int) : Int { <- tipo de retorno
    return primerParameter + segundoParameter -> operación
}
Unit: es el simil void no retorna nada
fun imprimeNombre(name: String){

}
*/

// creation function

// function extension
fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    //this le indica que es el mismo String que está llamando a la función
    return if (resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}

fun printPhrase(frase: String){
    println("Tu frase es: $frase")
}
/*
fun randomCase(frase: String) : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    /*if (resultadoAleatorio.rem(2) == 0){
        return frase.toUpperCase()
    }else{
        return frase.toLowerCase()
    }*/
    return if (resultadoAleatorio.rem(2) == 0){
        frase.toUpperCase()
    }else{
        frase.toLowerCase()
    }
}

*/