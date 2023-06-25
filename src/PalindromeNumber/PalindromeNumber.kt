package PalindromeNumber

fun main() {
    println(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    val string = x.toString()
    return string == string.reversed()
}