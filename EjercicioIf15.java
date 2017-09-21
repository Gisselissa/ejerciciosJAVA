/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif15;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf15 {

    /**
     * @param args the command line arguments
     * 15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría y
     * es de sexo masculino, viviendo en morón, se muestra el mensaje “sos de morón”.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String nombre;
        String sexo;
        String localidad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        
        System.out.println("Ingrese su localidad: ");
        localidad = miSc.next();
        
        if ("Jose".equals(nombre) || "Maria".equals(nombre) && "m".equals(sexo) && "moron".equals(localidad)) {
            System.out.println("Sos de Morón");
        }
        
    }
    
}
