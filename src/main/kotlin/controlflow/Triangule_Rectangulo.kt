fun main() {
    val height = 5 // Altura del triángulo

    for (i in 1..height) {
        // Asteriscos
        for (j in 1..i) {
            print("*")
        }

        // Cambio de línea para la siguiente fila
        println()
    }
}
