// Learn Also
fun main(args: Array<String>) {
    // scope functions
    // apply y also devuelve el objeto contexto directamente.
    //let, run, y with retorna el último valor de la lambda.
    // La Función also
    //La función also es otra función de alcance, cuyo objetivo es permitirte añadir acciones adicionales sobre un objeto, a través de una lambda regular como parámetro.
    //Su uso se traduce a «y también hacer lo siguiente con el objeto».
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").also{
        lista -> println("el valor original de la list es $lista")
    }.asReversed()
    println("moviles $moviles")
}


