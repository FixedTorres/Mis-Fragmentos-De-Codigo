def arrList = [4, 77, 34, 5, 12, 83, 4, 33, 5, 77, 27, 83, 5, 64, 12, 33]

Scanner input = new Scanner(System.in)

println("Lista actual: ${arrList}")

print("\nIngrese el elemento que desea eliminar: ")
def item = input.nextInt()

if(arrList.removeIf { it == item }) {
    println("Lista modificada: ${arrList}")
} else {
    println("$item no ha sido encontrado en la lista!!")
}
