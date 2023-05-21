package guia2;

import java.util.Scanner;

/**
Implementar un programa que le pida dos números enteros al usuario y determine 
* si ambos o alguno de ellos es mayor a 25.
 */
public class ejercicio6 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) { 
            System.out.println("Ambos números o alguno de ellos es mayor a 25"); 
        }
        else { 
            System.out.println("Niguno de los números es mayor a 25");
        }
    }
}
