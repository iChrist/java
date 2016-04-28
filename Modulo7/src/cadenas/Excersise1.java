/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadenas;

/**
 *
 * @author ALASS
 */
public class Excersise1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("H")+"e"+"l"+"l"+"o";
        if (s1==s2){
            System.out.println("same");
        }
        if (s1.equals(s2)){
            System.out.println("same 2");
        }
    }
    
}

class Exercise2 {
    public static void main(String[] args) {
        String s1 = "Jose" + "fina";
        String s2 = "Jo"+"sefi"+"na";
        String s3 = "Jose";
        String s4 = s3+"fi"+"na";
        String s5 = s3+"fina";
        
        System.out.println(s1==s2);//True
        System.out.println(s2==s3);//False
        System.out.println(s3==s4);//False
        System.out.println(s4==s5);//False
        System.out.println("Josefina"==s1);//True
        
        
        
        
        
    }
}