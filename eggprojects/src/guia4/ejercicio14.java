package guia4;
import java.util.Scanner;
/**
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[3];
        // Asigno valores mediante el for
    	for (int i = 0; i < Equipo.length; i++) {
            System.out.println("Ingrese el nombre del cumpa "+i);
            String cumpa = leer.next();
            Equipo[i] = cumpa;
        }
        // Muestro el vector
    	for (int i = 0; i < Equipo.length; i++) {
        	System.out.println("[" + Equipo[i] + "]");
        }        
    }
}
