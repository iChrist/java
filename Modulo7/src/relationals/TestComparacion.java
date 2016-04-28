package relationals;
import java.util.Date;

public class TestComparacion {
    
    public static void main(String[] args) {
        String a = "Cadebna";
        String b = "Cadena";
        Date d = new Date();
        
        System.out.println(a!=b);//igual o diferente
        System.out.println(a>=b);//No mayores ni menores
        System.out.println(a==b);//No Tipos de datos diferentes
        System.out.println(a!=d);//No Tipos de datos diferentes
        
    }
    
}
