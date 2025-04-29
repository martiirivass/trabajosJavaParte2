package POO.AsosiacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private List<Persona> personas = new ArrayList<Persona>();
    //CONSTRUCTOR

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    //GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}
