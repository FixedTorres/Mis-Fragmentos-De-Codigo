/*
*    Autor:  Fixed Torres
*    Descp:  Evaluar si una palabra o frase es o no es palindromo.
*/

package palindromos

fun main(Args: Array<String>) {
    var (igual, aux) = Pair(0, 0)
    var texto: String

    print("Ingrese la palabra que desea evaluar: ")
    texto = readLine() as String

    var reverse = texto.reversed()
    if(texto == reverse) {
        println("$texto es palindromo!!")
    } else {
        println("$texto no es palindromo!!")
    }
}
