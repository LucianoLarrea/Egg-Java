package guia2;

import java.util.Scanner;

/**
Crear un programa que dado un número determine si es par o impar
 */
public class ej1 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un numero número entero:");
        int num = leer.nextInt();
        if (num % 2 == 0) { 
            System.out.println("El numero ingresado es par"); 
        }
        else { 
            System.out.println("El numero ingresado es impar");
        }
    }
}
