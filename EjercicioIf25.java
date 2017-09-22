/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif25;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf25 {

    /**
     * @param args the command line arguments
     * 25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de
     * 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad de
     * cada material que necesito.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer cal;
        Integer cemento;
        Double alto;
        Double ancho;
        Double superficie;
        Double totalCal;
        Double totalCemento;
        
        cal = 2;
        cemento = 3;
        
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el alto?");
        datoAux = miSc.next();
        alto = Double.parseDouble(datoAux);
        
        superficie = ancho * alto;
        totalCal = superficie * 2;
        totalCemento = superficie * 3;
        
        System.out.println("Necesita " + totalCal + " bolsas de cal");
        System.out.println("Necesita " + totalCemento + " bolsas de cemento");
        
    }
    
}
