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
public class GuiaInicial {
    
    public static void saludar() {
        System.out.println("Buenas tardes");
    } 
    
    public static void HacerEjercicio1() {
        System.out.println("Esto funciona de maravilla");
    }
    
    public static void HacerEjercicio2() {
        Scanner miSc = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = miSc.next();
        System.out.println("Su nombre es " + nombre);
    }
    
    public static void HacerEjercicio4(){
        /*
        *Al ingresar la edad y el nombre mostrar el siguiente mensaje: 
        *“ Usted se llama “ XXXXXX y
        *tiene XX años de edad”.
        **/
        int edad;
        String nombre;
        Scanner miEscanerNuevo = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad= miEscanerNuevo.nextInt();
        System.out.println("Ingrese su nombre: ");
        nombre= miEscanerNuevo.next();
        System.out.println("Usted se llama " + nombre + " y tiene " + edad + " años de edad");
    }
    
    public static void HacerEjercicio6(){
        /**
        *Se piden tres números e informar el promedio.
        * */
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int suma;
        int promedio;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        numeroUno= miScanner.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        numeroDos= miScanner.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        numeroTres= miScanner.nextInt();
        
        suma = numeroUno + numeroDos + numeroTres;
        promedio = suma / 3;
        
        System.out.println("El promedio es " + promedio);
    }
    
    public static void HacerEjercicio8(){
    /**
    * Se pide el largo y ancho de un terreno u se pide la superficie del mismo.
    * 
    **/ 
        int largo;
        int ancho;
        int superficie;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el largo: ");
        largo= miScanner.nextInt();
        
        System.out.println("Ingrese el ancho: ");
        ancho= miScanner.nextInt();
        
        superficie = largo * ancho;
        
        System.out.println("El promedio es " + superficie);
    }
    
    public static void HacerEjercicio10(){
    /**
     *  Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
     * informar cuánto dinero le corresponde a cada uno.
     **/
        String datoAux;
        Integer cantidad;
        Double montoTotal;
        Double dinero;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        datoAux = miScanner.next();
        cantidad = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el monto total del premio: ");
        datoAux = miScanner.next();
        montoTotal = Double.parseDouble(datoAux);
        
        dinero = montoTotal / cantidad;
        
        System.out.println("El dinero que le corresponde a cada uno es: " + dinero);
    
    }
    
    public static void HacerEjercicio12(){
    /**
     * Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
     *  internos.
     *
     */
        String datoAux;
        Double importeProducto;
        Double impuestos;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe del producto importado: ");
        datoAux = miScanner.next();
        importeProducto = Double.parseDouble(datoAux);
        
        total = 1.35*importeProducto;
        
        System.out.println("El precio final del producto es: " + total);
    
    }
}
