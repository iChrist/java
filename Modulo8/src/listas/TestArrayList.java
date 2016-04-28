/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import java.lang.ref.WeakReference;
import java.util.*;
/**
 *
 * @author christianjimenezcjs
 */
public class TestArrayList {
    //Heterogeneos (Cualquier OBJETO se puede contener)
    //Solo Objetos, no primitivos.
    //Dinámicos (no se especifica tamaño inicial)
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        //Agregar 
        al.add(78); //Implicitamente el primitivo lo convierte en Integer.
        al.add(new Integer(78));
        al.add(0,"Salvador");
        al.set(1,"SUSTITUYE");
        System.out.println(al);
        System.out.println(al.get(1));
        al.remove(2);
        al.add(true);
        // Cuando verificas si lo contiene y son Wrappers o String (Compara valores)
        al.contains(new String("Salvador"));
    }
}
