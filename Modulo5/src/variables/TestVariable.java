/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author christianjimenezcjs
 */
public class TestVariable {

    //Atributos, Fields, Variables de instancia
    int myVariable;
    int $a; // Variable Web Component
    int _a; //Variable para referirse a una temporal
    private int x; // las variables de instancia pueden llevar los 4 modificadores de acceso
    public static void main(String[] args) {
        // En un contexto static no es permitido usar this ó super
        // Las variables locales debenm inicializarse antes de usarlas
        int x = 9;
        //Variable Local
        System.out.println("V. Local: "+x);
        //Variable 
    }
    
}
