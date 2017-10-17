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
        
        System.out.println("¿Que ejercicio quiere probar del 1 al 45?");
        String Aux=miSc.next();
        opcion= Integer.parseInt(Aux);
        
        switch(opcion){
            
            case 1:
                GuiaInicial.HacerEjercicio1();
                break;
                
            case 2:
                GuiaInicial.HacerEjercicio2();
                break;
                
            case 3:
                GuiaInicial.HacerEjercicio3();
                break;
                
            case 4:
                GuiaInicial.HacerEjercicio4();
                break;
                
            case 5:
                GuiaInicial.HacerEjercicio5();
                break;
                
            case 6:
                GuiaInicial.HacerEjercicio6();
                break;
                
            case 7:
                GuiaInicial.HacerEjercicio7();
                break;
                
            case 8:
                GuiaInicial.HacerEjercicio8();
                break;
                
            case 9:
                GuiaInicial.HacerEjercicio9();
                break;
                
            case 10:
                GuiaInicial.HacerEjercicio10();
                break;
                
            case 11:
                GuiaInicial.HacerEjercicio11();
                break;
                
            case 12:
                GuiaInicial.HacerEjercicio12();
                break;
                
            case 13:
                GuiaIf.HacerEjercicio13();
                break;
                
            case 14:
                GuiaIf.HacerEjercicio14();
                break;
                
            case 15:
                GuiaIf.HacerEjercicio15();
                break;
                
            case 16:
                GuiaIf.HacerEjercicio16();
                break;
                
            case 17:
                GuiaIf.HacerEjercicio17();
                break;
                
            case 18:
                GuiaIf.HacerEjercicio18();
                break;
                
            case 19:
                GuiaIf.HacerEjercicio19();
                break;
                
            case 20:
                GuiaIf.HacerEjercicio20();
                break;
                
            case 22:
                GuiaIf.HacerEjercicio22();
                break;
                
            case 23:
                GuiaIf.HacerEjercicio23();
                break;
                
            case 24:
                GuiaIf.HacerEjercicio24();
                break;
                
            case 25:
                GuiaIf.HacerEjercicio25();
                break;
                
            case 26:
                GuiaIf.HacerEjercicio26();
                break;
                
            case 27:
                GuiaIf.HacerEjercicio27();
                break;
                
            case 28:
                GuiaSwitch.HacerEjercicio28();
                break;
                
            case 29:
                GuiaSwitch.HacerEjercicio29();
                break;
                
            case 30:
                GuiaSwitch.HacerEjercicio30();
                break;
                
            case 31:
                GuiaSwitch.HacerEjercicio31();
                break;
                
            case 32:
                GuiaSwitch.HacerEjercicio32();
                break;
                
            case 33:
                GuiaSwitch.HacerEjercicio33();
                break;
                
            case 34:
                GuiaSwitch.HacerEjercicio34();
                break;
                
            case 35:
                GuiaSwitch.HacerEjercicio35();
                break;
                
            case 36:
                GuiaWhile.HacerEjercicio36();
                break;
                
            case 37:
                GuiaWhile.HacerEjercicio37();
                break;
                
            case 38:
                GuiaWhile.HacerEjercicio38();
                break;
                
            case 39:
                GuiaWhile.HacerEjercicio39();
                break;
                
            case 40:
                GuiaWhile.HacerEjercicio40();
                break;
                
            case 41:
                GuiaWhile.HacerEjercicio41();
                break;
                
            case 42:
                GuiaWhile.HacerEjercicio42();
                break;
                
            case 43:
                GuiaWhile.HacerEjercicio43();
                break;
                
            case 44:
                GuiaWhile.HacerEjercicio44();
                break;
                
            case 45:
                GuiaWhile.HacerEjercicio45();
                break;
                
            case 46:
                GuiaWhile.HacerEjercicio46();
                break;
                
            case 47:
                GuiaWhile.HacerEjercicio47();
                break;
                
            case 48:
                GuiaWhile.HacerEjercicio48();
                break;
                
            case 49:
                GuiaWhile.HacerEjercicio49();
                break;
                
            case 50:
                GuiaWhile.HacerEjercicio50();
                break;
                
            case 51:
                GuiaWhile.HacerEjercicio51();
                break;
                
            case 52:
                GuiaWhile.HacerEjercicio52();
                break;
                
            case 53:
                GuiaWhile.HacerEjercicio53();
                break;
                
        }
       
        
       
    }
    
}
