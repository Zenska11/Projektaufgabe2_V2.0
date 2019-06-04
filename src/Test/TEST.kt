package Test

fun main() {
    println("Hallo Test")

    var bewertung = -1
    var b = Song(bewertung)
    println(b.bewertung)

}

class Song (a_param : Int) {
    var bewertung = a_param
        set(value) {
            if (value < 0) field = 0
            if (value > 100) field = 100
            if (value <= 100 && value >= 0 ) field = value
        }
}