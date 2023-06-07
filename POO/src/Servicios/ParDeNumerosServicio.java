package Servicios;

import Entidad.ParDeNumeros;


/**
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
* Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ParDeNumerosServicio {
// Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros pdn){
        System.out.println("Numero 1: "+ pdn.getNumero1());
        System.out.println("Numero 2: "+ pdn.getNumero2());
    }
// Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor.
    public void devolverMayor(ParDeNumeros pdn){
        System.out.println("El numero mayor es: "+pdn.getMayor());
    }
// Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
    public void calcularPotencia(ParDeNumeros pdn){
        System.out.println(redondear(pdn.getMayor())+" elevado a "+redondear(pdn.getMenor())+" = "+Math.pow(redondear(pdn.getMayor()),redondear(pdn.getMenor())));
    }
// Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    public void calculaRaiz(ParDeNumeros pdn){
        double vAbs = Math.abs(redondear(pdn.getMenor()));
        System.out.println("Raiz cuadrada de "+vAbs+" = "+Math.sqrt(vAbs));
    }
    
    public static double redondear(double numero) {
        return Math.round(numero * 100) / 100.0;
    }    
}
