package guia2;
import java.util.Scanner;

/**
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class ejercicio8 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un valor entre 1 y 10:");
        int num = leer.nextInt();
   	while (num<0 || num>10) {
    	System.out.println("Incorrecto, ingrese un valor entre 1 y 10:");
    	num = leer.nextInt();
        }
    }
}
