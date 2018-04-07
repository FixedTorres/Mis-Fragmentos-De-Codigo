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

    for (ind in texto.length - 1 downTo 0) {
        when { texto[ind] == texto[aux] -> igual++ }
        aux++
    }

    when (igual) {
        texto.length -> println("$texto es palindromo :D")
        else -> println("$texto no es palindromo :(")
    }
}
