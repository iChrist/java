package strings;

/**
 *
 * @author ALASS
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder. Mutables
        //Nota: en la mayoria de los metodos
        
        //1. Siempre se reserva espacio de memoria
        StringBuilder sb1 = new StringBuilder("Loros");
        
        sb1.append(" de");
        System.out.println(sb1);
        
        System.out.println(sb1.charAt(4));
        sb1.deleteCharAt(5);
        System.out.println(sb1);
        //Operaciones con StringBuilder
        //Insertar, eliminar, remplazar
        
        sb1.delete(0, sb1.length());
        //START - END
        //pos inicial, pos final
        System.out.println(sb1);
        //""
        sb1.insert(0, "Loros de Colima");
        System.out.println(sb1);
        //Loros de Colima
        sb1.replace(9, 12, "Guadalajara");
        System.out.println(sb1);
        //"Loros de Guadalajaraima"
        
        StringBuilder sb2 = new StringBuilder("Loros");
        sb2.append(" de").deleteCharAt(5).delete(0, 7).insert(0, "Loros de Colima").replace(9, 12, "Guadalajara");
        System.out.println(sb2);
        
        sb2.substring(4,8);//No guarda el resultado
        String sb3 = sb2.substring(4,8);//No guarda el resultado
        System.out.println(sb2);
        
        StringBuilder sb4 = new StringBuilder("OCJA");
        StringBuilder sb5 = new StringBuilder("OCJA");
        StringBuilder sb6 = sb4;
        
        System.out.println(sb4==sb5);//False
        System.out.println(sb5==sb6);//False
        System.out.println(sb4=sb6);//True
        
        System.out.println(sb4.equals(sb6));//True
        System.out.println(sb4.equals(sb5));//False
        System.out.println(sb5.equals(sb6));//False
                
        System.out.println(sb4.toString()==sb5.toString());//False
        System.out.println(sb4.toString()==sb6.toString());//False
        
        System.out.println(sb4.toString().equals(sb5.toString()));//True
        System.out.println(sb4.toString().equals(sb6.toString()));//True


    }
    
}
