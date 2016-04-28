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
public class TestArrayBidimensional {
    public static void main(String[] args) {
        //Arreglo de arreglos (un objeto que apunta a otro objeto)
        int []bidim[],var2;
        bidim = new int[3][2];
        
        var2 = new int[5];
        System.out.println("Length [0]: "+bidim.length);
        System.out.println("Length [0]: "+bidim[0].length);
    }
}
