// Learn Lambdas
fun main(args: Array<String>) {
    // las lambdas son funciones anonimas.
    // puedes verlas como una caja, mientras está cerrada es una lambda, pero cuando  la abres obtienes un valor

    val myLambda : (String) -> Int  = {
        // it es el parametros que le pasamos al lambda
        //it.length
        valor -> valor.length
    }
    val lambdaExecuted: Int = myLambda("Hello world!")
    println("lambdaExecuted $lambdaExecuted")

    val saludos = listOf("Hello", "Hola", "Ciao")

    /*
        val longitudSaludos = saludos.map {
            valor -> valor.length
        }
        es lo mismo que.
        val longitudSaludos = saludos.map(myLambda)
     */
    val longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}


