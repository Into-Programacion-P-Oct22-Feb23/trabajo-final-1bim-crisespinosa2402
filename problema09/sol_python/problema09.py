contador = 1
numero1 = 12

cadena = "S1 = "

print("Ingrese el numero de terminos que quiera imprimir:")
numero = int(input())

while contador <= numero:
    numero2 = numero1 - contador
    cadena = cadena + str(numero1) + "-" + str(numero2) + "+"
    numero1 = numero1 + 12
    contador = contador + 1

print(cadena)