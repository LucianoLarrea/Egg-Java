package Entidad;

/* Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. 
Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
 */
public class Cadena {
    public String frase;
    public int longitud;
// Constructor con parametros
    public Cadena(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }
// Constructor sin parametros
    public Cadena(){
        this.frase = "";
        this.longitud = frase.length();
    }
// Métodos get y set.
    public String getFrase(){
        return frase;
    }
    public void setFrase(String frase){
        this.frase = frase;
        this.longitud = frase.length();
    }
    public int getLongitud(){
        return longitud;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
}
