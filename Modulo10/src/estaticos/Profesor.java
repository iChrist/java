package estaticos;

public class Profesor {

    public void reganiar() {
        Alumno controlAlumno = new Alumno();
        if (controlAlumno.contador >= 6) {
            System.out.println("Regañando a mis alumnos!");
        } else {
            System.out.println("Bien portados");
        }
    }
}
