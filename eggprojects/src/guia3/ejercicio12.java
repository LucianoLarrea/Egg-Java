package guia3;

import java.util.Scanner;

/**
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
* validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
* sino informe que no lo son.
 */
public class ejercicio12 {
      public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);
    	System.out.println("Ingrese dos numeros, para saber si el primer número es múltiplo del segundo: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
	}
      
public static void EsMultiplo(int num1, int num2) {
    if (num1 % num2 == 0) {
        System.out.println("Verdadero: El primer número es múltiplo del segundo");
    } else {
        System.out.println("Falso: el primer número no es múltiplo del segundo");
        }
}   
}
