def input = new Scanner(System.in)

print("Ingrese el numero inicial: ")
long NumInicial = input.nextLong()

print("Ingrese el numero final: ")
long NumFinal = input.nextLong()

(NumInicial ..  NumFinal).step(2).each { it -> print("${it} ") }
println()
