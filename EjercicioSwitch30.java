/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch30;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch30 {

    /**
     * @param args the command line arguments
     * 30- Se ingresa un mes del año y si es Enero: "que comiences bien el año!”
     * , si es Marzo: "a clases!” , si es Julio: "se vienen las vacaciones!”
     * , si es Diciembre: "Felices fiesta!”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Que comiences bien el año");
                break;
                
            case "marzo":
                System.out.println("A clases");
                break;
                
            case "julio":
                System.out.println("Se vienen las vacaciones");
                break;
                
            case "diciembre":
                System.out.println("Felices Fiestas");
                break;    
            
        }
        
    }
    
}
