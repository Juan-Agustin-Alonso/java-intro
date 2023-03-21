/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por
el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos 
(llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia.pkg3.ejercicio.pkg7;

import java.util.Scanner;

public class Guia3Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena, primeraLetra, ultimaLetra;
        int correctos, incorrectos;
        boolean FDE = true;
        System.out.println("Ingrese una cadena de maximo 5 caracteres, la primera letra debe ser una X y la última una O");
        correctos = 0;
        incorrectos = 0;
        do {
            cadena = leer.nextLine();
            primeraLetra = cadena.substring(0, 1);
            primeraLetra = primeraLetra.toUpperCase();
            ultimaLetra = cadena.substring(4, 5);
            ultimaLetra = ultimaLetra.toUpperCase();
            if (cadena.length() == 5 && primeraLetra.equals("X") && ultimaLetra.equals("O")) {

                correctos = correctos + 1;

            } else if (cadena.equals("&&&&&")) {

                FDE = false;
            } else {
                
                incorrectos = incorrectos + 1;
                
            }
            
        } while (FDE);
        System.out.println("La cantidad de lecturas correctas es de " + correctos);
        System.out.println("La cantidad de lecturas incorrectas es de " + incorrectos);
    }
}
