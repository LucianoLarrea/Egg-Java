package Entidad;

/**
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. 
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. 
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
 */


import java.util.Scanner;

public class Curso {
    private Scanner leer = new Scanner(System.in);
    public String nombreCurso;
    public int cantidadHorasPorDia;
    public int cantidadDiasPorSemana;
    public String turno;
    public double precioPorHora;
    public String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int canridadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = canridadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCanridadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCanridadDiasPorSemana(int canridadDiasPorSemana) {
        this.cantidadDiasPorSemana = canridadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    public void cargarAlumnos(){
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1)+" :");
            String nombre = leer.nextLine();
            this.alumnos[i] = nombre;
        }
    }
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario 
// y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
// En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    public void crearCurso(Curso c){
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.nextLine();
        System.out.println("Ingrese la catidad de horas por dia: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana: ");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese turno mañana o tarde: ");
        String turno = leer.nextLine();
        System.out.println("Ingrese el precio por hora: ");
        double precioPorHora = leer.nextDouble();
        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
        curso.cargarAlumnos();

    }
    
}
