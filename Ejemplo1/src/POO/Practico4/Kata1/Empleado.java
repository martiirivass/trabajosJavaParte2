package POO.Practico4.Kata1;

public class Empleado {
    private String nombre, puesto;
    private int id; //identificador unico
    private double salario;
    static int totalEmpleados; //contador que registra la cantidad de empleados creados


    //Constructor
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000.00;
        totalEmpleados ++;  //aumenta el contador en 1
        this.id = totalEmpleados;  //Se le dará el número de totalEmpleados
    }
    //Sobrecarga de constructor con parámetros
    public Empleado(String nombre, String puesto, int id, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = id;
        this.salario = salario;
        totalEmpleados++;  //aumenta el contador en 1
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    public double actualizarSalario(int porcentajeAumento){
        if (porcentajeAumento>0) {
            this.salario = (this.salario * (1 + (porcentajeAumento/100.00)));
        } else System.out.println("El porcentaje de aumento debe ser mayor de aumento");
        return this.salario;
    }

    public double actualizarSalario(double cantidadFija){
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
        } else System.out.println("La cantidad debe ser mayor a 0");
        return this.salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }

    public static int mostrarEmpleados(){
        return totalEmpleados;
    }

}
