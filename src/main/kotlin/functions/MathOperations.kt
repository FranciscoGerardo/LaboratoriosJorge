// MathOperations.kt

fun multiplication(x: Int, y: Int): Int {
    return x * y
}

fun division(x: Double, y: Double): Double {
    if (y == 0.0) {
        throw IllegalArgumentException("Divisor no puede ser cero")
    }
    return x / y
}
