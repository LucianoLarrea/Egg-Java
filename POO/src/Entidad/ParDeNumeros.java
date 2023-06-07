package Entidad;

/*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números.
 */
public class ParDeNumeros {
// Que tenga como atributos dos números reales. 
    public double numero1;
    public double numero2;
// La clase debe tener un constructor vacío.
    public ParDeNumeros() {
        this.numero1 = 10*Math.random();
        this.numero2 = 10*Math.random();
    }

    public ParDeNumeros(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
// Getters y setters. 

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    public double getMayor() {
        if (getNumero1()>getNumero2()){
            return getNumero1();
        } else{
            return getNumero2();
        }   
    }
    
    public double getMenor() {
        if (getNumero1()>getNumero2()){
            return getNumero2();
        } else{
            return getNumero1();
        }   
    }
    
    
    
}
