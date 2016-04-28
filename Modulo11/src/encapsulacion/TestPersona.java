package encapsulacion;

public class TestPersona {

    public static void main(String[] args) {

        Persona samuel = new Persona("Samuel", "Perez");
//        samuel.setNombre("Samuel");
//        samuel.setApellido("Perez");
        samuel.setEdad(23);
        System.out.println(samuel.getInformacion());
        samuel = new Persona();
        System.out.println(samuel.getInformacion());
    }
}

class Persona {

    private String nombre, apellido;
    private int edad;

    public Persona() {
        // USOS DE LA PALABRA RESERVADA "this"
        // 1.- this.  para acceder a los atributos de una clase.
        // 2.- this obtiene la referencia de la instancia.
        // 3.- this() Mandar a llamar al constructor.
        this("NO NAME", "NO LAST NAME");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setEdad(int edad) {
        if (edad <= 18) {
            System.out.println("La edad es invalida.");
            this.edad = 18;
        } else {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public String getInformacion() {
        return "Full name: " + this.nombre + " " + apellido + "\nEdad: " + this.edad;
    }
}
