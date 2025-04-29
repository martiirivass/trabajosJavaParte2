package POO.AsosiacionUnidireccional;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Universidad(String nombre, List<Estudiante> estudiantes) {
        setNombre(nombre);
        this.estudiantes = estudiantes;
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(this.nombre != null){
            this.nombre = nombre;
        } else throw new IllegalArgumentException("Ingrese un nombre de universidad");
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
