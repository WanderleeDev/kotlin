package com.example.ko_logic

//  Escribe un programa que calcule el factorial de un número.

fun main() {
    val num = 0

    when {
        num == 0 || num == 1 -> println("El factorial de $num es 1")
        num > 1 -> println("El factorial de $num es : ${calcFactorial(num)}")
        else -> println("($num) no es un valor válido")
    }
}


fun calcFactorial(num: Int): Int {
    var result = 1

    for (i in 1..num) {
        result *= i
    }
    return  result
}
