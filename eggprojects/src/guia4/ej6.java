package guia4;
//import java.util.Random;
import java.util.Scanner;
/**
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimension para la matriz magica: ");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
    // Asigno valores mediante el For
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor para la fila "+i+" y la columna "+j+" para la matriz de "+n+" x "+n+" dimensiones");
                matriz[i][j] = leer.nextInt();
                // Verificar si los valores ingresados estan entre 1 y 9
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("El valor ingresado debe estar entre 1 y 9.");
                return;
                }
            }
        }
        System.out.println("Matriz original A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        if (magica(matriz)) {
            System.out.println("La matriz es magica.");
        } else {
            System.out.println("La matriz no es magica.");
            }
    }
    public static boolean magica(int [][]matrix) {
        int n = matrix.length;
        int sumaD1 = 0;
        int sumaD2 = 0;
        int sumaF = 0;
        int sumaC = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    sumaD1 += matrix[i][i];
                } 
            }
        }
        System.out.println("D1: "+sumaD1);
        
        for (int i = 0; i < n; i++) {
            sumaD2 += matrix[i][n-1-i];
        }
        System.out.println("D2: "+sumaD2);
        // Check if all rows have the same sum
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matrix[i][j];

            }
            if (sumaF == 0) {
                sumaF = sumaFila;
            } else if (sumaF != sumaFila) {
                return false;
            }
        }
        System.out.println("F: "+sumaF);
        // Check if all columns have the same sum
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matrix[i][j];
            }
            if (sumaC == 0) {
                sumaC = sumaColumna;
            } else if (sumaC != sumaColumna) {
                return false;
            }
        }
        System.out.println("C: "+sumaC);
        if (sumaD1 == sumaD2 && sumaD1 == sumaF && sumaD1 == sumaC) {
            return true;
        } else {
            return false;
            }
    }
}    
