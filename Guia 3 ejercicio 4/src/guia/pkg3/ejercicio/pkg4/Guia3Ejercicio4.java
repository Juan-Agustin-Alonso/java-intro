/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package guia.pkg3.ejercicio.pkg4;

import java.util.Scanner;

public class Guia3Ejercicio4 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un frase o palabra que empiece con la letra 'A'.");
        frase = leer.nextLine();
        String letra = frase.substring(0,1);
        if (letra.equals("a")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
                
    }
    
}
