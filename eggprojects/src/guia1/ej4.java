/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
public class ej4 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados centígrados:");
        int tempC = leer.nextInt();
        //Definir num Como Entero;
        //Leer num;
        //inicialización.
        int tempF = 32 + (9 * tempC / 5);
   
        
        System.out.println("La temperatura en grados Farenheit es: " + tempF);
    }
}
