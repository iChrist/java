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
public class TestJerarquiaOperadores {
    public static void main(String[] args) {
        double d1 = 3.0;
        int x =1;
        System.out.println(d1%x); //0.0
        
        System.out.println(d1*5+5*3);
        //1 ()
        //2 ++  Incremento    --   Decremento
        //3 * / %  Se evaluan de izquierda a derecha.
        //4 + -
        int x3=67;
        double d3 = 4.3;
        System.out.println(x3+ -56 * d3%2 /2 +34 /7+3.6);
        
     }
}
