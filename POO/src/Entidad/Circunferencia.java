package Entidad;

import java.util.Scanner;

/**
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real
 */
public class Circunferencia {
// atributos  
    private double radio;
// constructor que inicialice el radio pasado como parámetro.
    public Circunferencia (double radio){
        this.radio = radio;
    }
// metodos get y set (void) para el atributo radio de la clase Circunferencia.
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
// Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = leer.nextDouble();
        this.radio = radio;
    }
// Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
// Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}
