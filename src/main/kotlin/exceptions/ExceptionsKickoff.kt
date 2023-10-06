package exceptions

fun main() {
    try {
        val texto: String? = null
        val longitud = texto!!.length // Esto generará una excepción si "texto" es nulo
        println("La longitud del texto es: $longitud")
    } catch (e: NullPointerException) {
        println("Se ha producido una excepción: El texto es nulo.")
    }
}
