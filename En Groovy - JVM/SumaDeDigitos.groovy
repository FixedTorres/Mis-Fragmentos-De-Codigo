Long sumDigit = 0, numEntero, extNum
def input = new Scanner(System.in)

print("Ingrese un numero entero: ")
numEntero = input.nextLong()

while(numEntero != 0) {
    extNum = numEntero % 10
    numEntero /= 10
    sumDigit += extNum
}

println("La suma de los digitos es: $sumDigit")
