#!/usr/bin/env ruby

tmp, fib = 1, 0

print "Ingrese el numero máximo de la Sucesión de Fibonacci: "
rango = gets().to_i

if rango > 0
  (1..rango).each {
    print "[#{fib}] "
    tmp = tmp + fib
    fib = tmp - fib
  }
  puts ""
else
  puts "El número ingresado debe ser mayor a cero!!"
end
