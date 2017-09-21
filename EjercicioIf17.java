/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif17;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf17 {

    /**
     * @param args the command line arguments
     * 
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
        
        if (edad>17) 
        {
            System.out.println("es mayor");
        }
        else
        {
            //son menores a 18
            if (edad<13) 
            {
                System.out.println("es niño"); 
            }else{
                System.out.println("es adolescente");
            }
        }

    }
    
}
