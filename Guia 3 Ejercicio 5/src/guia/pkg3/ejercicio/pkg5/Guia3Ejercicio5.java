/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma
de los números introducidos supere el límite inicial.
 */
package guia.pkg3.ejercicio.pkg5;

import java.util.Scanner;

public class Guia3Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        System.out.println("ingrese números a sumar hasta superar el valor limite");
        int suma=0;
        do {            
           int num = leer.nextInt();
           suma = suma + num;
        } while (suma<=limite);
        }
        }
