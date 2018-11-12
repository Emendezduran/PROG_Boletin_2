
package boletin_2_5;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class boletin_2_5 {
    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner (System.in);
      
    System.out.println("Ingrese Sueldo fijo"); 
    float sueldoFijo = leer.nextFloat();
    
    System.out.println("Ingrese ventas");
    float ventas = leer.nextFloat();
    
    System.out.println("Ingrese kilometraje");
    float km = leer.nextFloat();
    
    System.out.println("Ingrese dias tabajados");
    float dias = leer.nextFloat();
    
    float sueldoBruto = sueldoFijo+(ventas*0.05f)+(km*2f)+(dias * 36f);
    
    float sueldoNeto = (sueldoBruto-(sueldoBruto*0.18f))-36f;
    
    System.out.println("Sueldo Bruto:"  +sueldoBruto);
    System.out.println("Sueldo Neto:"  +sueldoNeto);
    
    }
}
