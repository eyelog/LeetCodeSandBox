package `Add Binary`

fun main() {
    println(addBinary2("101110", "101011"))
}

fun addBinary2(a: String, b: String): String {

    val number0 = a.toInt(2)
    val number1 = b.toInt(2)

    val sum = number0 + number1
    return Integer.toBinaryString(sum)
}