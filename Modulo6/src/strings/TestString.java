package strings;

/**
 *
 * @author ALASS
 */
public class TestString {
    public static void main(String[] args) {
        //String. inmutable, que cada vez que
        //modifiques su informacion estra creando
        //un nuevo objeto.
        
        //1. Creando new() siempre reservando espacio de memoria
        //Doble reserva de memoria
        String s1 = new String("Loros");
        
        //2.Se almacena en Pool String(Heap)
        String s2="Loros";//Literal String
        
        System.out.println(s1==s2);//== compara direcciones de memoria
        System.out.println(s1.toString() == s2.toString());
        System.out.println(s2.equals(s1));//equals compara contenido.
        
        s2 = s2.concat(" de");
        System.out.println(s2);
        
        System.out.println(s2.charAt(4));
        //La posicion inicia en 0
        
        s2 = s2.replace('o', 'a');
        //replace de String remplaza todas las incidencias
        System.out.println(s2);
        
        
        String msg = " Universidad de Colima ";
        System.out.println(msg=msg.trim());
        //Elimina los espacios al inicio y al fin de la cadena
        System.out.println(msg.toUpperCase());
        System.out.println(msg=msg.toLowerCase());
        
        System.out.println(msg.startsWith("uni"));
        System.out.println(msg.startsWith("ima"));
        //retornan true or false, si inician o finalizan 
    }
}
