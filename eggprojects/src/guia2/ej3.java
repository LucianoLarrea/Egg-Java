package guia2;

import java.util.Scanner;

/**
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 */
public class ej3 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra o frase de 8 caracteres: ");
        String palabra = leer.nextLine();
        
        if (palabra.length() == 8) { 
            System.out.println("Correcto");
        } else { 
            System.out.println("Incorrecto");
        }
    }
}
