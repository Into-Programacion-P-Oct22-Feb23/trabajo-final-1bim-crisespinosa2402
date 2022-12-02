/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int cantidad;
        double precio;
        double subtotal;
        double total = 0;
        double descuento = 0;
        
        System.out.println("Ingrese la cantidad de trajes comprados por favor");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese la el precio del traje comprado por favor");
        precio = entrada.nextDouble();
        subtotal = precio * cantidad;
        
        if (cantidad == 1) {
            descuento = (subtotal * 10) / 100;
            total = subtotal - descuento;
        }
        
        if (cantidad == 2) {
            descuento = (subtotal * 25) / 100;
            total = subtotal - descuento;
        }
        
        if (cantidad == 3) {
            descuento = (subtotal * 40) / 100;
            total = subtotal - descuento;
        }
        
        if (cantidad > 3) {
            descuento = (subtotal * 50) / 100;
            total = subtotal - descuento;
        }
        
        System.out.println("El subtotal de la venta es :" + subtotal);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El precio total es: " + total);
    }

}
