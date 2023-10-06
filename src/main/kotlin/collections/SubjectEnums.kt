// Main.kt
package collections

fun main() {
    val subjects = listOf(
        Subject("Desarrollo Movil", true),
        Subject("Creacion de Videojuegos", true),
        Subject("Integradora", true),
        Subject("History", false),
        Subject("English", true),
        Subject("Desarrollo Web", true),
        Subject("Gestion de Procesos", true),
        Subject("Negocios", false)
    )

    val engineeringSubjects = subjectList(subjects)
    println("Materias:")
    engineeringSubjects.forEach { println(it.subjectName) }
}
