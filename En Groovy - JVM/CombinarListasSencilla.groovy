def listUno = ["Negro", "Blanco", "Verde", "Cafe", "Gris"]
def listDos = ["Grande", "Mediano", "Chico"]

listUno.each { lst1 -> listDos.each { lst2 ->
        println(lst1 + "-".plus(lst2))
    }
}
