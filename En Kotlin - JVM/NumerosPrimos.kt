/*
    Autor:  Fixed Torres
    Descp:  Evaluar si un numero es primo o no
 */
package numeroprimo

fun main(arg: Array<String>) {
    var NumPrimo: Int?
    var Cont = 0
    var Lim = 0

    print("Por favor, ingrese el numero a evaluar: ")
    NumPrimo = readLine()?.toIntOrNull()

    println()
    println("Numero ingresado:\t$NumPrimo")
    print("Es divisible por:\t")
    (1 .. NumPrimo!!).forEach { div ->
        if(NumPrimo % div == 0) {
            print("$div ")
            Cont++
            Lim++
            if(Lim == 10) {
                print("\n\t\t\t")
                Lim = 0
            }
        }
    }
    println("Fin!!")

    when(Cont) {
        2 -> println("Si es un numero primo, tiene $Cont divisores")
        else -> println("No es un numero primo, tiene $Cont divisores")
    }
}
