/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
       informar cuánto dinero le corresponde a cada uno.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int cantidad;
        int montoTotal;
        int dinero;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        cantidad = miScanner.nextInt();
        
        System.out.println("Ingrese el monto total del premio: ");
        montoTotal = miScanner.nextInt();
        
        dinero = montoTotal / cantidad;
        
        System.out.println("El dinero que le corresponde a cada uno es: " + dinero);
        */
        String datoAux;
        Integer cantidad;
        Double montoTotal;
        Double dinero;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        datoAux = miScanner.next();
        cantidad = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el monto total del premio: ");
        datoAux = miScanner.next();
        montoTotal = Double.parseDouble(datoAux);
        
        dinero = montoTotal / cantidad;
        
        System.out.println("El dinero que le corresponde a cada uno es: " + dinero);
    }
    
}