package guia4;
import java.util.Random;
import java.util.Scanner;
/**
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        Random random = new Random();
        // Asigno valores mediante el for
    	for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(9);
        }
        System.out.println("Ingrese un número a buscar en el vector: ");
        int num = leer.nextInt();
        int contador = 0;
        // Muestro el vector
        for (int i = 0; i < vector.length ; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    	for (int i = 0; i < vector.length ; i++) {
            if (num == vector[i]) {
                System.out.println("");
                System.out.println(num+" se encuentra en la posición " + i + " del vector.");
                contador++;
            } 
        }
        System.out.println("");
        System.out.println(num+" aparece " + contador + " veces.");
    }
}
