/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia.pkg4;

import java.util.Scanner;

public class Guia4 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese dos numeros");
       int a = leer.nextInt();
       int b= leer.nextInt();
       int resultado = suma(a,b);
       int resultado2 = resta(a,b);
       int resultado3 = multiplicacion(a,b);
       int resultado4 = division(a,b);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
    public static int suma(int a, int b) {
    int c= a + b;
    return c;
     }
    public static int resta(int a, int b) {
        int c= a - b;
    return c;
           }  
    public static int multiplicacion(int a, int b) {
        int c= a * b;
    return c;
          }   
     public static int division(int a, int b) {
        int c= a / b;
    return c;
          }   
                               
            
            
}
