#!/usr/bin/env python

numero = int(input("Ingrese un numero a evaluar: "))

cont = 0

print()
print("{0} es divisible por".format(numero), end=": ")
for n in range(1, numero+1):
    if numero % n == 0:
        print(n, end=" - ")
        cont += 1
print("Fin")

if cont == 2:
    print("El numero ingresado si es primo, tiene {0} divisores".format(cont))
else:
    print("El numero ingresado no es primo, tiene {0} divisores".format(cont))
