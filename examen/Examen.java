/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen {

    /**
     * @param args the command line arguments
     * Guía Inicial: pares a partir del ejercicio 4.
     * Guía If: impares (menos Ferreteria Ferrete). 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner miSc = new Scanner(System.in);
        
        Integer opcion;
        
        System.out.println("¿Que ejercicio quiere probar del 1 al 34?");
        String Aux=miSc.next();
        opcion= Integer.parseInt(Aux);
        
        switch(opcion){
            
            case 1:
                GuiaInicial.HacerEjercicio1();
                break;
                
            case 2:
                GuiaInicial.HacerEjercicio2();
                break;
                
            case 4:
                GuiaInicial.HacerEjercicio4();
                break;
                
            case 6:
                GuiaInicial.HacerEjercicio6();
                break;
                
            case 8:
                GuiaInicial.HacerEjercicio8();
                break;
                
            case 10:
                GuiaInicial.HacerEjercicio10();
                break;
                
            case 12:
                GuiaInicial.HacerEjercicio12();
                break;
                
            case 13:
                GuiaIf.HacerEjercicio13();
                break;
                
            case 15:
                GuiaIf.HacerEjercicio15();
                break;
                
            case 17:
                GuiaIf.HacerEjercicio17();
                break;
                
            case 19:
                GuiaIf.HacerEjercicio19();
                break;
                
            case 28:
                GuiaSwitch.HacerEjercicio28();
                break;
        }
       
        
       
    }
    
}
