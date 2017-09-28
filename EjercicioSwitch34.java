/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch34;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch34 {

    /**
     * @param args the command line arguments
     * 34- Se pide un día de la semana, si es lunes mostrar el mensaje  
     * “Buen comienzo”, para el resto de los días hábiles mostrar” a aguantar “
     * si es sábado o domingo  mostrar “ Buen fin de”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String diaSemana;
        
        System.out.println("Ponga día de la semana: ");
        diaSemana = miSc.next();
        
        switch(diaSemana)
        {
            case "lunes":
                System.out.println("Buen comienzo de semana");
                break;
            
            case "sabado":
                System.out.println("Buen finde");
                break;
                
            case "domingo":
                System.out.println("Buen finde");
                break;
                
            default:
                System.out.println("A aguantar");
                break;
        
        }
        
        
    }
    
}
