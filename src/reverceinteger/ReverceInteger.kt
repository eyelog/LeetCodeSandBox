package reverceinteger

import kotlin.math.abs

/*
* Given a signed 32-bit integer x, return x with its digits reversed.
*  If reversing x causes the value to go outside the signed 32-bit integer range
*  [-231, 231 - 1], then return 0.
* Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
* Example:
* Input: x = 123
* Output: 321
*
*
* */

fun main() {

    println(getReverseInteger(-2147483648))
}

private fun getReverseInteger(x: Int): Int {
    var outData = 0
    val st = abs(x.toLong()).toString().reversed()
    if (st.toLong() <= Int.MAX_VALUE) {
        outData = if (x < 0) {
            -st.toInt()
        } else {
            st.toInt()
        }
    }

    return outData
}
