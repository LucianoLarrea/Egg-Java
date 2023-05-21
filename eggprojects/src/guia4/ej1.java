package guia4;
import java.util.Scanner;
/**
Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
y los muestre por pantalla en orden descendente.
 */
public class ej1 {
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        // Asigno valores mediante el for
    	for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
        // Muestro el vector
    	for (int i = vector.length-1; i > -1 ; i--) {
        	System.out.println("[" + vector[i] + "]");
        }        
    }
}
