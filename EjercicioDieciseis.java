/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodieciseis;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioDieciseis {

    /**
     * @param args the command line arguments
     * 16 - Se ingresa el importe de un pasaje de avión y el mes de viaje, si es
     * enero se le descuenta un 10% por temporada baja.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Double importe;
        Double total;
        String mes;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del pasaje: ");
        datoAux = miScanner.next();
        importe = Double.parseDouble(datoAux);
        
        System.out.println("Ingrese el mes del viaje: ");
        mes = miScanner.next();
    
        if ("enero".equals(mes)) {
            total = 0.90*importe;
            System.out.println("El importe total para el mes de enero es " + total);
        }
        else {
            System.out.println("Su importe total es " + importe);
        }
    }
    
}
