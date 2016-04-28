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
public class TestAddition {
    public static void main(String[] args) {
        int x = 67;
        int y = 78;
        double z = 23.8;
        
        System.out.println(x+y); //145
        System.out.println(x+y+"5"); //1455
        System.out.println("5"+x+y); //56778
        
        System.out.println(x+z); // 90.8
    }
}
