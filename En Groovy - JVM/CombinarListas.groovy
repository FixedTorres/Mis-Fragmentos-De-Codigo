def listUno = ["Negro", "Blanco", "Verde", "Cafe", "Gris"]
def listDos = ["Grande", "Mediano", "Chico"]
def listComb = []

listUno.each { lst1 -> listDos.each { lst2 ->
        listComb << lst1 + "-".plus(lst2)
    }
}

listComb.each { lstc -> println(lstc) }

