/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner miSc = new Scanner(System.in);
        
        String clave;
        /*
        System.out.println("Ingrese clave");
        clave = miSc.next();
        
        while(!clave.equals("1234"))
        {
            System.out.println("Error Re-Ingrese clave");
            clave = miSc.next();
        }
        
            System.out.println("Bienvenido");
        */
        
        Integer miContador=0;
        
        while(miContador<3)
        {   
            miContador=miContador+1;
            System.out.println("Contando");
        }
        
        System.out.println("Terminé");
        
        
    }
    
}
