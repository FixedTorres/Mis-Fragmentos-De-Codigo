import java.util.Scanner

def input = new Scanner(System.in)
def igual = 0, aux = 0, texto

print("Ingrese la palabra que desea evaluar: ")
texto = input.nextLine()

for(ind = texto.length() - 1; ind >= 0; ind--) {
    if(texto[aux] == texto[ind]) {
        igual++
    }
    aux++
}

if(texto.length() == igual) {
    println("El texto es palindromo :D")
} else {
    println("El texto no es palindromo :(")
}
