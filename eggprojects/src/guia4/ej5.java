package guia4;
import java.util.Random;
/**
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ej5 {
    public static void main(String[] args) {
        int n = 3;
//        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[n][n];
        // Creación de una instancia de Random
        Random random = new Random();
    // Asigno valores mediante el For
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Matriz original A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        int [][] traspuesta = transpose(matriz);
        System.out.println("Matriz traspuesta B");
        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[0].length; j++) {
                System.out.print(matriz[j][i]+ " ");
            }
            System.out.println("");
        }
        if (simetria(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
    }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = -matrix[i][j];
            }
        }
        return result;
    }
    public static boolean simetria(int [][]matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != -matrix[j][i]) {
                    return false;
                } 
            }
        }
        return true;
    }
}    
