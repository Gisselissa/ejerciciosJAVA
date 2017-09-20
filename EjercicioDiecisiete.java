/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiecisiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDiecisiete {

    /**
     * @param args the command line arguments
     * Se pide una edad y se informa si es niño, adolescente o mayor de edad 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer edad;
//        
        System.out.println("Ingrese su edad: ");
        datoAux = miSc.next();
        edad = Integer.parseInt(datoAux);
//        
//        if (edad<12) {
//            System.out.println("Es niño");
//        }
//        if (edad>12 && edad<18) {
//            System.out.println("Es adolescente");
//        }
//        if (edad>18) {
//            System.out.println("Es mayor de edad");
//        }
        
        
        
//        if (edad>17) {
//            System.out.println("Es mayor");
//        }
//         if (edad>13) {
//            System.out.println("Es niño");
//        }
//        if (edad>12 && edad<18) {
//            System.out.println("Es adolescente");
//        }
        
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
