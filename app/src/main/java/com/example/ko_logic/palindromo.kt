package com.example.ko_logic

fun main() {
    val str = "reconocer"

    when(isPalindromo(str)) {
        true -> println("$str es palidromo")
        false -> println("$str no es palindromo")
    }
}

fun isPalindromo(str: String): Boolean {
    return str == str.reversed()
}