package com.example.ko_logic

//  Escribe un programa que calcule el factorial de un número.

fun main() {
    val num = -1

    when {
        num == 0 -> println("El factorial de 0 es 1")
        num > 0 -> println("El factorial de $num es : ${calcFactorial(num)}")
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
