/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch31;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioSwitch31 {

    /**
     * @param args the command line arguments
     * 31- Se ingresa un mes del año al seleccionar un mes informar: si tiene 
     * 28 días ,si tiene 30 días, si tiene 31 días.
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
                System.out.println("Tiene 31 días");
                break;
                
            case "febrero":
                System.out.println("Tiene 28 días");
                break;
                
            case "marzo":
                System.out.println("Tiene 31 días");
                break;
                
            case "abril":
                System.out.println("Tiene 30 días");
                break;
                
            case "mayo":
                System.out.println("Tiene 31 días");
                break;
                
            case "junio":
                System.out.println("Tiene 30 días");
                break;
                
            case "julio":
                System.out.println("Tiene 31 días");
                break;
                
            case "agosto":
                System.out.println("Tiene 31 días");
                break;
                
            case "septiembre":
                System.out.println("Tiene 30 días");
                break;
                
            case "octubre":
                System.out.println("Tiene 31 días");
                break;
                
            case "noviembre":
                System.out.println("Tiene 30 días");
                break;
                
            case "diciembre":
                System.out.println("Tiene 31 días");
                break;
                
        }
            
            
    }
    
}
