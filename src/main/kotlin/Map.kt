// Learn Map
fun main(args: Array<String>) {
   // los Map se componen de clave = valor

    //Map inmutable no se puede eliminar o cambiar su contenido
    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "capitan america" to 99
    )

    println("edadSuperHeroes $edadSuperHeroes")

    val edadSuperHeroesMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "capitan america" to 99
    )

    println("edadSuperHeroesMutables $edadSuperHeroesMutables")
    // one way to add new key value
    edadSuperHeroesMutables.put("wolverine", 45)
    println("edadSuperHeroesMutables updated $edadSuperHeroesMutables")

    // another way to add new key value
    edadSuperHeroesMutables["thor"] = 30
    println("edadSuperHeroesMutables updated $edadSuperHeroesMutables")

    // obtener valor por Key
    val edadIronMan = edadSuperHeroesMutables["Ironman"]
    println("edadIronMan => $edadIronMan")

    // remove valor por key
    edadSuperHeroesMutables.remove("thor")

    println("edadSuperHeroesMutables $edadSuperHeroesMutables")


    // check all keys
    println("edadSuperHeroesMutables.keys ${edadSuperHeroesMutables.keys}")
    // check all values
    println("edadSuperHeroesMutables.values =>  ${edadSuperHeroesMutables.values}")
}