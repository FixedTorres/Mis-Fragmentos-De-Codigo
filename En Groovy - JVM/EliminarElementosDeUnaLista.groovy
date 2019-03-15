def removeItems(List<Integer> lista, Integer item) {
    while(lista.contains(item)) {
        lista.removeElement(item)
    }
    lista
}

def lista = [2, 90, 89, 2, 5, 101, 90, 35, 2, 89, 101, 5, 89]

Scanner input = new Scanner(System.in)

println("Lista actual: ${lista}")

print("\nIngrese el elemento que desea eliminar: ")
def item = input.nextInt()

println("Lista modificada: ${removeItems(lista, item)}")
