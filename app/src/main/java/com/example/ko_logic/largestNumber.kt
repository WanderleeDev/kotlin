package com.example.ko_logic

//  Crea una función que encuentre el número más grande en una lista de enteros.
fun main () {
    val numbers = intArrayOf(8, 15, -3, 22, 0,1, 100, -25, 42, 17)

    println("El número mayor de la lista dada ${findLargestNumber(numbers)}")
}

fun findLargestNumber(numbers: IntArray): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacia")
    }

   return numbers.reduce { curr, prev -> Math.max(curr, prev) }
}