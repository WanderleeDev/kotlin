package com.example.ko_logic

// Implementa un programa que cuente las vocales en una cadena de texto.

fun main() {
    val word = "murcielago"
    println("La palabra $word tiene un total de ${countVocals(word)} vocales")
}

//  Convierte en array de caracteres la palabra ingresada
//  Itera el array y si encuentra una vocal aumenta el contador de vocales

fun countVocals (word: String): Int {
    val vocals = charArrayOf('a','e','i','o','u')

    var num = 0

    for (i in word.toCharArray()) {
        if (i in vocals) num++
    }

    return num
}

//  Otra forma mas declarativa

fun countVoals2(word: String): Int {
    val vocals = charArrayOf('a','e','i','o','u')

    //  itera sobre cada letra y aplica una comparación , devuelve el números de aciertos
    return word.count { it in vocals }
}