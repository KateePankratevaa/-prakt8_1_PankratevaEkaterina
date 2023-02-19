import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

fun main()
{
    println("Введите с каким классом хотите работать(poezd/kino)")
    var choice: String = readLine()!!.toString()
    while(choice != "poezd" && choice != "kino")
    {
        println("Введите с каким классом хотите работать(poezd/kino)")
        var choice = readLine()!!.toString()
    }
    when{
        (choice == "poezdka") ->
        {
            val obj2: Poezdka = Poezdka(0)
            obj2.Input()
            obj2.Output()
            obj2.NumberOfDaysOnTheRoad()

            val obj5: Poezdka = Poezdka(2, "Москва")
            println("\n\nНомер поезда: ${obj5.num} Пункт назначения: ${obj5.dest}")

            val obj4: Poezdka = Poezdka(2, "Москва", "14.02.2023-22.02.2023")
            println("\n\nНомер поезда: ${obj4.number} Пункт назначения: ${obj4.dest} Дней в пути ${obj4.daysl}")
        }
        (choice == "kino") ->
        {
            val obj1: Kino = Kino("")
            obj1.Input()
            obj1.Output()
            obj1.StZrit()
            obj1.Sum()

            val obj2: Kino = Kino ("Аватар", 480.0)
            println("\n\nНазвание фильма: ${obj2.name} Стоимость билета: ${obj2.ctst}")

            val obj3: Kino = Kino("Аватар", 120.0)
            println("\n\nНазвание фильма: ${obj2.name}  Cтоимость билета: ${obj3.ctst}  Номер зала${obj3.zal}")
        }
    }
}
