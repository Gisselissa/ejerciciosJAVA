/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch33;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch33 {

    /**
     * @param args the command line arguments
     * 33-al ingresar un signo del zodíaco devolver el nombre de la imagen 
     * asociada a ese signo
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String signoZ;
        
        System.out.println("Ingresar su signo del zodíaco: ");
        signoZ = miSc.next();
        
        switch(signoZ)
        {
            case "aries":
                System.out.println("El Carnero");
                break;
                
            case "tauro":
                System.out.println("El Toro");
                break;
                
            case "geminis":
                System.out.println("Los Gemelos");
                break;
                
            case "cancer":
                System.out.println("El Cangrejo");
                break;
                
            case "leo":
                System.out.println("El León");
                break;
                
            case "virgo":
                System.out.println("La virgen");
                break;
                
            case "libra":
                System.out.println("La balanza");
                break;
                
            case "escorpio":
                System.out.println("El Escorpion");
                break;
                
            case "sagitario":
                System.out.println("El Arquero");
                break;
                
            case "capricornio":
                System.out.println("La Cabra");
                break;
                
            case "acurario":
                System.out.println("El Aguador");
                break;
                
            case "piscis":
                System.out.println("Los peces");
                break;
            
            
        }
        
    }
    
}
