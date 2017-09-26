/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        String vacaciones;
        int edad;
        
        System.out.println("Vas de vacaciones: ");
        vacaciones = miSc.next();
        
        if ("si".equals(vacaciones)) 
        {
            System.out.println("Ingrese mes del año: ");
            mesDelAño = miSc.next();
            
            switch(mesDelAño){
            case "enero":
            case "febrero":    
                System.out.println("Lindo veranito");
                break;
                    
            case "julio":
                System.out.println("Lindo invierno");
                
                System.out.println("Ingrese su edad");
                edad = miSc.nextInt();
                
                if (edad>80) {
                    System.out.println("Vacunate contra la gripe");
                }
                break;
                
            
            default: 
                System.out.println("No estamos en verano");
                break;
            }
        }
        
    }
    
}
