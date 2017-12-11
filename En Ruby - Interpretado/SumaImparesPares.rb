#!/usr/bin/env ruby

class SumParesImpares
  def initialize(num)
    @sumPares = 0
    @sumImpares = 0
    @num = num
  end
  def sumar_pares
    1.upto @num do |p|
      if p % 2 == 0
        @sumPares += p
      end
    end
    @sumPares
  end
  def sumar_impares
    1.upto @num do |i|
      if i % 2 != 0
        @sumImpares += i
      end
    end
    @sumImpares
  end
end

print "Ingrese el numero maximo a sumar: "
num = gets().to_i

operacion = SumParesImpares.new(num)
puts "La suma de los numero pares es: #{operacion.sumar_pares}"
puts "La suma de los numero impares es: #{operacion.sumar_impares}"
