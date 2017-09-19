/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * Se pide ingresar una clave, si es "UTN750" se mostrará el mensaje "Bienvenido", de lo contrario el mensaje será "Clave errónea".
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        String clave;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese su clave: ");
        clave = miScanner.next();
        
        //if (clave == "UTN750"){
            if ("UTN750".equals(clave)) {
            System.out.println("Bienvenido");    
        }
        else{
            System.out.println("Su clave es errónea");
        }  
    }
    
}
