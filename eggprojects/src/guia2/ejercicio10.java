package guia2;
import java.util.Scanner;

/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor
 */
public class ejercicio10 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        String ast = "";
        System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20:");
        for (int i = 1; i <= 4; i++) {
//        int num, suma = 0, i = 1;

            System.out.print("Ingrese el número " + i + ": ");
                int num = leer.nextInt();
                if (num < 1 || num > 20) {
                    System.out.println("El numero no se encuentra comprendido entre 1 y 20.");
                    break;
                }
            for (int j = 1; j <= num; j++) {
                ast += "*";
            }
            String resultado = num + ast;
            System.out.println(resultado);
            ast = "";
        }
    }
}
