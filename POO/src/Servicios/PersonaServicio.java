package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in);
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona persona){
        if (persona.edad > 18){
            System.out.println("Es mayor de edad.");
            return true;
        } else{
            System.out.println("Es menor de edad.");
            return false;
        }
    }
// Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
// y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
    public Persona crearPersona(){

        System.out.println("Ingresar el nombre de la persona:");
        String nombre = leer.nextLine();
//        System.out.println("Ingresar edad de la persona:");
//        int edad = leer.nextInt();
        FechaServicio fs = new FechaServicio();
        Date cumple = fs.fechaNacimiento();
        Date hoy = fs.fechaActual();
        int edad = fs.diferencia(hoy, cumple);
        System.out.println("Ingresar altura de la persona:");
        double altura = leer.nextDouble();

        System.out.println("Ingresar sexo de la persona (H - hombre, M - mujer, O - otro):");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo inválido, ingrese nuevamente (H - hombre, M - mujer, O - otro):");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        System.out.println("Ingresar peso de la persona:");
        double peso = leer.nextDouble();
        return new Persona(nombre, edad, altura, sexo, peso);
    }
// Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    public int calcularIMC(Persona persona){
        double IMC = persona.getPeso()/Math.pow(persona.getAltura(), 2);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
// Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public void calcularEdad(Persona persona){
        System.out.println("La edad de "+persona.getnombre()+" es de "+persona.getEdad()+" años.");
    }
// Método menorQue recibe como parámetro una Persona y una edad. 
// Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(Persona persona, int edad){
        if (persona.edad < edad){
            return true;
        } else {
            return false;
        }
    }
// Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getnombre());
        System.out.println("Fecha de Nacimiento: "+p.getFechaNacimiento());
        System.out.println("Sexo: "+p.getSexo());
        System.out.println("Altura: "+p.getAltura());
        System.out.println("Peso: "+p.getPeso());
        System.out.println("IMC: "+IMC(p));
    }
    public static double IMC(Persona p){
        double IMC = p.getPeso()/Math.pow(p.getAltura(), 2);
        return IMC;
    }
}
