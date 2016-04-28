package referencias;

public class Student {
    int calificacion=7;
    String name;
    
    /*
    constructor default que te da Java
    public Student(){
    
    }
    */
}

class TestStudent{
    public static void main(String[] args) {
        //DECLARACION
        //Student noe;// V. de Referencia// O fields
        //noe = new Student();//inicializacion;
        Student noe = new Student();
        //HEAP(Objetos y FIELD) Y STACK(metodos, v.locales)
        //1. Cargar el metodo
        //2. Cargar las variables locales
            //3. Si la variable local, es una variable de referncia y tiene new
            //Necesitamos espacio en memoria
            //4. Preguntar por sus campos del tipo de dato reservado
                //3. Fomas de inicializacion.
                //1. Inicializacion por default
                //2. Inicializacion explicita
                //3. Ejecucion del constructor
            //5. Darle una direccion de memoria al espacio reservado
        //6. Interpretar la asignacion
        
        /*
            Student noe | new Student();
            ---------------------------
                Stack   | Heap
        */
        
        Student karla = new Student();
        
        noe = karla;
        karla.name="Andres";
        
        System.out.println(noe);
        System.out.println(noe.name);
        System.out.println(karla.name);
        System.out.println(karla.toString());
                
    }
}
