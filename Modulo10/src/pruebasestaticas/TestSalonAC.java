package pruebasestaticas;
import estaticos.*;
import static estaticos.Alumno.*;
public class TestSalonAC {

    public static void main(String[] args) {
        System.out.println("Contador : "+contador);
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        Alumno a4 = new Alumno();
        //Alumno a5 = new Alumno();
        //Alumno a6 = new Alumno();
        //Alumno a7 = new Alumno();
        Profesor hector = new Profesor();
        hector.reganiar();
    }
}
