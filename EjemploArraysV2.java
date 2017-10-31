/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysv2;


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploArraysV2 {
    
   
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        
        /*int[] algo;
        String[] otro;
        /// cargar
        for (int f = 0; f < 10; f++) {
            
        }
        
         EjemploArraysV2.CargarDatosDos(algo,otro);
         
    */    
        
        String[] alumno={"maria", "manuel", "diego", "estela", "martin"};
        int[] notas = {10,2,5,2,7};
        
        int aux;
        aux = EjemploArraysV2.mostrarCantidadDeAprobados(notas);
        System.out.println(aux);
        
        int aux2;
        aux2 = EjemploArraysV2.RetornarPromedio(notas);
        System.out.println(aux2);
        
        String aux3;
        aux3 = EjemploArraysV2.RetornarElNombreDeLaMejorNota(notas, args);
        System.out.println(aux3);
    }
    
    public static int mostrarCantidadDeAprobados(int[] miParametro){
     
        
     int resultado=0;
        
        for (int i = 0; i < miParametro.length; i++) 
        {
            if (miParametro[i]>3) 
            {
                resultado++;
            }
        }
     
     return resultado;
    }
    
    public static int RetornarPromedio(int[] miParametro)
    {
        int resultado=0;
        int suma=0;
        int promedio;
        
        for (int i = 0; i < miParametro.length; i++) 
        {
            suma = suma + miParametro[i];
        }
        promedio = suma/miParametro.length;
        System.out.println("El promedio es " + promedio);
        
     return resultado;
    }
    
    public static String RetornarElNombreDeLaMejorNota(int[] notas, String[] nombres)
    {
        String retorno="";
        
        for (int i = 0; i < ; i++) 
        {
            
        }
        
        return retorno;
    }
    
    
    public static void mostrarNombres(String[] ListadoDePalabras)
    {
        for (int f = 0; f < ListadoDePalabras.length; f++) {
            System.out.println("La palabras es " + ListadoDePalabras[f]); 
        }
        
    }
    
    public static void MostrarPromedio(int[] ListadodeNumeros)
    {
        for (int f = 0; f < ListadodeNumeros.length; f++) {
            System.out.println("El promedio es " + ListadodeNumeros[f]);
        }
    }
    
    public static void CargarDatosDos(int[] listadoNotas, String[] ListadoDePalabras)
    {
        Scanner miSc = new Scanner(System.in);
        
        String nombres[];
        nombres = new String[3];
        
        int notas[];
        notas = new int[3];
        
        for (int f = 0; f < 3; f++) 
        {
            System.out.println("Ingrese su nombre");
            nombres[f] = miSc.next();
            
            System.out.println("Ingrese su nota");
            notas[f] = miSc.nextInt();
        }
    }
    
    public static void CargarDatos(int cantidad)
    {
        Scanner miSc = new Scanner(System.in);
        
        String nombres[];
        nombres = new String[cantidad];
        
        int notas[];
        notas = new int[cantidad];
        
        for (int f = 0; f < cantidad; f++) 
        {
            System.out.println("Ingrese su nombre");
            nombres[f] = miSc.next();
            
            System.out.println("Ingrese su nota");
            notas[f] = miSc.nextInt();
        }
    }
    
    public static void CargarDatos()
    {
        //array de nombres
        //array de notas
        //pedir tres notas y tres nombres
        //mostrar los dos arrays
        //saco el promedio
        
     
        Scanner miSc = new Scanner(System.in);
        
        String nombres[];
        nombres = new String[3];
        
        int notas[];
        notas = new int[3];
        
        int suma=0;
        int promedio;
        
        for (int f = 0; f <= 2; f++) 
        {
            System.out.println("Ingrese su nombre");
            nombres[f] = miSc.next();
            
            System.out.println("Ingrese su nota");
            notas[f] = miSc.nextInt();
        }
        
        for (int f = 0; f <= 2; f++) 
        {
            System.out.println("El nombre es " + nombres[f]);
            System.out.println("La nota es " + notas[f]);
        }
        
        for (int f = 0; f < 3; f++) {
             suma = suma + notas[f];
        }
        promedio = suma/3;
        System.out.println("El promedio es " + promedio);
    }
    
}//nada debajo de esto
