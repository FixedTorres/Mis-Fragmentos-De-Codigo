#!/usr/bin/env python

def filtrar(i):
    if i != -1:
        return i
    return 45000

palabra = input("ingrese una palabra a evaluar: ")

palabra = palabra.lower()

a = filtrar(palabra.find("a"))
e = filtrar(palabra.find("e"))
i = filtrar(palabra.find("i"))
o = filtrar(palabra.find("o"))
u = filtrar(palabra.find("u"))

vocal = min(a, min(e, min(i, min(o, u))))

print("\nLa primera vocal es: {}".format(palabra[vocal]))
print("Su indice es: {}".format(vocal))
