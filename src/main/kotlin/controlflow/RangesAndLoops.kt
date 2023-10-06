package controlflow

fun main() {
    val range = 1..10 // Use ".." to define a range

    for (count in range) {
        println("Common range $count")
    }

    val reverseRange = 10 downTo 1 // Use "downTo" for a reverse range

    for (count in reverseRange) {
        println("Reverse range: $count")
    }

    for (count in reverseRange step 2) {
        println("Another way to print a reverse range $count")
    }
}
