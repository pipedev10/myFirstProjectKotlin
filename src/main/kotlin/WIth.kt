// Learn With
fun main(args: Array<String>) {
    // scope functions
    // es otro tipo de scope function, nos permite acceder directamente a las propiedades de una varible.
    // que le pasamos como parametro, de esta forma evitamos repetir llamar a la variables.
    // usando this o it

    // example

    val colores = listOf("azul", "amarillo", "rojo")

    with(colores) {
        println("nuestros colores son $this")
        println("esta lista tiene una cantidad de colores $size")
    }

    val family = listOf("Felipe", "Isabel", "Alberto", "Matias")
    with(family) {
        println("Cual es tu grupo familiar $this")
        println("cuantas personas son en tu Familia: $size")
    }
}


