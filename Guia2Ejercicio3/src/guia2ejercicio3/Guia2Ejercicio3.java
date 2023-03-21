/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia2ejercicio3;

import java.util.Scanner;

public class Guia2Ejercicio3 {


    public static void main(String[] args) {
        String frase, fraseMayusculas, fraseMinusculas;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        fraseMayusculas=frase.toUpperCase();
        fraseMinusculas=frase.toLowerCase();
        System.out.println("la frase en mayusculas es " + fraseMayusculas);
         System.out.println("la frase en minusculas es " + fraseMinusculas);
        
    }
      }
