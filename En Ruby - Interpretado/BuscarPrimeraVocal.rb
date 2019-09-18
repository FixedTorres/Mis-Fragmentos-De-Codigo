#!/usr/bin/env ruby

print("Ingrese una palabra a evaluar: ")
palabra = gets.chomp.downcase

a = palabra.index("a")
e = palabra.index("e")
i = palabra.index("i")
o = palabra.index("o")
u = palabra.index("u")

ind = [a, e, i, o, u].compact.min

puts "La primera vocal es: #{palabra[ind]}"
puts "Su indice es: #{ind}"
