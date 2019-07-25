package buscarprimeravocal

fun Int.filtrar(): Int = if(this != -1) this else 45000

fun main(args: Array<String>) {
    print("Ingrese una palabra a evaluar: ")
    var palabra = readLine() as String

    val a = palabra.indexOf("a", 0, true).filtrar()
    val e = palabra.indexOf("e", 0, true).filtrar()
    val i = palabra.indexOf("i", 0, true).filtrar()
    val o = palabra.indexOf("o", 0, true).filtrar()
    val u = palabra.indexOf("u", 0, true).filtrar()

    val vocal = minOf(a, minOf(e, minOf(i, minOf(o, u))))

    println("\nLa primera vocal es: ${palabra[vocal]}")
    println("Su indice es: $vocal")
}
