extNum, sumDigit, numEntero = 0, 0, 0

print "Ingrese un numero entero: "
numEntero = gets().to_i

while numEntero != 0
  extNum = numEntero % 10
  numEntero /= 10
  sumDigit += extNum
end

puts "La suma de los digitos es: #{sumDigit}"
