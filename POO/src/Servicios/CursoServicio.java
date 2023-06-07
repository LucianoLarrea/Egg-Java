package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
solicitando en cada repetición que se ingrese el nombre de cada alumno.
 */
public class CursoServicio {
    private Scanner leer = new Scanner(System.in);
// Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
    public void cargarAlumnos(Curso c){
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1)+" :");
            String nombre = leer.nextLine();
            this.alumnos[i] = nombre;
        }
    }
}
