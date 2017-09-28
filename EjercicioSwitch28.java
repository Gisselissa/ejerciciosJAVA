/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch28;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch28 {

    /**
     * @param args the command line arguments
     * 28 – Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje
     * “Feliz verano” de lo contrario Informar “No es Verano”
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        
        switch (mesDelAño) 
        {
            case "enero": 
                System.out.println("Feliz verano");
                break;
                
            case "febrero":
                System.out.println("Feliz verano");
                break;
            
            default:
                System.out.println("No es verano");
                break;
        }
        
        
        
    }
    
}
