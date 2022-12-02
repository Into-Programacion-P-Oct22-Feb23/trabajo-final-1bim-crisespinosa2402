/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreEmpleado;
        int tipoEmpleado;
        double numeroHoras;
        double extraHoras = 0;
        double cuotaHora;
        double sueldoPagar;
        System.out.println(" Ingrese el nombre del empleado");
        nombreEmpleado = entrada.nextLine();
        System.out.println(" Ingrese el tipo de empleado");
        tipoEmpleado = entrada.nextInt();
        System.out.println(" Ingrese el número de horas trabajadas por el empleado");
        numeroHoras = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora del empleado");
        cuotaHora = entrada.nextDouble();
        sueldoPagar = numeroHoras * cuotaHora;
        
        while (numeroHoras > 40) {
            if (tipoEmpleado == 1) {
                cuotaHora = cuotaHora * 1.5;
                numeroHoras = numeroHoras - 40;
                extraHoras = numeroHoras * cuotaHora;
            }
            if (tipoEmpleado == 2) {
                cuotaHora = cuotaHora * 2;
                numeroHoras = numeroHoras - 40;
                extraHoras = numeroHoras * cuotaHora;
            }
            if (tipoEmpleado == 3) {
                cuotaHora = cuotaHora * 2.5;
                numeroHoras = numeroHoras - 40;
                extraHoras = numeroHoras * cuotaHora;
            }
            if (tipoEmpleado == 4) {
                cuotaHora = cuotaHora * 3;
                numeroHoras = numeroHoras - 40;
                extraHoras = numeroHoras * cuotaHora;
            }
        }
        sueldoPagar = sueldoPagar + extraHoras;
        System.out.printf(" El sueldo es %.2f", sueldoPagar);
    }

}
