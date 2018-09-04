texto = input("Ingrese una palabra: ")
rever = texto[::-1]

if texto == rever:
    print("La palabra ingresada si es palindromo!!")
else:
    print("La palabra ingresada no es palindromo!!")
