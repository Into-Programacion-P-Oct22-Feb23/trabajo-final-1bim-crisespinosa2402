/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero1;
        int numero2;
        int numero3;
        System.out.println("Ingrese el primer numero por favor");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero por favor");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el tercero numero por favor");
        numero3 = entrada.nextInt();
        
        if (numero1 == numero2 || numero1 == numero3 || numero3 == numero2) {
            System.out.println("Error");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El mayor es " + numero2);
        } else if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("El mayor es " + numero3);
        }
    }

}
