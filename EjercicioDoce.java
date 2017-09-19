/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Double importeProducto;
        Double impuestos;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del producto importado: ");
        datoAux = miScanner.next();
        importeProducto = Double.parseDouble(datoAux);
        
        total = 1.35*importeProducto;
        
        System.out.println("El precio final del producto es: " + total);
        
        
    }
    
}
