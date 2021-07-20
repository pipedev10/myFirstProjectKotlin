// Learn Apply
fun main(args: Array<String>) {
    // scope functions
    //apply devuelve el valor de forma automatica
    //se puede crear una funcion apply segura

    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .apply {
            removeIf {
                movil -> movil.contains("Google")
            }
        }
    println("list moviles $moviles")

    val colores1: MutableList<String>? = null

    colores1?.apply {
        // no lo muestra porque está null
        println("Nuestros colores son $this")
        println("Cantidad de colores es $size")
    }

    val colores: MutableList<String>? = mutableListOf("Verde", "amarillo", "Rojo")

    colores?.apply {
        println("Nuestros colores son $this")
        println("Cantidad de colores es $size")
    }
}


