/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package guia.pkg3.ejercicio.pkg2;

import java.util.Scanner;

public class Guia3Ejercicio2 {

    public static void main(String[] args) {
        String frase;
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un frase");
        frase = leer.next();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
