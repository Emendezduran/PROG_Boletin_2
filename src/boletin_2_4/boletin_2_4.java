
package boletin_2_4;

import java.util.Scanner;

public class boletin_2_4 {
    
    public static void main(String[] args) {
    
    System.out.println("Ingrese el monto en €");
    Scanner leerDinero = new Scanner (System.in);
    int dineroTotal = leerDinero.nextInt();
    
           
    int billetes100 = (dineroTotal/100);
    int billetes20 = (dineroTotal % 100)/20;
    int billetes5 =((dineroTotal % 100)%20)/5;
    int monedas1 = ((dineroTotal % 100)%20)%5;
   
    System.out.println("Cantidad de Billetes de 100€:" +billetes100);
    System.out.println("Cantidad de Billetes de 20€:" +billetes20);
    System.out.println("Cantidad de Billetes de 5€:" +billetes5);
    System.out.println("Cantidad de Monedas de 1€:" +monedas1);
    
    }
    
}
