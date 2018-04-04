final String _INFO = "Este programa imprime la sucesion de" +
        "fibonacci desde 1 hasta N, \nsiendo este ultimo un numero" +
        "ingresado por el usuario\n"

Scanner input = new Scanner(System.in)
def aux = 1L, fib = 0L, lim, init = 0, prb = 0L, nrm = 0L

println(_INFO)
print("Ingrese un numero para la sucesion de fibonacci: ")
lim = input.nextLong()

if(lim > 0) {
    (1L..lim).each { print("[$fib] ")
        aux += fib
        fib = aux - fib
    }
} else {
    println("El numero debe ser mayor a cero!!")
}
println()
