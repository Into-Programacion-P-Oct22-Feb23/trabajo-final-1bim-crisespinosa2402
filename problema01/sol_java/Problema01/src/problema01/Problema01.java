/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double primerAngulo;
        double segundoAngulo;
        double tercerAngulo;
        String serie = "";
        
        System.out.println("Ingresar el primer ángulo");
        primerAngulo = entrada.nextDouble();
        System.out.println("Ingresar el segundo ángulo");
        segundoAngulo = entrada.nextDouble();
        System.out.println("Ingresar el tercer ángulo");
        tercerAngulo = entrada.nextDouble();
        
        if (primerAngulo == 90) {
            serie = serie + "Primer ángulo: Recto,";
        } else if (primerAngulo < 90) {
            serie = serie + "Primer ángulo: Acutángulo,";
        } else if (primerAngulo > 90 && primerAngulo < 180) {
            serie = serie + "Primer ángulo: Obtusángulo,";
        }
        
        if (segundoAngulo == 90) {
            serie = serie + "Segundo ángulo: Recto,";
        } else if (segundoAngulo < 90) {
            serie = serie + "Segundo ángulo: Acutángulo,";
        } else if (segundoAngulo > 90 && segundoAngulo < 180) {
            serie = serie + "Segundo ángulo: Obtusángulo,";
        }
        
        if (tercerAngulo == 90) {
            serie = serie + "Tercer ángulo: Recto,";
        } else if (tercerAngulo < 90) {
            serie = serie + "Tercer ángulo: Acutángulo,";
        } else if (tercerAngulo > 90 && tercerAngulo < 180) {
            serie = serie + "Tercer ángulo: Obtusángulo,";
        }
        
        System.out.println(serie);

    }

}
    
