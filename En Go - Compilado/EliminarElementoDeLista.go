package main

import (
	"container/list"
	"fmt"
)

func main() {
	c := []int{2, 90, 89, 2, 5, 101, 90, 35, 2, 43, 89, 101, 5, 89, 90, 5}
	lista := list.New()

	var item int

	for _, v := range c {
		lista.PushBack(v)
	}

	fmt.Print("Lista actual:     [ ")
	for v := lista.Front(); v != nil; v = v.Next() {
		fmt.Printf("%d ", v.Value)
	}
	fmt.Println("]")

	print("\nIngrese el elemento a eliminar: ")
	fmt.Scanf("%d", &item)

	for v := lista.Front(); v != nil; v = v.Next() {
		if b := v.Prev(); b != nil && v.Value == item {
			lista.Remove(v)
			v = b
		} else if v.Value == item {
			b := v.Next()
			lista.Remove(v)
			v = b
		}
	}

	fmt.Print("Lista modificada: [ ")
	for v := lista.Front(); v != nil; v = v.Next() {
		fmt.Printf("%d ", v.Value)
	}
	fmt.Print("]\n")
}
