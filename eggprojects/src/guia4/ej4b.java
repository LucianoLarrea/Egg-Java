package guia4;
import java.util.Random;
/**
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ej4b {
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
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        
        int[][] transposed = transpose(matriz);
        System.out.println("Matriz traspuesta B': ");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
    return result;
    }
}
