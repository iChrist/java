/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmeticos;

/**
 *
 * @author christianjimenezcjs
 */
public class TestIncrementos {
    public static void main(String[] args) {
        int x = 8;
        /*double y = 9;
        System.out.println("x="+ ++x);
        System.out.println("y="+ y++);
        */
        x = 11;
        int x2 = 7;
        System.out.println(x++ * --x2 + 34 / 7 * x2++ % --x + x2++);
 
    }
}
