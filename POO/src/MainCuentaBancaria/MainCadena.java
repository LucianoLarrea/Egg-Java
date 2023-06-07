package MainCuentaBancaria;

import Entidad.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author luciano
 */
public class MainCadena {
    public static void main(String[] args){
        Cadena c = new Cadena("Hola Mundo");
        CadenaServicio cs = new CadenaServicio();
       
//        String frase = c.getFrase();
        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        cs.vecesRepetido(c, "O");
        cs.compararLongitud(c);
        cs.unirFrases(c);
        String reemplazar = cs.reemplazar(c,"@");
        System.out.println("Frase reemplazando la letra a: "+reemplazar);
        Boolean contiene = cs.contiene(c, "o");
        System.out.println("La frase contiene la letra: "+contiene);
    }
}
