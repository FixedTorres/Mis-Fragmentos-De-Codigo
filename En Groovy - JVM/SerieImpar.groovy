import java.util.Scanner

def numInicial, numFinal, stdin
def listNum = []

stdin = new Scanner(System.in)

print("Ingrese el valor inicial: ")
numInicial = stdin.nextLong()

print("Ingrese el valor final : ")
numFinal = stdin.nextLong()

(numInicial..numFinal).each { lt -> if(lt % 2 != 0) listNum << lt * 2 }
println("Lista de numeros generada: ${listNum}")
