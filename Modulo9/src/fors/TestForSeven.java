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
public class TestForSeven {
    public static void main(String[] args) {
        //label:
            //Segmentar nuestro código.
            //Convención de nombrar una variable.
        lable1:{
            int x = 89;
            System.out.println("X "+x);
        }
        label2:
        for (int i = 0; i < 6; i++)
            if(i==3)
                continue;
            else
                System.out.println("i = "+i);
    }
}
