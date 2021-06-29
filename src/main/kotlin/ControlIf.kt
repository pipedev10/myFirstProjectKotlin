// Learn control IF
fun main(args: Array<String>) {
    val nombre = "Felipe"
    // val nombre = "" --> ingresará al else

    // otra opción IF
    // if (nombre.isNotEmpty()) println("la variable nombre no está vacío y el largo es ${nombre.length}") else println("Error, la variable nombre está vacia")
    if (nombre.isNotEmpty()){
        println("la variable nombre no está vacío y el largo es ${nombre.length}")
    }else{
        println("Error, la variable nombre está vacia")
    }

    // normal
    // var mensaje: String
    /*
    if (nombre.length > 4){
        "tu nombre es largo"
    }else{
        "tienes un npmbre corto"
    }
    */

    // con creación y asignación de variable
    var mensaje: String = if (nombre.length > 4){
        "tu nombre es largo"
    }else{
        "tienes un npmbre corto"
    }

    // inmutable
    /*
    val mensaje: String = if (nombre.length > 4){
        "tu nombre es largo"
    }else{
        "tienes un npmbre corto"
    }
    */
    /*
    con asignación a variable
    mensaje = if (nombre.length > 4){
        "tu nombre es largo"
    }else{
        "tienes un npmbre corto"
    }
    */


    // elseif
    //var nombreDos = "" // retorna mensaje nombre está vacio
    var nombreDos = "lee" // retorna nombre corto
    var mensajeDos: String = if (nombreDos.length > 4){
        "tu nombre es largo"
    }else if(nombreDos.isEmpty()){
        "nombre está vacio"
    }else{
        "tienes un npmbre corto"
    }
    println(mensaje)
    println(mensajeDos)
}