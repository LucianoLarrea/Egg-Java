package MainCuentaBancaria;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author luciano
 */
public class MainPersona {
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();
        ps.calcularEdad(p);
        ps.esMayorDeEdad(p);
        int IMC = ps.calcularIMC(p);
        boolean menor = ps.menorQue(p, 40);
        ps.mostrarPersona(p);
    }
    
}
