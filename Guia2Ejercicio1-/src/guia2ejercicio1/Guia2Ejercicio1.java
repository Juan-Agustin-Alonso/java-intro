/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma.
 */
package guia2ejercicio1;

import java.util.Scanner;

public class Guia2Ejercicio1 {

    public static void main(String[] args) {
        int numero, numero2, resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println ("ingrese un numero");
        numero = leer.nextInt();
        System.out.println ("ingrese otro numero");
        numero2 = leer.nextInt();
        resultado = numero + numero2;
        System.out.println("El resultado es: " + resultado);
    }
    
}