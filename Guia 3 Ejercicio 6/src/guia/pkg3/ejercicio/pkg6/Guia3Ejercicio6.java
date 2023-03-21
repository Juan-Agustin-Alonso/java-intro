/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */
package guia.pkg3.ejercicio.pkg6;

import java.util.Scanner;

public class Guia3Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        boolean salida = true;
        do {
            System.out.println("MENU:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
           opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int resultado = num + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 > 0) {
                        int division = num / num2;
                        System.out.println("La división es " + division);
                    } else {
                        System.out.println("La división no es posible");
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String respuesta = leer.next();
                    respuesta = respuesta.toUpperCase();
                    if (respuesta.equals("S")) {
                        salida = false;
                    } else if (respuesta.equals("N")) {
                    } else {
                        System.out.println("La opción ingresada no es válida, volvé al menú");
                    }
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        } while (salida);  
        System.out.println("Hasta la próxima");
    }
}
