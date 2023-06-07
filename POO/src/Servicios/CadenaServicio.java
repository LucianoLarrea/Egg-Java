package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
 */
public class CadenaServicio {
    private Scanner leer = new Scanner(System.in);
// Metodo para ingresar frase
    public void ingresarFrase(){
        System.out.println("Ingresar frase: ");
        String frase = leer.nextLine();
    }
    
    
// Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public void mostrarVocales(Cadena c) {
        System.out.println(c.getFrase());
        String frase = c.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador ++;
            }
        }
        System.out.println("En la frase hay " + contador + " vocales");
    }

// Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
    public String invertirFrase(Cadena c){
        String frase = c.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);   
        }
        System.out.println("Frase invertida: "+fraseInvertida);
        return fraseInvertida;
    }
// Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y 
// contabilizar cuántas veces se repite el carácter en la frase.
    public void vecesRepetido(Cadena c, String letra){
        String frase = c.getFrase().toLowerCase();

        System.out.println("Ingrese una letra a ser contabilizada en la frase: ");
        char caracter = letra.toLowerCase().charAt(0); // paso de String a char
        int contador = 0;
        for (int i = 0; i<frase.length(); i++) {
            if (frase.charAt(i)==caracter){
                contador++;
            }
        }
        System.out.println("El caracter "+caracter+" se repite "+contador+" veces.");
    }
// Método compararLongitud(String frase), deberá comparar la longitud de la frase 
// que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena c){
        System.out.println("Ingrese una frase cuya longitud va a ser comparada con la frase original: ");
//        String xxx = leer.nextLine();
        String frase2 = leer.nextLine();
        int comparar = c.getFrase().compareToIgnoreCase(frase2);
//        System.out.println("Longitud de la frase: "+long2);
        if (comparar < 0){
            System.out.println("La frase ingresada es de mayor longitud.");
        } else if (comparar == 0){
            System.out.println("Ambas frases tienen la misma longitud.");
        } else if (comparar > 0){
            System.out.println("La frase ingresada es de menor longitud.");
        }
    }
// Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
// ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena c){
        System.out.println("Ingrese una frase a unir con la frase original: ");
        String frase3 = leer.nextLine();
        String frase = c.getFrase();
        String frases = frase +" "+frase3;
        System.out.println("Frases unidas: "+frases);
    }
// Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
// por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    public String reemplazar(Cadena c, String letra){
        String frase = c.getFrase();
        String fraseReemplazada = frase.replace("a", letra);
        return fraseReemplazada;        
    }
// Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
// y devuelve verdadero si la contiene y falso si no.
    public Boolean contiene(Cadena c, String letra){
        String frase = c.getFrase();
        boolean contieneLetra;
        contieneLetra = frase.contains(letra);
        return contieneLetra;
    }
}

    