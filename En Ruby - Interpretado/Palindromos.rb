print "Ingrese la palabra que desea evaluar: "
texto = gets().chomp("\n")

igual, aux = 0, texto.length - 1

0.step texto.length - 1 do |n|
  if texto[n].downcase == texto[aux].downcase
    igual += 1
  end
  aux -= 1
end

if texto.length == igual
  puts "La palabra ingresada si es palíndromo"
else
  puts "La palabra ingresada no es palíndromo"
end
