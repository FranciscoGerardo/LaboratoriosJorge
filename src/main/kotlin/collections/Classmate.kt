fun main() {
    // Crear una lista mutable con los nombres de tus compañeros
    val mutableList = mutableListOf("Francisco", "Javier", "Gerardo")

    // Crear una lista no mutable a partir de la lista mutable
    val immutableList = mutableList.toList()

    // Iterar sobre los elementos de la lista no mutable e imprimirlos
    for (classmate in immutableList) {
        println(classmate)
    }
}
