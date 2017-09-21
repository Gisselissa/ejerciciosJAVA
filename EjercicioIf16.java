/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif16;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf16 {

    /**
     * @param args the command line arguments
     * 16-Se debe ingresar un edad  e  informar si es mayor de edad o no.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer edad;
        
        System.out.println("Ingrese su edad: ");
        datoAux = miSc.next();
        edad = Integer.parseInt(datoAux);
        
        if (edad>17) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("No es mayor de edad");
        }
        
    }
    
}
