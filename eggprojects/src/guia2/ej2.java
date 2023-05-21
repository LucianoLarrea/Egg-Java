package guia2;

import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto.
 */
public class ej2 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese eureka:");
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) { 
            System.out.println("Correcto"); 
        } else { 
            System.out.println("Incorrecto");
        }
    }
}
