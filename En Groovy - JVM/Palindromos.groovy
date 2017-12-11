import java.util.Scanner

def input = new Scanner(System.in)
def igual = 0, aux = 0, texto

print("Ingrese la palabra que desea evaluar: ")
texto = input.nextLine()

(0..texto.length() - 1).reverse().each { ind ->
    if (texto[ind] == texto[aux]) {
        igual++
    }
    aux++
}

if(texto.length() == igual) {
    println("El texto es palindromo :D")
} else {
    println("El texto no es palindromo :(")
}
