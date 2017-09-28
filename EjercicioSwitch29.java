/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch29;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch29 {

    /**
     * @param args the command line arguments
     * 29- Se ingresa un mes del año, si es febrero o enero, mostrar el mensaje
     * “Iniciando el año” ,si es junio o julio el mensaje” Mitad del año” y si 
     * es diciembre el mensaje fin de año.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String mesDelAño;
        
        System.out.println("Ingrese el mes del año");
        mesDelAño = miSc.next();
        
        switch(mesDelAño)
        {
            case "enero":
                System.out.println("Iniciando el año");
                break;
                
            case "febrero":
                System.out.println("Iniciando el año");
                break;
                
            case "junio":
                System.out.println("Mitad de año");
                break;
                
            case "julio":
                System.out.println("Mitad de año");
                break;
                
            case "diciembre":
                System.out.println("Fin de año");
                break;
        }
        
    }
    
}
