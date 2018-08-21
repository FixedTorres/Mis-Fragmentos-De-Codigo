print "Ingrese la palabra que desea evaluar: "
texto = gets().chomp("\n")

textrevers = texto.reverse

if textrevers.downcase.eql?(texto.downcase)
  puts "La palabra ingresada si es palíndromo"
else
  puts "La palabra ingresada no es palíndromo"
end
