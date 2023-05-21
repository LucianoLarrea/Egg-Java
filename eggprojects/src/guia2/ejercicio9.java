package guia2;
import java.util.Scanner;

/**
Escriba un programa que lea 5 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
 */
public class ejercicio9 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int num, suma = 0, i = 1;
        System.out.println("Ingrese 5 numeros positivos para obtener la suma:");
    	do {
        System.out.print("Ingrese el número " + i + ": ");
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }
            if (num > 0) {
                suma += num;
            }
            i++;
        } while (i <= 5);
        System.out.println("La suma de los números positivos leídos es: " + suma);
    }
}
