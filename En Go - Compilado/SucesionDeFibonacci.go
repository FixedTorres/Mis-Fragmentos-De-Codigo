package main

import "fmt"

const INFO = "Este programa imprime la sucesion de fibonacci desde 1 hasta N," + 
"\nsiendo este ultimo un numero ingresado por el usuario\n"

func main(){
	var aux, fib int64 = 1, 0
	var lim, init int64
	
	fmt.Println(INFO)
	fmt.Print("Ingrese un numero para la sucesion de fibonacci: ")
	fmt.Scanf("%d", &lim)
	
	if lim > 0 {
	    for init = 1; init <= lim; init++ {
		    fmt.Printf("[%d] ",fib)
		    aux += fib
		    fib = aux - fib
	    }
	} else {
	    fmt.Println("El numero debe ser mayor a cero!!")
	}
	fmt.Println()
}
