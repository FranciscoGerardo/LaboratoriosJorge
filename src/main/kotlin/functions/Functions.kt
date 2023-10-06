package functions
import java.time.LocalDate
import multiplication
import division


fun printName(name: String) {
    println("This is: $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun printPerson(
    name: String,
    email: String = "",
    birthDate: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and birth date is $birthDate")
}

fun main() {
    val unit = printName(name = "Paquito")
    println("Unit is $unit")

    val result = addition(x = 1, y = 2)
    println("Result is $result")

    printPerson(name = "Paquito", email = "paquito@gmail.com", birthDate = LocalDate.parse("2000-01-01"))

    val subtractionResult = topLevelSubtraction(5, 4)
    println("Subtraction result is $subtractionResult")

    val multiplicationResult = multiplication(3, 4)
    println("Multiplication result is $multiplicationResult")

    try {
        val divisionResult = division(10.0, 2.0)
        println("Division result is $divisionResult")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
