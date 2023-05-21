package guia4;
import java.util.Random;
/**
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ej4 {
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        // Creación de una instancia de Random
        Random random = new Random();
    // Asigno valores mediante el For
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Matriz original A: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matriz traspuesta B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }
}
