package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
public class ArregloServicio {
// Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = redondear(random.nextDouble());
        }
    }
// Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
// Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
    }
// Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
// Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] A, double[] B){
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, B.length, 0.5);     
    }
    
// Metodo static para redondear    
    public static double redondear(double numero) {
        return Math.round(numero * 100) / 100.0;
    }
}
