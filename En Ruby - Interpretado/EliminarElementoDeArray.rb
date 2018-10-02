#!/usr/bin/env ruby

def removeItems(arrs, item)
  arrs.delete_if { |i| i == item }
  arrs
end

arrs = [2, 90, 89, 2, 5, 101, 90, 35, 2, 43, 89, 101, 5, 89, 90, 5]

puts "Lista actual: #{arrs}"

print "\nIngrese el elemento que desea eliminar: "
item = gets().chomp().to_i

puts "Lista modificada: #{removeItems(arrs, item)}"
