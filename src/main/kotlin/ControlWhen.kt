fun main(args: Array<String>) {
    val nombreColor = "carmesi"

    when (nombreColor.toLowerCase()){
        "amarillo" -> {
            println("Amarillo")
        }
        "carmesi", "rojo" -> println("este color simboliza el calor")
        else -> println("color default")
    }

    val code = 305

    when (code){
        in 200..299 -> println("todo ha ido bien")
        in 400..500 -> println("algo ha fallado")
        else -> println("codigo desconocido, algo ha fallado")
    }

    val sizeShoes = 41
    val mensaje = when (sizeShoes) {
        41,43 -> "disponible"
        42,44 -> "poco stock"
        45 -> "lo siento no hay stock"
        else -> "Estos zapatos solo están en 41,42,43, 44, 45"
     }

    println("talla $sizeShoes $mensaje")
}