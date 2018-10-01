#!/usr/bin/env python

def removeItems(lst, item):
    for i in lst:
        if i == item:
            lst.remove(item)
    return lst

lst = [2, 90, 89, 2, 5, 101, 90, 35, 2, 43, 89, 101, 5, 89, 90, 5]

print("Lista actual: {}".format(lst))

item = int(input("\nIngrese el elemento que desea eliminar: "))

print("Lista modificada: {}".format(removeItems(lst, item)))
