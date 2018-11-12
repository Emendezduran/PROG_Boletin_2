
package boletin_2_1;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class boletin_2_1 {

    public static void main(String[] args) {
              
        float PR, PA;
         
         Scanner ler = new Scanner (System.in);
         System.out.println("Ingrese el Precio Real");
         PR=ler.nextFloat();
         System.out.println("Ingrese el Precio Aplicado");
         PA=ler.nextFloat();
         
         float PD = (PA * 100)/PR;
         System.out.println("Le han aplicado el" +PD +"%");
    }
    
}
