package MainCuentaBancaria;

import Servicios.ArregloServicio;

/**
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
Inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class MainArreglo {
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
    
    ArregloServicio as = new ArregloServicio();
    as.inicializarA(arregloA);
    as.inicializarA(arregloB);
    as.mostrar(arregloA);
    as.mostrar(arregloB);
    as.ordenar(arregloA);
    as.ordenar(arregloB);
    as.inicializarB(arregloA, arregloB);
    as.mostrar(arregloA);
    as.mostrar(arregloB);
       
    }   
}
