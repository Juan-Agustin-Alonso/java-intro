/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package guia.pkg2.ejercicio.pkg5;

import java.util.Scanner;

public class Guia2Ejercicio5 {

    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        System.out.println("El doble del numero es " + num*2);
        System.out.println("El triple del numero es " + num*3);
        System.out.println("La raiz del numero es " + Math.sqrt(num));
        
    }
    
}
