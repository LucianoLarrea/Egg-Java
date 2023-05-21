package Entidad;

/**
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. 
 */
public class Cafetera {
    public int capacidadMaxima;
    public int cantidadActual;
// Constructor con parametros
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
// Constructor con parametros
    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
// Métodos get y set.
    public double getCapacidadMaxima(){
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    public double getCantidadActual(){
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
}
