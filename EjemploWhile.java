/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.PedirNumeros();
        EjemploWhile.MostrarMenu();
        
    }//finaliza el main
    
    /**
     * Pide dos números e informa el promedio.
     * 
     */
    
    public static void PromedioConIf()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numeroUno;
        Integer numeroDos;
        Integer promedio;
        String datoAux;
        
        System.out.println("Ingrese el número uno");
        datoAux = miSc.next();
        numeroUno = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el número dos");
        datoAux = miSc.next();
        numeroDos = Integer.parseInt(datoAux);
        
        promedio = (numeroUno + numeroDos) / 2;
        System.out.println("El promedio es: " + promedio);
        
    }//finaliza promedio con if
    
    /**
     * Pide dos números e informa el promedio.
     * 
     */
    
    public static void PromedioConWhile()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numero;
        Integer promedio;
        Integer contador=0;
        Integer suma=0;
        String datoAux;
        
        while (contador<3) 
        {
            contador++;
            System.out.println("Ingrese el número " + contador);
            datoAux = miSc.next();
            numero = Integer.parseInt(datoAux);
            
            suma = suma + numero;
            
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
        
    }
    
    /**
     * Cuando no sabemos la cantidad de iteraciones. 
     */
    
    public static void IteracionSinCantidad()
    {
        String continuar="si";
        while(!continuar.equals("no"))
            {
                System.out.println("Hola, desea continuar ");
                Scanner miSc = new Scanner(System.in);
                continuar = miSc.next();
            }
        
    }
    
    public static void SalidaPorLogica()
    {
        String continuar="si";
            while(true)
            {
                System.out.println("Hola, desea continuar ");
                Scanner miSc = new Scanner(System.in);
                continuar = miSc.next();
                if (continuar.equals("no")) 
                {
                    break;
                }
            }
    }
    
    public static void PedirNumeros()
    {
        Integer numero;
        Integer contador=0;
        Integer suma=0;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        while (contador<10 && suma<50) 
        {   
            contador++;
            System.out.println("Ingrese el número " + contador + ":");
            datoAux=miSc.next();
            numero=Integer.parseInt(datoAux);
            suma = suma + numero;
            /**if (suma>50)
            {
                break;
            }
            **/ 
        }
        System.out.println("La suma es " + suma);
        System.out.println("La cantidad es " + contador);
        
    }
    
    public static void MostrarMenu()
    {
        String opcion="nada";
        
        Scanner miSc = new Scanner(System.in);
        
        while (!opcion.equals("6")) 
        {   
            
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("6-salir");

            System.out.println("Ingrese opción deseada ");
            opcion=miSc.next();
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                
                case "2":
                    EjemploWhile.Restar();
                    break;
                    
                case "3":
                    EjemploWhile.Multiplicar();
                    break;
                    
                case "4":
                    EjemploWhile.Dividir();
                    break;
                    
                case "6":
                    System.out.println("Adios!!!");
                    break;
                    
                default:
                    System.out.println("Ingreso una opción equivocada");
            }
            
        }
        //del while
        System.out.println("Cerró el menu");
        
        
       
    }
    
    public static void Sumar()
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
    
    public static void Restar()
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
    
    public static void Multiplicar()
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
    
    public static void Dividir()
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
