#!/usr/bin/env ruby

aux = 0

print "Ingrese el número a evaluar: "
numero = gets().to_i

puts ""
print "El número es divisible por: "
1.step numero do |n|
    if numero % n == 0
      aux += 1
      print "[#{n}] "
    end
end

if aux == 2
    puts "\nEl número ingresado es primo :D"
else
    puts "\nEl número ingresado no es primo :("
end
