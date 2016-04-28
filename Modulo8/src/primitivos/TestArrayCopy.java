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
public class TestArrayCopy extends base{
    public static void main(String[] args) {
//        int [] origen = new int[]{1,2,3,4,5,6,7,8,9,0};
//        int [] destino = new int[10];
//        //System.arraycopy(args, srcPos, destino, destPos, length);
//        System.arraycopy(origen, 3, destino, 0, 3);
//        for (int e : destino) {
//            System.out.println("e "+e);
//        }
        int [] x [] = {{1,2},{3,4,5},{6,7,8,9}};
        int [][] y =x;
        System.out.println(y[2][1]);
    }
}
class base {
    public static void main(String[] args) {
        System.out.println(args);
    }
}