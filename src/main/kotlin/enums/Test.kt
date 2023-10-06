fun main() {
    val currentDay = WeekDay.Viernes // Cambia esto al día actual
    val nextDay = getNextDay(currentDay)

    println("Hoy es $currentDay")
    println("Mañana será $nextDay")
}

fun getNextDay(currentDay: WeekDay): WeekDay {
    return when (currentDay) {
        WeekDay.Lunes -> WeekDay.Lunes
        WeekDay.Martes -> WeekDay.Martes
        WeekDay.Miercoles -> WeekDay.Miercoles
        WeekDay.Jueves -> WeekDay.Jueves
        WeekDay.Viernes -> WeekDay.Viernes
        WeekDay.Sabado -> WeekDay.Sabado
        WeekDay.Domingo -> WeekDay.Domingo
    }
}
