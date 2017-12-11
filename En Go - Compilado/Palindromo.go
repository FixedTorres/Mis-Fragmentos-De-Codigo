/*
    Autor:  Alfonso Orjuela <Fixed Torres>
    Fecha:  18 de Septiembre de 2017

    Palindromos en lenguaje Go
*/

package main

import (
    "fmt"
    "bufio"
    "os"
)

func main() {
	capt := bufio.NewScanner(os.Stdin)
	var igual, aux int

	fmt.Print("Ingrese la palabra a evaluar: "); capt.Scan()
    valor := capt.Text()
    
	for char := len(valor) - 1; char >= 0; char-- {
		if valor[char] == valor[aux] {
			igual++
		}
		aux++
	}

	if len(valor) == igual {
		fmt.Println("La palabra ingresada si es palindromo!! :D",)
	} else {
		fmt.Println("La palabra ingresada no es palindromo!! :(")
	}
}
