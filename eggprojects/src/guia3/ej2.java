package guia3;

import java.util.Scanner;

/**
Diseñe una función que pida el nombre y la edad de N personas 
e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”. 
 */
public class ej2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
      String stop = "";
      do {
        System.out.println("Ingrese nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese edad de la persona");
        int edad = leer.nextInt();
        String mostrar = resultado(nombre, edad);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println(nombre + " es " + resultado(nombre, edad) + " de edad.");
        System.out.println("Para terminar ingrese No, de lo contrario ingrese otro caracter");
        stop = leer.next();
        } while (!stop.equals("No"));
    }
      
    public static String resultado(String nombre, int edad) {
        String res;
        if (edad < 18) {
            res = "menor";
        } else {
            res = "mayor";
                }
        return res;
    } 
}   

