class sumParesImpares:
    def __init__(self, num):
        self.num = num
        self.sumPares = 0
        self.sumImpares = 0
    def sumsPares(self):
        for sm in range(1, self.num + 1):
            if sm % 2 == 0:
                self.sumPares += sm
        return self.sumPares
    def sumsImpares(self):
        for sm in range(1, self.num + 1):
            if sm % 2 != 0:
                self.sumImpares += sm
        return self.sumImpares

num = int(input("Ingrese un numero entero: "))
operacion = sumParesImpares(num)

print("La suma de los numeros pares es:   {0}".format(operacion.sumsPares()))
print("La suma de los numeros impares es: {0}".format(operacion.sumsImpares()))