package Entidad;

import java.util.Scanner;

/**
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
public class Rectangulo {
    private int base;
    private int altura;
// Método constructor con todos los atributos pasados por parámetro.
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
// Métodos get y set.
    public double getBase(){
        return base;
    }
        public void setBase(int base){
        this.base = base;
    }
        public double getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
// Método para crear rectangulo(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void Rectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura = leer.nextInt();
        this.base = base;
        this.altura = altura;
        }
// Método area(): calcular el area del rectangulo y devolver el resultado al main.
    public int area() {
        return base * altura;
    }
// Método perimetro(): calcular el perimetro del rectangulo y devolver el resultado al main.
    public double perimetro() {
        return (base + altura)/2;
    }
}
