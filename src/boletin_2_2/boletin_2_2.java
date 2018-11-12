package boletin_2_2;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class boletin_2_2 {
    
    public static void main(String[] args) {
    
    System.out.println("Introduzca grados celsius:");
    Scanner scanGC = new Scanner(System.in);
    float GC = scanGC.nextFloat();
    float GF =((GC * 9)/5)+32f;      
    float GK = GC + 274.15f;
         
    System.out.println("Grados Fahrenheit:" +GF);
    System.out.println("Grados Kelvin:" +GK);
    
    }

}
