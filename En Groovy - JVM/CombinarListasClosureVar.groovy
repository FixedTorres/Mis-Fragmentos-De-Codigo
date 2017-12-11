def listUno = ["Negro", "Blanco", "Verde", "Cafe", "Gris"]
def listDos = ["Grande", "Mediano", "Chico"]

def superlist = { final lt1, final lt2 ->
    lt1.each { final lst1 -> lt2.each { final lst2 ->
        println lst1 + "-".plus(lst2)
        }
    }
}
superlist listUno, listDos
