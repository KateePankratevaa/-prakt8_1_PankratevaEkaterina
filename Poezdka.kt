import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Period
import java.time.temporal.ChronoUnit
import kotlin.Exception


class Poezdka(num1: Int)
{
    var num = num1
    var dest: String = "Москва"
    var daysl: String = "14.02.2023-22.02.2023"
    var daypr: String = "11.45"
    var timeost: Int = 0
    public constructor(num1: Int, dest1: String) : this(num1)
    {
        dest = dest1
    }
    public constructor(num1: Int, dest1: String, daysl1: String) : this(num1, dest1)
    {
        daysl = daysl1
    }
    fun NumberOfDaysOnTheRoad() {
        val razd = '-'
        var list2 = daysl.split(razd)
        val dateFormatInput1 = DateTimeFormatter.ofPattern("yyyy.MM.dd")
        val data1 = LocalDate.parse( list2[0], dateFormatInput1)
        val data2 = LocalDate.parse(list2[1], dateFormatInput1)
        val otv = ChronoUnit.DAYS.between(data1, data2) + 1
        println("$otv cуток(и) в пути")
    }

    fun Output() {
        print("Номер поезда: ")
        println(num)
        print("Пункт назначения: ")
        println(dest)
        print("Дни следования: ")
        println(daysl)
        print("Время прибытия: ")
        println(daypr)
        print("Время стоянки: ")
        println(timeost)
    }

    fun Input() {
        while(true)
        {
            try {
                println("Введите номер поезда")
                num = readLine()!!.toInt()
                while (num !in  0 ..600) {
                    println("Номер поезда в диапозоне от 1 до 500")
                    num = readLine()!!.toInt()
                }
                println("Введите пункт назначения")
                dest = readLine()!!.toString()
                println("Введите дни следования в формате dd.MM.yyyy-dd.MM.yyyy")
                daysl = readLine()!!.toString()
                while(true)
                {
                    try
                    {
                        var list = daysl.split('-')
                        val dateFormatInput1 = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                        val data1: LocalDate = LocalDate.parse( list[0], dateFormatInput1)
                        val data2: LocalDate = LocalDate.parse(list[1], dateFormatInput1)
                        var data1_string = data1.toString().replace('-', '.')
                        var data2_string = data2.toString().replace('-', '.')
                        daysl = "${data1_string}-${data2_string}"
                        break
                    }
                    catch (e: Exception)
                    {
                        println("Неправильный формат, повторите попытку ввода")
                        daysl = readLine()!!.toString()
                    }
                }
                println("Введите время прибытия в формате НН:mm")
                daypr = readLine()!!.toString()
                while(true) {
                    try {
                        while (true) {
                            var list1 = daypr.split(':')
                            var hour: Int = list1[0].toInt()
                            var min: Int = list1[1].toInt()
                            if (hour in 1..23) {
                                if (min in 1..59)
                                    break
                            } else {
                                println("Неправильный формат, повторите попытку ввода")
                                daypr = readLine()!!.toString()
                            }
                        }
                        break
                    }
                    catch (e: Exception)
                    {
                        println("Неправильный формат, повторите попытку ввода")
                        daypr = readLine()!!.toString()
                    }
                }
                println("Введите время стоянки в минутах")
                timeost = readLine()!!.toInt()
                while (timeost !in 1..180) {
                    println("Время стоянки в диапозоне от 0 до 180")
                    timeost = readLine()!!.toInt()
                }
                break
            }
            catch (e: Exception)
            {
                println("Неправильный формат, повторите попытку ввода ")
            }
        }
    }
