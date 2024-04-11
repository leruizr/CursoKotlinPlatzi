class EstructurasControl {

    fun analizarCodigo(code: Int) {
        when (code) {
            in 200..299 -> println("Todo ha ido bien")
            in 400..500 -> println("Algo ha fallado")
            else -> println("Código desconocido, algo ha fallado")
        }
    }

}
