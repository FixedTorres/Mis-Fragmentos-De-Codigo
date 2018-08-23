fun main(Args: Array<String>) {
    var sumDigit = 0L
    var numEntero: Long
    var extNum: Long

    print("Ingrese un numero entero: ")
    numEntero = readLine()!!.toLong()

    while (numEntero != 0L) {
        extNum = numEntero % 10
        numEntero /= 10
        sumDigit += extNum
    }

    println("La suma de los digitos es: $sumDigit")
}
