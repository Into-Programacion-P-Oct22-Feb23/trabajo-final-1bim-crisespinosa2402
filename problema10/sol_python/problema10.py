suma = 0
bandera = True
contador = 0


while bandera:
    print("Ingrese un numero:")
    numero = float(input())
    suma = suma + numero
    contador = contador + 1

    print("si no desea ingresa otro numero ingrese (s):")
    salida = input()
    if salida == "S":
        bandera = False

media = suma / contador
print("La media es: ", media)