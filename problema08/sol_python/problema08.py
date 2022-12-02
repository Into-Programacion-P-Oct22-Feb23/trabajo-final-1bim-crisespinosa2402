contador = 1
repetir = 1
mensaje = "Metros\t\tYardas\t\tPulgadas\tPies\n "

print("Escriba la cantidad de metros para pode convertir:")
metro = float(input())

print(mensaje)
while contador <= metro:
    pulgadas = repetir * 39.37
    yardas = repetir * 3.28084
    pies = rep * 1.094
    print(rep,"\t\t","{:.3f}".format(pulgadas), "\t", "{:.3f}".format(yardas), "\t\t", "{:.3f}".format(pies), "\n")
    contador = contador + 1
    rep = rep +1