package com.example.ko_logic

// Si un número es par o inpar
fun main() {
    val number = 9
   when(isOdd(number)) {
       true -> println("Es par")
       false -> println("Es inpar")
       else -> println("No es un número valido")
   }
}

fun isOdd(num: Int): Boolean {
    //  my favorite first case
    //  Busca el multiplo mas cerca al numero , resta y devuelve la diferencia , siempre positiva
    return num.mod(2) == 0

    // second case
    //return num % 2 == 0

    // third case
    //  Divide y devuelve el residuo ,puede devolver negativos
    //return num.rem(2) == 0

}