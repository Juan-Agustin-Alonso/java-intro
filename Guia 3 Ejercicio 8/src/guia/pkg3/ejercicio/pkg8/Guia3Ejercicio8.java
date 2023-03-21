/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *
 */
package guia.pkg3.ejercicio.pkg8;

import java.util.Scanner;

public class Guia3Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado, i, k, j;
        System.out.println("Ingrese la cantidad de elementos por lado que tendrá el cuadrado");
        lado = leer.nextInt();
        for (i = 1; i <= lado; i++) {
            if (i == 1 || i == lado) {
                for (j = 1; j <= lado; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                for (k = 1; k <= lado; k++) {
                    if (k == 1 || k == lado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
