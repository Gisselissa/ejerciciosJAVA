/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif19;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf19 {

    /**
     * @param args the command line arguments
     * 19- se ingresa un importe, si supera los 100 pesos se  le suma un 
     * impuesto del 23%, si no se les descuenta el 50%
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Double importe;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe: ");
        datoAux = miScanner.next();
        importe = Double.parseDouble(datoAux);
        
        if (importe>100)
        {
            total = 1.23*importe;
            System.out.println("El precio final es: " + total);
        }
        else
        {
            total = 0.50*importe;
            System.out.println("El precio final es: " + total);
        }
    }
    
}
