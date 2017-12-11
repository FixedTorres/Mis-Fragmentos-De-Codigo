#!/usr/bin/env ruby

print "Ingrese un numero: "
numero = gets().to_i

1.upto 1000 do |d|
  print "#{numero / d} >> "
end
puts " "
