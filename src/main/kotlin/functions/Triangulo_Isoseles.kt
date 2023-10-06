package functions
fun main() {
    val baseWidth = 9
    val height = 5

    drawIsoscelesTriangle(baseWidth, height)
}

fun drawIsoscelesTriangle(baseWidth: Int, height: Int) {
    if (baseWidth % 2 == 0) {
        println("La base debe tener un número impar de asteriscos.")
        return
    }

    val middle = baseWidth / 2 + 1

    for (i in 1..height) {
        for (j in 1..baseWidth) {
            if (j >= middle - i + 1 && j <= middle + i - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
