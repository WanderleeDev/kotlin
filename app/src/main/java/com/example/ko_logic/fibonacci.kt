package com.example.ko_logic
//  Crea un programa que genere los primeros n números de la secuencia de Fibonacci.
fun main() {
    val maxRange = 10

    when {
        maxRange <= 1 -> println("El número ingresado debe ser mayor a 1")
        else ->  println("la secuencia fibonacci de $maxRange es ${fibonacci(maxRange)}")
    }
}

fun fibonacci(number: Int): String {
    val range = mutableListOf<Int>(0,1)

    for (i  in range.size..<number) {
        val penultimateIndex = range.elementAtOrNull(range.size  - 2)

        when {
            penultimateIndex == null -> println("No se encontro un múmero asociado al indice ${penultimateIndex}")
            else -> range.add(range.last() + penultimateIndex)
        }
    }

    return range.joinToString(" ")
}