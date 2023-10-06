// SubjectList.kt
package collections

fun subjectList(subjects: List<Subject>): List<Subject> {
    return subjects.filter { it.engineering }
}
