// Learn Type parameters functions
fun main(args: Array<String>) {

    // parametros nombrados nombre = "Felipe"
    imprimirNombre(nombre = "Felipe",segundoNombre = "luis", apellido = "Carrasco")
}


// parameter for default segundoNombre = ""
fun imprimirNombre(nombre: String, segundoNombre: String = "",  apellido: String){
    println("Mi nombre completo es: $nombre $segundoNombre $apellido")
}

