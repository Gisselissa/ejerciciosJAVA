/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif13;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf13 {

    /**
     * @param args the command line arguments
     * 13- Se ingresa un color y una localidad, si es avellaneda o Lanús y el 
     * color es rojo, mostrar el mensaje “sos de independiente”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner miSc = new Scanner(System.in);
    
    String localidad;
    String colorFavorito;
    
    System.out.println("Ingrese su localidad: ");
    localidad = miSc.next();
        
    System.out.println("Ingrese su color favorito: ");
    colorFavorito = miSc.next();
    
    if ("rojo".equals(colorFavorito) && "avellaneda".equals(localidad) || "lanus".equals(localidad)) {
                 System.out.println("Sos de Independiente");
        }
        
    }
    
}
