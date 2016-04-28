/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author christianjimenezcjs
 */
public class TestArrayListHomogeneo {
    public static void main(String[] args) {
        //Heterogeneas (Muchos tipos de datos)
        ArrayList heal = new ArrayList();
        heal.add("Damian");
        heal.add(67);
        heal.add(true);
        heal.add(23.56);
        //Homogeneas (1 solo tipo de dato)
        ArrayList<Integer> hoal = new ArrayList<Integer>();
        hoal.add(48);
        //hoal.add("NO ES INTEGER");
        
        List<String> al2 = new ArrayList<>();
        List<String> al3 = new ArrayList();
        List al4 = new ArrayList<String>(); // Objeto no Homogeneo
        
    }
}
