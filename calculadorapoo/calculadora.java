/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class calculadora {
    
    public static void ArrancarCalculadora()
    {
        Scanner miSc = new Scanner(System.in);
        String opcion;
        while(opcion.equals("no")){
        System.out.println("Bienvenido a la calculadora");
        calculadora.MostrarMenu();
       
        opcion=miSc.next();
        
        switch(opcion)
            {
                case "1":
                    calculadora.Sumar();
                    break;
                
                case "2":
                    calculadora.Restar();
                    break;
                    
                case "3":
                    calculadora.Multiplicar();
                    break;
                    
                case "4":
                    calculadora.Dividir();
                    break;
                    
                case "6":
                    System.out.println("Adios!!!");
                    break;
                    
                default:
                    System.out.println("Ingreso una opción equivocada");
            }
        }
    }
    
    private static void MostrarMenu()
    {
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("6-salir");
        System.out.println("Ingrese opción deseada ");
    }
    
}
