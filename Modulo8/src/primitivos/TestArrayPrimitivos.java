/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivos;

/**
 *
 * @author christianjimenezcjs
 */
// OBTENER LAS EL TAMAÑO DE VARIABLES
//Array     lenght
//String    lenght()
//ArrayList size()
public class TestArrayPrimitivos {
    Object o;
    int x[],y;
    public static void main(String[] args) {
        System.out.println("Impresion de o: "+new TestArrayPrimitivos().o);
        System.out.println("Impresion de x: "+new TestArrayPrimitivos().x);
        
        //variables locales.
        // Formas de inicialización
            //Reservando espacio de memoria
                int [] x = new int[2];
                System.out.println("Array: "+x);
            // Pool (Solo se puede hacer cuando se declara e inicializa en la misma linea)
                int array2[] = {1,2,3,4,5};
                //System.out.println("Pos 5: "+array2[5]); //java.lang.ArrayIndexOutOfBoundsException
            // Instancia anónima
                int array3[] = new int[]{1,2,3,4,5};
        
    }
}
