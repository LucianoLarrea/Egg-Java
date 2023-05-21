package poo;

import Entidad.Persona;

/**
 *
 * @author luciano
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciacion utilizando el constructor vacio
        Persona primeraPersona = new Persona();
        // instanciacion utilizando el constructor por parametro
        Persona segundaPersona = new Persona("Luciano");
    }
    
}
