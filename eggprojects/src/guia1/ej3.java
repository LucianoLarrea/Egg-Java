/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 */
public class ej3 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String textoMayusculas = frase.toUpperCase(); // "HOLA MUNDO"
        String textoMinusculas = frase.toLowerCase(); // "hola mundo"

        System.out.println("USTED ESCRIBIO: " + textoMayusculas);
        System.out.println("usted escribio: " + textoMinusculas);
    }
    
}
