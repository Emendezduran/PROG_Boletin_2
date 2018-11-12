/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_2_3;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class boletin_2_3 {
    
    public static void main(String[] args) {
            
    Scanner ler = new Scanner (System.in);
      
    System.out.println("Cantidad en Billetes de 100€:");
    float billetes100=ler.nextFloat();
    System.out.println("Cantidad en Billetes de 20€:");
    float billetes20=ler.nextFloat();
    System.out.println("Cantidad en Billetes de 5€:");
    float billetes5=ler.nextFloat();
    System.out.println("Cantidad en Monedas de 1€:");
    float monedas1=ler.nextFloat();
         
    float total = (billetes100 * 100)+(billetes20 * 20)+(billetes5 * 5)+(monedas1);
    System.out.println("Posees un total de: " +total +"€"); 

    }
}
