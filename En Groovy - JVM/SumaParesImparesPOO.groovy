class sumaParesImpares {
    def sumPar = 0, sumImpar = 0, num

    def SumPares = { num -> (1..num).each { sm ->
        if (sm % 2 == 0) { sumPar += sm } }
        println("La suma de los numeros pares es: ${sumPar}")
    }

    def SumImpares = { num -> (1..num).each { sm ->
        if (sm % 2 != 0) { sumImpar += sm } }
        println("La suma de los numeros impares es: ${sumImpar}")
    }
}

def num, stdin
def SumParImpar = new sumaParesImpares()

stdin = new Scanner(System.in)
print("Ingrese un numero entero: ")
num = stdin.nextLong()

SumParImpar.sumImpares num
SumParImpar.sumPares num
