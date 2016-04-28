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
public class TestInicializacion {
    
    public static void main(String args[]){
        TestInicializacion ti = new TestInicializacion();
        ti.getInfo();
    }
    byte b;
    short s;
    int i;
    long l;
    //floating
    float f;
    double d;
    //textuales
    char c;
    //logicos
    boolean bo;
    //Variable de referencia
    String cadena;
    public void getInfo(){
        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("char: "+c);
        System.out.println("boolean: "+bo);
        System.out.println("Referencia: "+cadena);
    }
}
