clave = input("Ingrese la clave de acceso: ")

acert = 0
pos = len(clave)

for nm in range(pos):
    if pos >= 4:
        try:
            dig = float(clave[nm])
        except ValueError:
            print("La clave contiene caracteres!!")
            exit(0)

        if (dig % 2 == 0) and (nm == 3) or (nm == 4):
            acert += 1
    else:
        print("La clave debe ser de 4 digitos o mas")
        exit(0)

if acert == 2:
    print("Bienvenido a la plataforma del banco!!")
else:
    print("Lo sentimos, contraseña incorrecta!!")