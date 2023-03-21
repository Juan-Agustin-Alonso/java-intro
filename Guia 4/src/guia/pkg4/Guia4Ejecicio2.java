/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia.pkg4;

import java.util.Scanner;

public class Guia4Ejecicio2 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      boolean salir = true;
        do {            
            personas();
            System.out.println("¿Desea seguir mostrando personas?");
            String respuesta = leer.nextLine();
            if (respuesta.equals("No")) {
               salir = false;
            } else {
            }
        } while (salir);
    }
    public static void personas() {
        Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Ingrese su edad");
            int edad = leer.nextInt();
            if (edad>18) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
     }
}

