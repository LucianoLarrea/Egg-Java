package Entidad;

import java.util.Scanner;

/**
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro 
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
public class Libro {
// atributos    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
// constructor vacio
    public Libro() {}
// constructor con todos los atributos pasados por parametro
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.ISBN = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
// método para cargar un libro pidiendo los datos al usuario
        public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
// método para informar los atributos del libro al usuario
        public void informarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
