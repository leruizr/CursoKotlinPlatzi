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
}