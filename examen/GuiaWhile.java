/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 * 
 * 36- Mostrar todos los números pares del 1 al 100.
 * 
 * 37- Mostrar todos los números Impares del 1 al 100.
 * 
 * 38- Mostrar la suma de los primeros 100 números naturales.
 * 
 * 39- Pedir 10 números e informar cuantos pares ingresaron.
 * 
 * 40- Pedir 10 números e informar cuantos negativos, positivos y ceros
 * ingresaron.
 * 
 * 41- Pedir un número y mostrar todos sus antecesores hasta el cero.
 * 
 * 42- De un grupo de vehículos (no se sabe la cantidad) se necesita tomar el
 * color, informar cuantos rojo y cuantos azules, además del total de vehículos.
 * 
 * 43- Se piden los nombres de los alumnos, informar cuantas marías y cuantos
 * José hay en el curso, además de cuantos alumnos hay.
 * 
 * 44- Pedir un número e informar la suma de todos sus antecesores hasta el cero.
 * 
 * 45- Pedir edad a un grupo de personas e informar cuando niño, adolescentes y 
 * adultos hay en el grupo, además de informar el promedio de edad.
 * 
 */
public class GuiaWhile {
    
    public static void HacerEjercicio36()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int sumador;
        
        while (contador<=100) { 
            sumador=numero++;
            if (sumador%2==0) {
                System.out.println(sumador);
                
            }
            
            contador++;
        }
        
    }
    
    public static void HacerEjercicio37()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int sumador;
        
        while (contador<=100) { 
            sumador=numero++;
            if (sumador%2!=0) {
                System.out.println(sumador);
                
            }
            
            contador++;
        }
    }
    
    public static void HacerEjercicio38()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int suma=0;
        int contador=0;
        
        while (contador<100) { 
            numero++;
            System.out.println("numero es " + numero);
            suma = suma + numero;
            System.out.println("suma es " + suma);
            contador++;
        }
        
        System.out.println("La suma de los números naturales hasta el 100 es " + suma);
    }
    
    public static void HacerEjercicio39()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int sumador=0;
        int sumaPar=0;
        
        while (contador<10) { 
            System.out.println("Ingrese un número");
            numero=miSc.nextInt();
           
            if (numero%2==0) {
                System.out.println("Número par " + numero);
                sumaPar= sumaPar + 1;
            }
 
            contador++;
        }
        System.out.println("Ingresaron " + sumaPar + " pares");
    }
    
    public static void HacerEjercicio40()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int sumador=0;
        int sumaCero=0;
        int sumaPositivo=0;
        int sumaNegativo=0;
        
        while (contador<10) { 
            System.out.println("Ingrese un número");
            numero=miSc.nextInt();
           
            if (numero==0) {
                sumaCero= sumaCero + 1;
            }
            
            if (numero>0) {
                sumaPositivo = sumaPositivo + 1;
            }
            
            if (numero<0) {
                sumaNegativo = sumaNegativo + 1;
            }
 
            contador++;
        }
        System.out.println("Ingresaron " + sumaCero + " ceros");
        System.out.println("Ingresaron " + sumaPositivo + " positivos");
        System.out.println("Ingresaron " + sumaNegativo + " negativos");
        
    }
    
    public static void HacerEjercicio41()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int restador=0;
        
        System.out.println("Ingrese el número");
        numero = miSc.nextInt();
        
        numero = numero -1;
            
           while (contador<=numero) { 
               restador= numero--;
               System.out.println(restador);
            }
    }
    
    public static void HacerEjercicio42()
    {
        Scanner miSc = new Scanner(System.in);
        
        int contador=0;
        int sumaAutosRojos=0;
        int sumaAutosAzules=0;
        int sumaAutosTotal=0;
        String respuesta;
        String color;
        
        
         System.out.println("¿Desea ingresar un vehículo?");
         respuesta=miSc.next();
         
        while (respuesta.equals("si")) { 
            
            System.out.println("Ingrese el color");
            color=miSc.next();
            
            if (color.equals("rojo")) {
                sumaAutosRojos= sumaAutosRojos + 1;
            }
           
            if (color.equals("azul")) {
                sumaAutosAzules= sumaAutosAzules + 1;
            }
            
            sumaAutosTotal = sumaAutosRojos + sumaAutosAzules;
 
            contador++;
            System.out.println("¿Desea ingresar un vehículo más?");
            respuesta=miSc.next();
        }
        System.out.println("Ingresaron " + sumaAutosRojos + " rojos");
        System.out.println("Ingresaron " + sumaAutosAzules + " azules");
        System.out.println("Ingresaron " + sumaAutosTotal + " cantidad total de autos");
    }
    
    public static void HacerEjercicio43()
    {
        Scanner miSc = new Scanner(System.in);
        
        int contador=0;
        int sumaJose=0;
        int sumaMaria=0;
        int sumaNombresTotal=0;
        String respuesta;
        String alumno;
        
        
         System.out.println("¿Desea ingresar un alumno?");
         respuesta=miSc.next();
         
        while (respuesta.equals("si")) { 
            
            System.out.println("Ingrese nombre del alumno/a");
            alumno=miSc.next();
            
            if (alumno.equals("Jose")) {
                sumaJose= sumaJose + 1;
            }
           
            if (alumno.equals("Maria")) {
                sumaMaria= sumaMaria + 1;
            }
            
            sumaNombresTotal = sumaJose + sumaMaria;
 
            contador++;
            System.out.println("¿Desea ingresar un alumno más?");
            respuesta=miSc.next();
        }
        System.out.println("Ingresaron " + sumaJose + " José");
        System.out.println("Ingresaron " + sumaMaria + " María");
        System.out.println("Ingresaron " + sumaNombresTotal + " cantidad total de alumnos");
    }
    
    public static void HacerEjercicio44()
    {
       Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int restador=0;
        int sumador=0;
        
        System.out.println("Ingrese el número");
        numero = miSc.nextInt();
        //le resto un número para que aparezcan los números siguientes pero no el número que pongo
        numero = numero -1;
            
        while (contador<=numero) { 
            sumador=sumador+numero;
           
            restador=numero--;
            
        }
            System.out.println("La suma de todos los antecesores es " + sumador);
         
    }
    
    public static void HacerEjercicio45()
    {
        Scanner miSc = new Scanner(System.in);
        
        int contador=0;
        float adulto=0;
        float adolescente=0;
        float nino=0;
        float sumaTotal=0;
        float promedio;
        String respuesta;
        int edad;
        
        
        
         System.out.println("¿Desea ingresar la edad de alguna persona?");
         respuesta=miSc.next();
         
        while (respuesta.equals("si")) { 
            
            System.out.println("Ingrese edad");
            edad=miSc.nextInt();
            
            if (edad>=18) {
                adulto= adulto + 1;
            }
           
            if (edad>12 && edad<18) {
                adolescente= adolescente + 1;
            }
            
            if(edad<=12)
            {
               nino= nino + 1; 
            }
            
            sumaTotal = sumaTotal + edad;
            
            contador++;
            System.out.println("¿Desea ingresar la edad de alguna personas más?");
            respuesta=miSc.next();
        }
        
        promedio = sumaTotal / contador;
        
        System.out.println("Ingresaron " + adulto + " adultos");
        System.out.println("Ingresaron " + adolescente + " adolescentes");
        System.out.println("Ingresaron " + nino + " niños");
        System.out.println("El promedio de edad es: " + promedio);
        
    }
    
    
    
}
