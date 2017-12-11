#!/usr/bin/env ruby

print "Ingrese un numero: "
numero = gets().to_i

if numero <= 256
  puts 2 ** numero
end
