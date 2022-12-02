/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aysanchez6
 */
public class problema07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int suma = 0;
        int limite = 1;
        while (limite <= 5) {
            System.out.println("Ingrese numero pares");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                suma = suma + numero;
            } else {
                if (numero % 2 == 1) {
                    System.out.println("erro en el numero ingresado");
                }
            }

            limite = limite + 1;

        }
        System.out.println("la suma de los numero pares es:" + suma);
    }
}
