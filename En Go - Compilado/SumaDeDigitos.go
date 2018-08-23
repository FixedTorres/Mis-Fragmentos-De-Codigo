package main

import "fmt"

func main() {
  var sumDigit, extNum, numEntero int64

  fmt.Print("Ingrese un numero entero: ")
  fmt.Scanf("%d", &numEntero)

  for numEntero != 0 {
    extNum = numEntero % 10
    numEntero /= 10
    sumDigit += extNum
  }

  fmt.Println("La suma de los digitos es: ", sumDigit)
}
