package `Add Binary`

fun main() {
    println(addBinary("101110", "101011"))
}

fun addBinary(a: String, b: String): String {
    val sb = StringBuilder()

    var i = a.length - 1
    var j = b.length - 1

    println("i = $i, j = $j")

    var carry = 0

    while (i >= 0 || j >= 0) {

        var sum = carry

        println("presum = $sum")

        if (j >= 0) {
            println("b[j] = ${b[j]}")
            sum += b[j--] - '0'
        }
        if (i >= 0) {
            println("a[i] = ${a[i]}")
            sum += a[i--] - '0'
        }

        println("postsum = $sum")

        sb.append(sum % 2)

        println("sb = $sb")
        println("        ")

        carry = sum / 2
    }

    if (carry != 0) sb.append(carry)
    return sb.reverse().toString()
}
