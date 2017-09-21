/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif22;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer nota;
  
        System.out.println("Ingrese su nota: ");
        datoAux = miSc.next();
        nota = Integer.parseInt(datoAux);
        
        if (nota==10) {
            System.out.println("Sos un genio");
        }
        else{
            if (nota<10 && nota>=4) {
                System.out.println("Aprobó");
            }
            else {
                System.out.println("La próxima será...");
            }
        }
          
}
   
    
}
