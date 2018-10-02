fun main(args: Array<String>) {
    val arrs = mutableListOf<Int>(2, 90, 89, 2, 5, 101, 90, 35, 2, 43, 89, 101, 5, 89, 90, 5)
    val item: Int

    println("Lista actual: $arrs")

    print("\n¿Que elemento desea eliminar?: ")
    item = readLine().toString().toInt()

    if(arrs.removeAll { it == item }) {
        println("Lista modificada: ${arrs}")
    } else {
        println("El elemento no existe!!")
    }
}
