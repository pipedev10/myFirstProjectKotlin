// Learn Let
fun main(args: Array<String>) {
    // scope functions
    // es un tipo de función que nos permite realizar operaciones de manera dinamica y una sintaxis mas concisa.

    var nombre: String? = null
    nombre?.let {
        valor -> println("el nombre no es nuloo, es $nombre")
    }
    nombre = "Felipe"
    nombre?.let {
            valor -> println("el nombre no es nuloo, es $nombre")
    }

    var apellido: String? = null
    apellido?.let {
        value -> println("Apellido no es nulo, es $apellido")
    }
    apellido = "Carrasco"
    apellido?.let {
        value -> println("Apellido no es nulo, es $apellido")
    }
}


