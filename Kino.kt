import java.text.SimpleDateFormat
import java.util.*
import java.time.LocalDate
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString

class Kino (_name: String) {
    public constructor(_name: String, _ctst: Double) : this(_name)
    {
    ctst = _ctst
    }
    public constructor(_name: String, _ctst: Double, _zal: Int) : this(_name, _ctst)
    {
        zal = _zal
    }
    var name = _name
    var seans: String = "12.30"
    var ctst: Double = 199.99
    var zal: Int = 7
    var zrit: Int = 100
    fun Sum()
    {
        val sum = zrit * ctst
        println("Сумма дохода от билетов со всего сеанса равна $sum")
    }
    fun StZrit()
    {
        val stzrit = ctst /  zrit
        println("Количество денег за одного человека $stzrit")
    }
    fun Input() {
        try {
            println("Сейчас в прокате есть только такие фильмы как: Аватар, Приключения Чебурашки и Три богатыря")
            println("Введите название фильма")
            name = readLine()!!.toString()
            println("Введите ваш сеанс в формате HH.MM")
            seans = readLine()!!.toString()
            while (true) {
                try {
                    while (true) {
                        var list = seans.split('.')
                        var hours: Int = list[0].toInt()
                        var min: Int = list[1].toInt()
                        if (hours in 1..23) {
                            if (min in 1..59)
                                break
                        } else {
                            println("Неправильный формат, введите заново")
                            seans = readLine()!!.toString()
                        }
                    }
                    break
                } catch (e: Exception) {
                    println("Неправильный формат, выполните ввод заново")
                    seans = readLine()!!.toString()
                }
            }
            while (true) {
                try {
                    println("Введите стоимость вашего билета")
                    ctst = readLine()!!.toDouble()
                    while (ctst < 0) {
                        println("Стоимость должна быть больше 0!")
                        ctst = readLine()!!.toDouble()
                    }
                    break
                } catch (e: Exception) {
                    println("Неверный формат, введите заново")
                    ctst = readLine()!!.toDouble()
                }
            }
            while (true) {
                try {
                    println("Введите номер вашего зала")
                    zal = readLine()!!.toInt()
                    while (zal < 0) {
                        println("Номер зала должен быть больше 0")
                        zal = readLine()!!.toInt()
                    }
                    break
                } catch (e: Exception) {
                    println("Неверный формат!")
                    zal = readLine()!!.toInt()
                }
            }
            while (true) {
                try {
                    println("Введите количество зрителей")
                    zrit = readLine()!!.toInt()
                    while (zrit <= 0 || zrit > 100) {
                        println("Количество зрителей должно находиться в диапазоне от 1 до 100")
                        zrit = readLine()!!.toInt()
                    }
                    break
                } catch (e: Exception) {
                    println("Неверный формат, введите заново")
                    zrit = readLine()!!.toInt()

                }
            }
        }
                fun Output()
                {

                }
                    print("Сейчас в прокате есть только такие фильмы как: Аватар, Приключения Чебурашки и Три богатыря")
                    print("Название фильма: ")
                    println(name)
                    print("Время сеанса: ")
                    println(seans)
                    print("Стоимость билета: ")
                    println(ctst)
                    print("Номер зала: ")
                    println(zal)
                    println("Количество зрителей")
                    println(zrit)
                }
}



