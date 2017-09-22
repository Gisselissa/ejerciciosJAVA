/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif24;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf24 {

    /**
     * @param args the command line arguments
     * 24- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos
     * de alambre e informar cuantos metros de alambre necesitamos para 
     * completar las vueltas de alambre.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double ancho;
        Double largo;
        Integer hilos;
        Double total;
               
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el largo?");
        datoAux = miSc.next();
        largo = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto hilos de alambre necesita?");
        datoAux = miSc.next();
        hilos = Integer.parseInt(datoAux);
        
        total = ancho * largo * hilos;
                
        System.out.println("Se necesitan " + total + " metros de alambre");
        
    }
    
}
