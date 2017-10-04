/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 * 1) Ingrese 5 números y sacar cantidad de números positivos. 
 * 2) Ingrese 5 números y sacar cantidad de pares.
 * 3) Ingrese 5 nombres y sacar cantidad de Marias. 
 * 
 * @author alumno
 */
public class GuiaWhile {
    public static void saludar(){
        System.out.println("saludo!!!");
    }
    
    public static void SacarCantidadDeMayores()
    {
        /*
        Pedir 5 edades e informar cuantos mayores a 18 hay.
        */
        Scanner miSc = new Scanner(System.in);
        
        Integer contador=0;
        String aux;
        Integer edad;
        Integer sumador=0;
        Integer mayores=0;
        Integer menores=0;
        
        while(contador<5)
        {
            System.out.println("Ingrese su edad " +contador);
            aux= miSc.next();
            edad=Integer.parseInt(aux);
            
            if (edad>17) {
                mayores=mayores+1;
            }
            else
            {
                menores=menores+1;
            }
            
            contador=contador+1;
        }
        
        System.out.println("Las personas mayores de edad son " + mayores);
        System.out.println("Las personas menores de edad son " + menores);
    } 
    
    public static void SacarCantidadDePositivos()
    {
          Scanner miSc = new Scanner(System.in);
        
        Integer contador=0;
        String aux;
        Integer numero;
        Integer sumador=0;
        Integer positivos=0;
        Integer negativos=0;
        
        while(contador<5)
        {
            System.out.println("Ingrese un número entero " +contador);
            aux= miSc.next();
            numero=Integer.parseInt(aux);
            
            if (numero>0) {
                positivos=positivos+1;
            }
            else
            {
                negativos=negativos+1;
            }
            
            contador=contador+1;
        }
        
        System.out.println("La cantidad de números positivos es de " + positivos);
        System.out.println("La cantidad de números negativos es de " + negativos);
    }
    
    public static void SacarCantidadDePares()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer contador=0;
        String aux;
        Integer numero;
        Integer sumador=0;
        Integer pares=0;
        Integer impares=0;
        
        while(contador<5)
        {
            System.out.println("Ingrese un número entero " +contador);
            aux= miSc.next();
            numero=Integer.parseInt(aux);
            
            if (numero%2==0) {
                pares=pares+1;
            }
            else
            {
                impares=impares+1;
            }
            
            contador=contador+1;
        }
        
        System.out.println("La cantidad de números pares es de " + pares);
        System.out.println("La cantidad de números impares es de " + impares);
    }
    
    public static void SacarCantidadDeMarias()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer contador=0;
        String aux;
        Integer numero;
        Integer sumador=0;
        Integer pares=0;
        Integer impares=0;
        
        while(contador<5)
        {
            System.out.println("Ingrese su nombre " +contador);
            nombre= miSc.next();
            
            
            if (numero%2==0) {
                pares=pares+1;
            }
            else
            {
                impares=impares+1;
            }
            
            contador=contador+1;
        }
        
        System.out.println("La cantidad de números pares es de " + pares);
        System.out.println("La cantidad de números impares es de " + impares);
    }
    
    public static void CuentaRegresiva()
    {
        Integer contador=0;
        Integer sumador=0;
        Integer cantidad;
        Integer promedio=0;
        
        cantidad=10;
        
        while (contador<cantidad) { 
            contador++;
            System.out.println("numero " + contador);            
            sumador= sumador+contador;
        }
        promedio=sumador/cantidad;
        System.out.println("El promedio es " + promedio);
    }
    
    public static void testing1(){
        Scanner miSc = new Scanner(System.in);
        
        String respuesta;
        String aux;
        Integer edad;
        Integer contador=0;
        Integer sumador=0;
        Integer promedio;
        
        System.out.println("¿Hay alguien para la edad?");
        respuesta=miSc.next();
        
        while (respuesta.equals("si")) 
        {   
            //tomo los datos
            System.out.println("Ingrese su edad: ");
            aux= miSc.next();
            edad=Integer.parseInt(aux);
            
            sumador=sumador+edad;
            contador++;
            
            System.out.println("¿Hay alguien más para la edad?");
            respuesta=miSc.next();
            
             if (edad>100) {
                respuesta="no";
            }
        }
        promedio=sumador/contador;
        System.out.println("El promedio es " + promedio);
    }
    
    public static void mostrarPares()
    {
        Integer contador=0;
        
        while (contador<100) {            
            
                     
            contador++;
                    
            if (contador%2==0) {
                //System.out.println("es par " + contador);
            }
            else
            {
                System.out.println("es impar " + contador);
            }
               
        }
        
    }
         
}
