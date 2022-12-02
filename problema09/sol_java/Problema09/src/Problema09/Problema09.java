/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author USUARIO
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int numero1 = 12;
        int numero2 = 11;
        boolean bandera = true;
        String serie = "";
        
        do {
            if (contador == 1000) {
                bandera = false;
            }
            serie = serie + numero1 + "-" + numero2 + "+";
            numero1 = numero1 + 12;
            numero2 = numero2 + 11;
            contador = contador + 1;
        } while (bandera);
        System.out.println(serie);
    }
    
}
