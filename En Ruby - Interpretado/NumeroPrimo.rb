#!/usr/bin/env ruby

aux = 0

print "Ingrese el numero a evaluar: "
numero = gets().to_i

1.step numero do |n|
    if numero % n == 0
        aux += 1
    end
end

if aux == 2
    puts "El numero ingresado es primo :D"
else
    puts "El numero ingresado no es primo :("
end
