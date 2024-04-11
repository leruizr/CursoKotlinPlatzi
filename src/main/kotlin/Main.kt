fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    // Ejercicio if else.

    val nombre = "Luis"

    if (nombre.isNotEmpty()){
        println("El largo de nuestra variable nombre es ${nombre.length}")

    } else {
        println("Error, la variable esta vacia")
    }

    // Ejercicio estructuras de control con when.

    val code = 501

    // Crear una instancia de EstructurasControl
    val estructurasControl = EstructurasControl()

    // Llamar al método analizarCodigo de EstructurasControl
    estructurasControl.analizarCodigo(code)

    //Uso del while

    var contador = 10
    while (contador > 0){
        println("el valor del contador es $contador")
        contador--
    }

    //Uso del do while

    do {
        println("Generando numero aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while(numeroAleatorio > 50)

    //Uso del for

    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comer una fruta llamada $fruta")

    //Uso del for each

    listaDeFrutas.forEach { fruta -> println("Mañana voy a comer una fruta nueva llamada $fruta") }

    //Uso del try catch

    var alias : String? = null
    try {
        alias!!.length

    } catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error.. Cerrando aplicación")
    }

    val primerValor = 10
    val segundoValor = 0

    val resultado : Int = try { primerValor / segundoValor } catch  (exception: Exception) { 0 }
    print(resultado)

    println(" ")

    //Usando Elvis operador

    println("Practicando operador Elvis")
    val m: String? = null
    val l: Int = if (m != null) m.length else -1
    println(l)

    //Con el operador Elvis expresamos
    // lo mismo que en la línea anterior
    val c = m?.length ?: -1
    println(c)

    // Usando Listas

    val numerosDeLoteria = listOf(11, 22, 33, 55, 44, 88, 66, 77)

    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosPares = numerosDeLoteria.filter { it % 2 == 0 }
    println(numerosPares) // Solo imprimirá los números pares de la lista original

    val numerosDuplicados = numerosDeLoteria.map { it * 2 }
    println(numerosDuplicados) // Cada número será duplicado en la nueva lista

    val sumaTotal = numerosDeLoteria.reduce { acc, numero -> acc + numero }
    println(sumaTotal) // Imprime la suma de todos los números en la lista

    val porDecenas = numerosDeLoteria.groupBy { it / 10 }
    println(porDecenas) // Agrupa los números por decenas (11 y 22 en un grupo, 33 y 44 en otro, etc.)

    val (pares, impares) = numerosDeLoteria.partition { it % 2 == 0 }
    println(pares)
    println(impares)

    val masNumeros = numerosDeLoteria + listOf(99, 100)
    println(masNumeros)

    val numerosReversed = numerosDeLoteria.reversed()
    println(numerosReversed) // Imprime la lista en orden inverso

    // Usando Mapas

    //mapa inmutable
    var edadHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to  23,
        "Capitan America" to 99
    )
    println(edadHeroes)

    //mapa mutable
    val edadHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to  23,
        "Capitan America" to 99
    )
    println(edadHeroesMutable)

    //agregamos elemento
    edadHeroesMutable.put("Wolverine", 45)
    println(edadHeroesMutable)

    edadHeroesMutable["Storm"] = 30
    println(edadHeroesMutable)

    //podemos hacer get a la lista mutable o imutable
    val edadIronman = edadHeroes["Ironman"]
    println(edadIronman)

    //eliminar
    edadHeroesMutable.remove("Wolverine")
    println(edadHeroesMutable)

    //vemos llaves
    println(edadHeroesMutable.keys)

    //vemos valores
    println(edadHeroesMutable.values)


}