package guia2;

import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
 */
public class ej4 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra o frase que empiece con A: ");
        String palabra = leer.nextLine();
        
        if (palabra.substring(0,1).equals("A")) { 
            System.out.println("Correcto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
}
