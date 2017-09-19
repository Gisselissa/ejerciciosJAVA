/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad y precio de un producto y se informa el total a pagar.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cantidad;
        int precio;
        int total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        cantidad = miScanner.nextInt();
        
        System.out.println("Ingrese precio: ");
        precio = miScanner.nextInt();
        
        total = cantidad * precio;
        
        System.out.println("El precio total a pagar es " + total);
        */
        
        String datoAux;
        Integer cantidad;
        Double precio;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        datoAux = miScanner.next();
        cantidad = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese precio: ");
        datoAux = miScanner.next();
        precio= Double.parseDouble(datoAux);
        
        total = cantidad * precio;
        
        System.out.println("El precio total a pagar es " + total);
        
    }
    
}