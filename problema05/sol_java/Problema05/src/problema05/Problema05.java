/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1 = 8;
        double numero2 = -5;
        
        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Es el cuadrante 1 de las positivas");
        }
        if (numero1 < 0 && numero2 > 0) {
            System.out.println("Es el cuadrante 2 de las negativas");
        }
        if (numero1 > 0 && numero2 < 0) {
            System.out.println("Es el cuadrante 3 de las negativas");
        }
        if (numero1 < 0 && numero2 < 0) {
            System.out.println("Es el cuadrante 4 de las positivas");
        }

    }
    
}
