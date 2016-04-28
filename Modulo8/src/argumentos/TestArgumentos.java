package argumentos;

/**
 *
 * @author christianjimenezcjs
 */
public class TestArgumentos {
    public static void main(String[] args) {
        //Casting  (Forzar traducir un tipo de dato otro)
        //Parsing (Tratar de traducir de un tipo a otro)
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        System.out.println("Suma: "+(val1+val2));
    }
}
