package main 
 
import ( 
    "fmt" 
)

func capturar(tam uint32) []uint32 { 
    conjunto := make([]uint32, 0) 
    var sb, num uint32 
    for sb = 0; sb < tam; sb++ { 
        fmt.Printf("Ingrese el numor #%d: ", sb + 1) 
        fmt.Scanf("%d", &num) 
        conjunto = append(conjunto, num) 
    } 
    return conjunto 
} 

func sumar(conjunto []uint32, tam uint32) (uint32, uint32) { 
    var sumsub1, sumsub2, reban uint32 = 0, 0, 0 
    var sb1, sb2 uint32 

    reban = uint32(len(conjunto[0:uint32(len(conjunto) / 2)])) 
    for sb1 = 0; sb1 < reban; sb1++ { 
        sumsub1 = sumsub1 + conjunto[sb1] 
    } 
    for sb2 = reban; sb2 < tam; sb2++ { 
        sumsub2 = sumsub2 + conjunto[sb2] 
    } 
    return sumsub1, sumsub2 
} 

func main() { 
    conjunto := make([]uint32, 0) 
    var tam, sumsub1, sumsub2 uint32 

    fmt.Print("Ingrese el numero de valores del conjunto: ") 
    fmt.Scanf("%d", &tam) 

    fmt.Println() 
    conjunto = capturar(tam) 
    sumsub1, sumsub2 = sumar(conjunto, tam) 

    if sumsub1 == sumsub2 { 
        fmt.Println("La suma de los subconjuntos da el mismo resultado!") 
    } else { 
        fmt.Println("La suma de los subconjuntos no da el mismo resultado!") 
    } 
} 
