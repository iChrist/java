package switches;

public class TestSwitchOne {
    public static void main(String[] args) {
        //Integral=byte,short,int(default),long
        //Floating
        //Logicos
        //Textuales
        //Refrencia = Integer, String(v7)
        //No permitidos: FLOAT, long, boolean
        //Permitidos: byte, short, int, char, String, Integer
        // Los casos de un Switch solo aceptan constantes o Literals String
        String opcion = "Miriam";
        final String case1 = "Ivan";
        switch (opcion){//variable a ser evaluada
            default :
                System.out.println("Soy un oyente.");
                break;
            case "Salvador":
                System.out.println("Es el instructor.");
                break;
            case "Noe":
                System.out.println("Es un alumno.");
                break;
            case case1:
                System.out.println("Es un extraño");
                 
        }
    }
    
    //Conjunto de datos finitos
    //Pero son tratados como un objeto
    enum Conjunto{
        E1
    }
}
