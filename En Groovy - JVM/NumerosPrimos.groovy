def input = new Scanner(System.in)
def cont = 0, numero, lim = 0

print("Ingrese el numero que desea evaluar: ")
numero = input.nextLong()

println()
println("Numero ingresado:\t$numero")
print("$numero es divisible por:\t")
(1..numero).each { div ->
    if(numero % div == 0) {
        print("($div) ")
        cont++
        lim++
        if(lim == 10) {
            print("\n\t\t\t")
            lim = 0
        }
    }
}
println("Fin!!")

if(cont == 2) {
    println("Si es un numero primo, tiene $cont divisores!!")
} else {
    println("No es un numero primo, tiene $cont divisores!!")
}
