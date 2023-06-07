package Entidad;

import java.util.Date;

/**
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
 */
public class Persona {
// atributos: características comunes a todos los objetos. Son los “espacios” donde alojaremos información.
// <modificador> <tipo> <nombre> Estos atributos irán al principio de la clase.
    public String nombre;
    public int edad;
    public double altura;
    public char sexo;
    public double peso;
    public Date fechaNacimiento;
// constructores: son métodos propios del objeto que nos permiten CREARLO.
//    [<modificador>] <nombre de clase> ( <argumento>* ) {
//   <sentencia>}
    public Persona() {
    }
     public Persona(String nombre, int edad,double altura, char sexo, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String luciano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// métodos propios: funciones que determinan el comportamiento de los objetos.
// Todos los objetos de una misma clase tienen los mismos métodos y el mismo comportamiento.
/**
// <modificador>* <tipo de retorno> <nombre> ( <argumento>>* ) {
//	<sentencias>*
//   return valorRetorno;}
//     * @return 

 */     
    public String getnombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return sexo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}

