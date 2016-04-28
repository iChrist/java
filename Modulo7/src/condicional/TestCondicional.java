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
public class TestCondicional {
    
    public static void main(String[] args) {
        // && comparacion and inteligente, si la primera es falsa ya no necesita evaluar la segunda
        // & compara and tonta, a nivel de bit
        if (comparacion(7) & comparacion(3)){
            System.out.println("true");
        }
        if (comparacion(3) & comparacion(7)){
            System.out.println("true");
        }
    
    }
    
    public static boolean comparacion(int x){
        if (x>=5) {
            System.out.println("x>=5");
            return true;
        } 
        else {
            System.out.println("x<5");
            return false;
        }
        
        
    }
    
    
}


