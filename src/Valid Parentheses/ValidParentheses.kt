package `Valid Parentheses`

import java.util.*

fun main() {

}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.reversed().forEach {
        when (it) {
            '(' -> if (stack.isNotEmpty() && stack.peek() == ')') stack.pop() else stack.push(it)
            '[' -> if (stack.isNotEmpty() && stack.peek() == ']') stack.pop() else stack.push(it)
            '{' -> if (stack.isNotEmpty() && stack.peek() == '}') stack.pop() else stack.push(it)
            else -> stack.push(it)
        }
    }

    return stack.isEmpty()
}