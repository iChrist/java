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
public class TestForSix {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==2){
                continue;
            }
            if(i==4){
                break;
            }
            System.out.println("i : "+i);
        }
    }
}
