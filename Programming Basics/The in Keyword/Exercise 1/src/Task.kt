package theinKeyword1

import libraryHelpers2.run

fun getAlphabet(): String {

    var result = ""

    for(letter in 'a'..'z') {
        result += letter
    }

    return result
}

fun main(args: Array<String>) {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}