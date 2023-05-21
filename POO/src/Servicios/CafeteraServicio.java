package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, 
el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in);
// Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
// Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
// y simula la acción de servir la taza con la capacidad indicada.
    public void servirTaza(Cafetera cafetera){
        System.out.println("Ingrese la capacidad de la taza a llenar: ");
        int capacidadTaza = leer.nextInt();
        if (capacidadTaza <= cafetera.getCantidadActual()){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - capacidadTaza);
            int Taza = capacidadTaza;
            System.out.println("La taza se llenó completamente.");
        } else { 
            int Taza = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("La taza se llenó parcialmente: ");
        }
    }
// Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }
// Método agregarCafe(int): se le pide al usuario una cantidad de café, 
// el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera, int agregarCafe){
        if (agregarCafe + cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        } else{
            cafetera.setCantidadActual(cafetera.getCantidadActual()+agregarCafe);
        }
        
    }
}
