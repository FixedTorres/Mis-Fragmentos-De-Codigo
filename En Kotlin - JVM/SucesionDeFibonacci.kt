package sucesionfib

fun main(arg: Array<String>){
    var numVal: Long
    var fib = 0L
    var aux = 1L

    print("Ingrese un numero para la sucesion de fibonacci: ")
    numVal = readLine()!!.toLong()

    if(numVal > 0) {
        (1 .. numVal).forEach { print("[$fib] ")
            aux += fib
            fib = aux - fib
        }
    } else {
        println("El numero debe ser mayor a cero!!")
    }
    println()
}
