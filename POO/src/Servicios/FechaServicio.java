package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. 
Ejemplo: Date fechaActual = new  Date(); El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
public class FechaServicio {
    Scanner leer = new Scanner(System.in);
// Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
    public Date fechaNacimiento(){
        System.out.println("Ingrese año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de nacimiento: ");
        int dia = leer.nextInt();
        Date fecha = new Date(anio, mes, dia);
        return fecha;
    }
// Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date.
    public Date fechaActual(){
        Date fechaActual = new Date();
        return fechaActual;        
    }
// Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    public int diferencia(Date hoy, Date cumple){
        int edad;
        edad = hoy.getYear() - cumple.getYear() + 1900;
        return edad;
    }
}
