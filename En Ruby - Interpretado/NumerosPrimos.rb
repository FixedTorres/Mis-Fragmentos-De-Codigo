#!/usr/bin/env ruby

aux = 0

print "Ingrese el numero maximo a evaluar: "
numero = gets().to_i

1.step numero do |ni|
    1.step ni do |ne|
        if ni % ne == 0
            aux += 1
        end
    end
    if aux == 2
        print "#{ni} "
    end
    aux = 0
end
puts " "
