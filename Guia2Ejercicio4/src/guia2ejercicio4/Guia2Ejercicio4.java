/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2ejercicio4;

import java.util.Scanner;

public class Guia2Ejercicio4 {

    public static void main(String[] args) {
        int C, F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados");
        C = leer.nextInt();
        F = 32 + (9 * C / 5);
        System.out.println("La convercion en grados Fahrenheit es " + F);    
    }
    
}
