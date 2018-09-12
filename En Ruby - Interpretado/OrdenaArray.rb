#!/usr/bin/env ruby

arrs = Array.new
tmp = 0

def ordenarMayor(arrs, cantidad)
  cantidad.times { |x|
    cantidad.times { |y|
      if arrs[x] > arrs[y]
        tmp = arrs[x]
        arrs[x] = arrs[y]
        arrs[y] = tmp
      end
    }
  }
  arrs
end

def ordenarMenor(arrs, cantidad)
  cantidad.times { |x|
    cantidad.times { |y|
      if arrs[x] < arrs[y]
        tmp = arrs[y]
        arrs[y] = arrs[x]
        arrs[x] = tmp
      end
    }
  }
  arrs
end

print "Ingrese la cantidad de valores a ordenar: "
cantidad = gets().to_i

1.step cantidad do |n|
  print "Ingrese el numero #{n}: "
  numero = gets().to_i
  arrs << numero
end

puts "\n" + """Selecciones una de las siguientes opciones 
#----------------------------------------#
1) Ordenar de menor a mayor
2) Ordenar de mayor a menor
#----------------------------------------#"""
print "Opcion: "
opt = gets().to_i

case opt
when 1
  arrs_orden = ordenarMenor(arrs, cantidad)
when 2
  arrs_orden = ordenarMayor(arrs, cantidad)
end

puts "\nArray ordenado: #{arrs_orden}"
