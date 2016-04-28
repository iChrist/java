/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package condicional;

/**
 *
 * @author ALASS
 */
public class TestXor {
    
    public static void main(String[] args) {
        int x=3000;
        int y=1500;
        
        System.out.println(x^y*2);
        
        boolean a=true;
        boolean b=false;
        System.out.println(a^b);
        
        //3000 - 1011 1011 1000
        //1500 - 0101 1101 1100
        System.out.println(x&y);
                
    }
    
}
