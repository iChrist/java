package fors;
import java.util.ArrayList;
/**
 *
 * @author christianjimenezcjs
 */
public class TestForFour {
    public static void main(String[] args) {
       int [] array = {1,2,3,4,5,6,7};
        //Foreach
        // Var Aux : Array/Collection
        for(int aux : array){
            System.out.print(aux+",");
        }
        System.out.println();
        ArrayList lista1 = new ArrayList();
        lista1.add("David");
        lista1.add("Christian");
        lista1.add(24);
        for (Object lista11 : lista1) {
             System.out.print(lista11+",");
        }
    }
}
