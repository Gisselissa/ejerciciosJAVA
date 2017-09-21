/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif14;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf14 {

    /**
     * @param args the command line arguments
     * 14- Se pide el sexo y el nombre, si es “f” de femenino, se muestra el
     * mensaje” feliz dia XXXXX”, donde XXXX es el nombre.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String sexo;
        String nombre;
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        
        if ("f".equals(sexo)) {
            System.out.println("Feliz día " + nombre);
        }
        
    }
    
}
