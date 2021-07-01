import java.lang.NullPointerException
// Learn null safety
fun main(args: Array<String>) {
    var segundoNombre : String? = "Felipe"
    println(segundoNombre?.length)
    // !! para saltar prohibición de nullable
    // los tipos "Integer!" son la forma que tiene Kotlin de avisarte que no puede
    // asegurarse de que ese código 'no' devuelve null. Como recomendación siempre
    // trátalos como nullables

    // null y try catch

    // asignar variable null
    var nombre: String? = null
    // forzar el null
    // nombre!!.length

    // devuelve null ya que con el signo ? evita que se caiga por null
    println(nombre?.length)

    // gestionar una exception
    try {
        nombre!!.length
    }catch (exception: NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error... cerrando aplicación")
    }

    // ejecutar nuestro propio catch

    try {
        throw  NullPointerException("Referencia nula")
    }catch (exception: NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error... cerrando aplicación")
    }

    // try assign variable
    val myFirstValue = 0
    val secondValue = 0
    val result: Int = try { myFirstValue / secondValue } catch (exception: Exception){ 0 }

    println("result $result")
}