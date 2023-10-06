data class Subject(val id: Int, val name: String, val type: SubjectType)

enum class SubjectType { DEVELOPMENT, BUSINESS, OTHER }

fun main() {
    val subjects = listOf(
        Subject(1, "Desarrollo Web", SubjectType.DEVELOPMENT),
        Subject(2, "Desarrollo Movil", SubjectType.BUSINESS),
        Subject(3, "Ingles", SubjectType.OTHER),
        Subject(4, "Integradora", SubjectType.BUSINESS)
    )

    // 1. Crear dos variables de tipo Lambda para filtrar DEVELOPMENT y BUSINESS
    val developmentFilter: (Subject) -> Boolean = { it.type == SubjectType.DEVELOPMENT }
    val businessFilter: (Subject) -> Boolean = { it.type == SubjectType.BUSINESS }

    // 2. Crear una función que reciba un listado de elementos y una variable de tipo lambda para filtrar
    fun filterSubjects(subjects: List<Subject>, predicateFilter: (Subject) -> Boolean): List<Subject> {
        return subjects.filter(predicateFilter)
    }

    val developmentSubjects = filterSubjects(subjects, developmentFilter)
    val businessSubjects = filterSubjects(subjects, businessFilter)

    println("Development Subjects:")
    developmentSubjects.forEach { println("${it.id}: ${it.name}") }

    println("\nBusiness Subjects:")
    businessSubjects.forEach { println("${it.id}: ${it.name}") }

    // 3. Crear una función que utilice un map para generar un listado de tipo String que concatene el Id y name
    fun mapSubjectsToString(subjects: List<Subject>): List<String> {
        return subjects.map { "${it.id}: ${it.name}" }
    }

    val developmentSubjectsAsString = mapSubjectsToString(developmentSubjects)
    val businessSubjectsAsString = mapSubjectsToString(businessSubjects)

    println("\nDevelopment Subjects as String:")
    developmentSubjectsAsString.forEach { println(it) }

    println("\nBusiness Subjects as String:")
    businessSubjectsAsString.forEach { println(it) }
}
