// Learn Run
fun main(args: Array<String>) {
    // scope functions
    // ejecuta una serie de operaciones, luego de declarar una variable.

    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google")}
            this
        }

    println("List moviles: $moviles")
}


