package guia1;

import java.util.Scanner;

/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número.
*/
public class ej5 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero:");
        int num1 = leer.nextInt();
        int num2 = num1 * 2;
        int num3 = num1 * 3;
        double num4 = Math.sqrt(num1);
   
        System.out.println("El doble es: " + num2);
        System.out.println("El triple es: " + num3);
        System.out.println("La raiz cuadrada es: " + num4);
    }
}
