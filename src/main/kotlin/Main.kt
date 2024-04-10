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



}