package MainCuentaBancaria;

import Servicios.FechaServicio;
import java.util.Date;

/**
 *
 * @author luciano
 */
public class MainFecha {
    public static void main(String[] args) {
        FechaServicio fs = new FechaServicio();
        Date cumple = fs.fechaNacimiento();
        Date hoy = fs.fechaActual();
        int edad = fs.diferencia(hoy, cumple);
        System.out.println("Su edad es: "+edad+" años.");
    }
}
