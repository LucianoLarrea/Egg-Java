package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */

public class CuentaBancariaServicios {
    private Scanner leer = new Scanner(System.in);
// Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese el numero de cuenta: ");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo inicial: ");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
// Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void depositar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
    }
// Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        double retiro = (saldoActual >= cantidad) ? cantidad : saldoActual;
        if (saldoActual >= cantidad){
            cuenta.setSaldoActual(saldoActual - retiro);
        } else{
            cuenta.setSaldoActual(0);
        }
    }
// Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se extrajo " + (cuenta.getSaldoActual() * 0.2));
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }
// Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
// Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}
