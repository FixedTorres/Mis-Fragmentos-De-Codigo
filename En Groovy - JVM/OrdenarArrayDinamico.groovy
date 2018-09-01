def input = new Scanner(System.in)
def listNums = []
def tmp = 0

def ordenarMayor(listNum, cant) {
    (0..cant - 1).each { x ->
        (0..cant - 1).each { y ->
            if(listNum[x] > listNum[y]) {
                tmp = listNum[x]
                listNum[x] = listNum[y]
                listNum[y] = tmp
            }
        }
    }
    println("Array ordenado: ${listNum}")
}

def ordenarMenor(listNum, cant) {
    (0..cant - 1).each { x ->
        (0..cant - 1).each { y ->
            if(listNum[x] < listNum[y]) {
                tmp = listNum[y]
                listNum[y] = listNum[x]
                listNum[x] = tmp
            }
        }
    }
    println("Array ordenado: ${listNum}")
}

print("Ingrese en el numero de valores a ordenar: ")
def val = input.nextInt()

(1..val).each {
    print("Ingrese el elemento #$it: ")
    item = input.nextInt()
    listNums << item
}

println("""
Selecciones una de las siguientes opciones:
-------------------------------------------
1) Ordenar de mayor a menor
2) Ordenar de menor a mayor
-------------------------------------------""")
print("Selecciones una opcion: ")
def opt = input.nextInt()

switch (opt) {
    case 1:
        ordenarMayor(listNums, val)
        break
    case 2:
        ordenarMenor(listNums, val)
        break
    default:
        println("No valido!")
}
