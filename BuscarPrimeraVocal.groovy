int filtrar(int i) {
    if(i != -1) {
        return i
    }
    45000
}

Scanner input = new Scanner(System.in)

print("Ingrese la palabra a evaluar: ")
String palabra = input.nextLine()

palabra = palabra.toLowerCase()

def a = filtrar(palabra.indexOf("a"))
def e = filtrar(palabra.indexOf("e"))
def i = filtrar(palabra.indexOf("i"))
def o = filtrar(palabra.indexOf("o"))
def u = filtrar(palabra.indexOf("u"))

def ind = Math.min(a, Math.min(e, Math.min(i, Math.min(o, u))))

println("\nLa primera vocal es: ${palabra[ind]}")
println("Su indice es: $ind")
