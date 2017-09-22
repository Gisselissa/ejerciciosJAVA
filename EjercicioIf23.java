/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif23;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf23 {

    /**
     * @param args the command line arguments
     * 23- Debemos pedir el ancho y el largo de un terreno e informar cuantos
     * metros de alambre necesitamos para dar tres (3) vueltas de alambre.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double ancho;
        Double largo;
        Double totalUno;
        Double totalFinal;
        
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el largo?");
        datoAux = miSc.next();
        largo = Double.parseDouble(datoAux);
        
        totalUno = ancho * largo;
        totalFinal = totalUno * 3;
        
        System.out.println("Se necesitan " + totalFinal + " metros de alambre");
        
    }
    
}
