package main

import (
    "fmt"
    "math"
    "strings"
    "os"
    "bufio"
)

func filtrar(i int) float64 {
    if i != -1 {
        return float64(i)
    }
    return float64(45000)
}

func main() {
    input := bufio.NewScanner(os.Stdin)
	
    fmt.Print("Ingrese una palabra a evaluar: ")
    input.Scan()

    palabra := input.Text()
    palabra = strings.ToLower(palabra)

    a := filtrar(strings.Index(palabra, "a"))
    e := filtrar(strings.Index(palabra, "e"))
    i := filtrar(strings.Index(palabra, "i"))
    o := filtrar(strings.Index(palabra, "o"))
    u := filtrar(strings.Index(palabra, "u"))

    min := math.Min(a, math.Min(e, math.Min(i, math.Min(o, u))))
    ind := int(min)

    vocal := string(palabra[ind])
    fmt.Println("La primera vocal es:", vocal)
    fmt.Println("Su indice es: ", ind)
}
