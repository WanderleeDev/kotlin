package com.example.ko_logic

//  Escribe una función que determine si un año es bisiesto o no.

// Es bisiesto si divisible por 4.
//  No es divisible por 100, a menos que también sea divisible por 400.

fun main() {
    leapYear(1900)
}

fun leapYear(year: Int): Unit {
    when {
        (year.rem(4) == 0 && year.rem(100) != 0) ||
        year.rem(400) == 0 -> println("$year : Es año bisiesto")
        else -> println("$year : No es año bisiesto")
    }
}

