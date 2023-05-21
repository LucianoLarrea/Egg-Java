package Entidad;

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
    public Float altura;
    public char sexo;
    public Float peso;
// constructores: son métodos propios del objeto que nos permiten CREARLO.
//    [<modificador>] <nombre de clase> ( <argumento>* ) {
//   <sentencia>}
    public Persona() {
    }
     public Persona(String nombre, int edad,Float altura, char sexo, Float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.peso = peso;
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
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public Float getAltura() {
        return altura;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
        return sexo;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    public Float getPeso() {
        return peso;
    }
}

