package guia3;

import java.util.Scanner;

/**
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
* y luego codifique la palabra o frase ingresada de la siguiente manera: 
* cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
* (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 */
public class ejercicio11 {
      public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);
    	System.out.println("Escriba una frase a codificar");
        String frase = leer.nextLine();
    	System.out.println(codificar(frase));
	}
      
public static String codificar(String frase) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < frase.length(); i++) {
        char c = frase.charAt(i);
        switch (c) {
            case 'a':
                sb.append('@');
                break;
            case 'e':
                sb.append('#');
                break;
            case 'i':
                sb.append('$');
                break;
            case 'o':
                sb.append('%');
                break;
            case 'u':
                sb.append('*');
                break;
            default:
                sb.append(c);
                break;
        }
    }
    return sb.toString();
}   
}
