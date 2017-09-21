/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif18;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf18 {

    /**
     * @param args the command line arguments
     * 18- Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”
     * de lo contrario mostrar el mensaje “clave incorrecta".
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer clave;
        
        System.out.println("Ingrese su clave");
        datoAux = miSc.next();
        clave = Integer.parseInt(datoAux);
        
        //Si la clave es correcta bienvenido
          if (123 == clave) {
            System.out.println("Bienvenido");
          }
          else {
              System.out.println("Clave incorrecta");
          }    
        
        
        
    }
    
}
