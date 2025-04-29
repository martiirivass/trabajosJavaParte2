package POO.AsosiacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Libro> libros;
    //CONSTRUCTOR


    public Persona(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibros(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){
        for(Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }
}
