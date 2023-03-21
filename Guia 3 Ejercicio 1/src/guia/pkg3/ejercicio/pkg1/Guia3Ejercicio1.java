/*
Crear un programa que dado un número determine si es par o impar.
 */
package Guia3Ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio1 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if (num%2==0) {
            System.out.println("El numero es par");
        } else {
             System.out.println("El numero es impar");
        }
                
    }
    
}