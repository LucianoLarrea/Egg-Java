package guia4;
import java.util.Scanner;
/**
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class ej3 {
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        // Asigno valores mediante el for
    	for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
    // Contar la cantidad de números de cada longitud
    int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, mayor = 0;
    	for (int i = 0 ; i < vector.length ; i++) {
            String str = Integer.toString(vector[i]);
            int num = str.length();
                switch(num){
                    case 1:
                        uno ++;
                        break;
                    case 2:
                        dos ++;
                        break;
                    case 3:
                        tres ++;
                        break;
                    case 4:
                        cuatro ++;
                        break;
                    case 5:
                        cinco ++;
                        break;
                    default:
                        mayor ++;
                } 
        }
        System.out.println(uno + " números son de 1 dígito.");
        System.out.println(dos + " números son de 2 dígitos.");
        System.out.println(tres + " números son de 3 dígitos.");
        System.out.println(cuatro + " números son de 4 dígitos.");
        System.out.println(cinco + " números son de 5 dígitos.");
        System.out.println(mayor + " números son de 6 o más dígitos.");
    }
}
