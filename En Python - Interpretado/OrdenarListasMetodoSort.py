#!/usr/bin/env python
# -*- coding: utf-8 -*-

acumulado = []

valor = int(input("¿Cuantos valores desea ingresar?: "))

for xd in range(1, valor + 1):
    insert = int(input("Ingrese el valor #{0}: ".format(xd)))
    acumulado.append(insert)

print("""
\nSelecciones una de las siguientes opciones
------------------------------------------
1) Ordenar de mayor a menor
2) Ordenar de menor a mayor
------------------------------------------
""")
selec = int(input("Selecciones una opción: "))

if selec == 1:
    acumulado.sort(reverse = True)
    print("\nLista ordenada: {}".format(acumulado))
elif selec == 2:
    acumulado.sort()
    print("\nLista ordenada: {}".format(acumulado))
