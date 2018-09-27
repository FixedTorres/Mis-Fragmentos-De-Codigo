#!/usr/bin/env python
# -*- coding: utf-8 -*-

acumulado = []

valor = int(input("¿Cuantos valores desea ingresar?: "))

for xd in range(1, valor + 1):
	insert = int(input("Ingrese el valor #{0}: ".format(xd)))
	acumulado.append(insert)

def ordenar_max(acumulado):
	for xd in range(len(acumulado)):
		for m in range(len(acumulado)):
			if acumulado[xd] > acumulado[m]:
				tmp = acumulado[xd]
				acumulado[xd] = acumulado[m]
				acumulado[m] = tmp
	
	print("Lista ordenada", end=": ")
	for lt in range(len(acumulado)):
		print(acumulado[lt], end=":")
	print("Fin!!")
				
def ordenar_min(acumulado):
	for xd in range(len(acumulado)):
		for m in range(len(acumulado)):
			if acumulado[xd] < acumulado[m]:
				tmp = acumulado[m]
				acumulado[m] = acumulado[xd]
				acumulado[xd] = tmp
	
	print("Lista ordenada", end=": ")
	for lt in range(len(acumulado)):
		print(acumulado[lt], end=":")
	print("Fin!!")

print("""
\nSelecciones una de las siguientes opciones
------------------------------------------
1) Ordenar de mayor a menor
2) Ordenar de menor a mayor
------------------------------------------
""")
selec = int(input("Selecciones una opción: "))

if selec == 1:
	ordenar_max(acumulado)
elif selec == 2:
	ordenar_min(acumulado)
