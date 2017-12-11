package main

import "fmt"

type sumParImpar struct {
	sumPar, sumImpar int64
}

func (sums *sumParImpar) sumarPar(num int64) {
	var sm int64
	for sm = 1; sm <= num; sm++ {
		if sm % 2 == 0 {
			sums.sumPar += sm
		}
	}
}

func (sums *sumParImpar) sumarImpar(num int64) {
	var sm int64
	for sm = 1; sm <= num; sm++ {
		if sm % 2 != 0 {
			sums.sumImpar += sm
		}
	}
}

func main() {
	var num int64
	var sumNums = sumParImpar{}

	fmt.Print("Ingrese un numero entero: ")
	fmt.Scanf("%d", &num)

	sumNums.sumarPar(num)
	sumNums.sumarImpar(num)

	fmt.Println("La suma de los numeros pares es:   ", sumNums.sumPar)
	fmt.Println("La suma de los numeros impares es: ", sumNums.sumImpar)
}