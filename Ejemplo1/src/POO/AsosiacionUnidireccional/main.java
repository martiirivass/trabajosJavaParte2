package POO.AsosiacionUnidireccional;

public class main {
    public static void main(String[] args) {
        Universidad UTN = new Universidad("UTN");
        Universidad UNCUYO = new Universidad("UNCUYO");

        Estudiante e1 = new Estudiante("Martiniano", UTN);
        Estudiante e2 = new Estudiante("Brisa", UNCUYO);
        Estudiante e3 = new Estudiante("Mirta", UTN);
        Estudiante e4 = new Estudiante("Raul", UTN);
        Estudiante e5 = new Estudiante("Tomas",UNCUYO);


        System.out.println("El estudiante " + e1.getNombre() + " asiste a " + e1.getUniversidad());
        System.out.println("El estudiante " + e2.getNombre() + " asiste a " + e2.getUniversidad());
        e2.setUniversidad(UTN);
        System.out.println("El estudiante " + e2.getNombre() + " asiste a " + e2.getUniversidad());
    }
}
