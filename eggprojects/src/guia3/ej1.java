package guia3;

import java.util.Scanner;

/**
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
public class ej1 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese dos numeros, para realizar una operacion matematica: ");
      int num1 = leer.nextInt();
      int num2 = leer.nextInt();
      System.out.println("Que operacion quiere realizar? s = sumar, r = restar, m = multiplicar, d = dividir");
      String operacion = leer.next();
      float mostrar = resultado(operacion, num1, num2);
      System.out.println("El resultado es: " + mostrar);
      leer.close();
      }
      
public static float resultado(String operacion, int num1, int num2) {
    float res = 0;
    switch (operacion) {
        case "s":
            res = num1 + num2;
            break;
        case "r":
            res = num1 - num2;
            break;
        case "m":
            res = num1 * num2;
            break;
        case "d":
            res = num1 / num2;
            break;
        default:
//            res = 0;
            System.out.println("Ingrese un caracter valido para la operacion");
            break;
        }
    return res;
    } 
}   

