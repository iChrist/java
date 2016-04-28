/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promotion;

/**
 *
 * @author christianjimenezcjs
 */
public class TestPromotion {
    public static void main(String[] args) {
        byte b =125;
        int i = b; // Promotion 32 bits -> 8 bits
        
        long l = 56789;
        int s = (int)l;//32 bits -> 64 bits
        System.out.println(s);
        System.out.println(Short.MAX_VALUE);
        
        int myInt = 127;
        byte myByte = (byte)(myInt+2);
        System.out.println(myByte);
        
    }
}
