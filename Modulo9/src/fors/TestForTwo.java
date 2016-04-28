/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fors;

/**
 *
 * @author christianjimenezcjs
 */
public class TestForTwo {
    public static int count = 0;
    public static void main(String[] args) {
        for(System.out.println("1. Inicialización."); condicion();System.out.println("4. Incremento o Decremento.")){
            System.out.println("3. Ejecucion del cuerpo del for.");
        }
    }
    public static boolean condicion(){
        System.out.println("2. Expresión booleana.");
        count++;
        if(count<=5){
            return true;
        }else{
            return false;
        }
    }
    
    
}
