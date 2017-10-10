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
        String opcion="algo";
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
    
     private static void Sumar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + resultado);
    }
     
     private static void Restar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno - numeroDos;
        System.out.println("El resultado de la resta es: " + resultado);
    }
     
     private static void Multiplicar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno * numeroDos;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
     
     private static void Dividir()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno / numeroDos;
        System.out.println("El resultado de la división es: " + resultado);
    }
    
}
