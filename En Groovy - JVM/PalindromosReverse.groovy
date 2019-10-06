def input = new Scanner(System.in)

print("Ingrese la palabra que desea evaluar: ")
def texto = input.nextLine()

def reverse = texto.toLowerCase().reverse()

if(texto.toLowerCase() == reverse) {
    println("El texto es palindromo :D")
} else {
    println("El texto no es palindromo :(")
}
