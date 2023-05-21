package guia3;

import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado 
a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void)
 */
public class ej3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de Euros: ");
    float num = leer.nextFloat();
    System.out.println("A que divisa lo quiere convertir? d = dolares, y = yenes, l = libras");
    String divisa = leer.next();
    float mostrar = resultado(num, divisa);
    System.out.println("El resultado es: " + mostrar);
    leer.close();
    }
      
    public static float resultado(float num, String divisa) {
        float res = 0;
        switch (divisa) {
            case "d":
                res = num * 0.86f;
                break;
            case "y":
                res = num * 1.28611f;
                break;
            case "l":
                res = num * 129.852f;
                break;
            default:
    //            res = 0;
                System.out.println("Ingrese un caracter valido para la operacion");
                break;
            }
            return res;
    } 
}   

