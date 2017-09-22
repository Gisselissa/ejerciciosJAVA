/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif27;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf27 {

    /**
     * @param args the command line arguments
     * 27- para una pileta se necesita saber la superficie, se debe pedir que 
     * tipo de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio
     * y si es cuadrada pedir el largo y el ancho, mostrar la superficie de la 
     * pileta.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        String superficie;
        Double largo;
        Double ancho;
        Double totalSup;
        Double radio;
        
        //la decisión debe ser "cuadrada" o "redonda"
        System.out.println("¿Diga si su pileta es cuadrada o redonda?");
        superficie = miSc.next();
                
        if ("cuadrada".equals(superficie)) {
            System.out.println("¿Cuánto es el largo");
            datoAux = miSc.next();
            largo = Double.parseDouble(datoAux);
            
            System.out.println("¿Cuánto es el ancho");
            datoAux = miSc.next();
            ancho = Double.parseDouble(datoAux);
            
            totalSup = largo * ancho;
            
            System.out.println("La superficie de la pileta es " + totalSup);
        }
        
        if ("redonda".equals(superficie)) {
            System.out.println("¿Cuánto es el radio");
            datoAux = miSc.next();
            radio = Double.parseDouble(datoAux);
            
            totalSup = radio * radio * 3.1416;
            
            System.out.println("La superficie de la pileta es " + totalSup);
            
        }
        
        
    }
    
}
