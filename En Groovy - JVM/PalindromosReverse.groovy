def input = new Scanner(System.in)
def texto

print("Ingrese la palabra que desea evaluar: ")
texto = input.nextLine()

def revers = texto.reverse()

if(texto == revers) {
    println("El texto es palindromo :D")
} else {
    println("El texto no es palindromo :(")
}
