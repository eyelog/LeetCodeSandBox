package longestsubstring

fun main() {

    println(getLongestSubstring("dvdf"))
    println(getLongestSubstring2("dvdf"))
}

fun getLongestSubstring2(s: String): Int {
    var outData = ""



    return outData.length
}

fun getLongestSubstring(s: String): Int {

    var outData = ""
    var collectionData = if (s.isNotEmpty()) s[0].toString() else ""

    s.forEach {
        if (collectionData.contains(it)){
            if (outData.length <= collectionData.length){
                outData = collectionData
            }
            collectionData = it.toString()
        } else {
            collectionData += it
        }
    }

    if (outData.length <= collectionData.length){
        outData = collectionData
    }

    return outData.length
}
