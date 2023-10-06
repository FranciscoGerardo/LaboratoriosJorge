package classes
class Person(val name: String = "Francisco", val age: Int = 22)

fun main() {
    // Crear una instancia con valores por defecto
    val person1 = Person()

    // Crear una instancia con datos personalizados
    val person2 = Person(name = "Juanito", age = 30)

    // Imprimir los valores de ambas instancias
    println("Persona 1 - Nombre: ${person1.name}, Edad: ${person1.age}")
    println("Persona 2 - Nombre: ${person2.name}, Edad: ${person2.age}")
}
