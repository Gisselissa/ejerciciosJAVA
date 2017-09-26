/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        int mesDelAño;
        //leemos la variable .next
        //parseamos
        System.out.println("Ingrese el mes del año");
        datoAux = miSc.next();
        mesDelAño = Integer.parseInt(datoAux);
        
        switch(mesDelAño)
        {
            case 1: 
                System.out.println("Es verano");
            break;
        }
        
        
      
        
    }
    
}
