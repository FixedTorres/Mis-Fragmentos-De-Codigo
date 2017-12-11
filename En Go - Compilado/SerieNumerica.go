package main

import "fmt"

func main() {
    var NumInicial, NumFinal int64
    
    fmt.Print("Ingrese el valor inicial: ")
    fmt.Scanf("%d", &NumInicial)
    fmt.Print("Ingrese el valor final: ")
    fmt.Scanf("%d", &NumFinal)
    
    for i := NumInicial; i <= NumFinal; i += 2 {
        fmt.Printf("%d ", i)
    }
    fmt.Println()
}
