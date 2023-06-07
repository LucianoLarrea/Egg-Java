package MainCuentaBancaria;

//import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicios;

/**
 *
 * @author luciano
 */
public class MainCuentaBancaria {
    public static void main(String[] args){
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
//        CuentaBancaria cb = cbs.crearCuenta();
        System.out.println("Saldo:");
        cbs.consultarSaldo();
        cbs.crearCuenta();
        cbs.depositar(1000);
        cbs.retirar(500);
        cbs.extraccionRapida();
        cbs.consultarSaldo();
        cbs.consultarDatos();
    }
}
