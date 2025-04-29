package POO.AsosiacionUnidireccional;

public class Estudiante {
    private String nombre;
    private Universidad universidad;

    public Estudiante(String nombre, Universidad universidad) {
        setNombre(nombre);
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null){
            throw new IllegalArgumentException("Ingrese un nombre de estudiante");
        } else {
            this.nombre = nombre;
        }
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", universidad=" + universidad +
                '}';
    }
}
