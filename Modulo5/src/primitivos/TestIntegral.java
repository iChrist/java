/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivos;

/**
 *
 * @author christianjimenezcjs
 */
public class TestIntegral {
    public static void main(String[] args) {
        //byte 8 bits
        byte b = 127; // 2^7
        //short 16 bits
        short s = 32767; // 2^15
        //int 32 bits
        int i = 2147483647; //2^1
        //long 64 bits
        long l = 2147483648L;
        
        //SISTEMA BINARIO
        int binario = 0b1010;
        //SISTEMA OCTAL
        int octal = 010; // 0 (0-7)
        //SISTEMA HEXADECIMAL
        int hexa = 0xCAFE; //0-9(A-F)
        
        int cifra = 2_147_483_647; //CON JAVA SE 7 SE PUEDE SEPARAR POR _ CADA 3 DIGITOS
        
    }
}
