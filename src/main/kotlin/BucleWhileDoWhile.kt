// Learn bucle while - do while
fun main(args: Array<String>) {
    var contador = 10

    // se ejecuta mientras se cumpla condición
    while (contador > 0){
        println("el valor de contador es $contador")
        contador--
    }

    // se ejecuta al menos una vez y luego verifica la condición

    do {
        println("Generando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("el numero generado $numeroAleatorio")
    }while (numeroAleatorio > 50)
}