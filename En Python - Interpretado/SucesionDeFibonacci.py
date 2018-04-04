#!/usr/bin/env python

aux, fib, init = 1, 0, 1

_INFO = """Este programa imprime la sucesion de fibonacci desde 1 hasta N, 
siendo este ultimo un numero ingresado por el usuario
"""

print(_INFO)
lim = int(input("Ingrese un numero para la sucesion de fibonacci: "))

if lim > 0:
    while init <= lim:
        print("[{0}]".format(fib), end=" ")
        aux += fib 
        fib = aux - fib
        init += 1
    print()
else:
    print("El numero debe ser mayor a cero!!")
