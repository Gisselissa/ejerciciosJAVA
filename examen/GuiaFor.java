/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 * FOR
 * Análisis   de   números
 * 
 *  53- Mostrar      la   cantidad   de   dígitos   de   un   número   ingresado.
 * 
 *  54- Mostrar   los   dígitos   de   un   número   ingresado.
 * 
 *  55- Mostrar   el   factorial   de   un   número   ingresado.
 * 
 *  56- Mostrar la suma de los dígitos de un número ingresado.
 * 
 *  57- Mostrar   si   un   número   es   un   palíndromo   ej:   43543   o   el
 *  343   o   el   81218.
 * 
 *  58- Mostrar   la   serie   “UTN-FRA”   ,   para   los   múltiplos   de
 *  3   =   “FRA”   ,   para   los   múltiplos   de   5   =   “UTN”   y para
 *  los   múltiplos   de   3   y   5   al   mismo   tiempo   mostrar   “UTN-FRA”.
 * 
 *  59- Mostrar   la   tabla   de   multiplicar   de   un   número   ingresado.
 * 
 *  60- Mostrar   el   número   al   revés   ej:   1362   =   2631.
 * 
 *  61- Mostrar   si   un   número   es   un   número   Armstrong.
 * 
 *  62- Informar   si   un   número   es   primo   o   no.
 * 
 *  63- Informar   todos   los   números   primos   del   1   al   1000. 
 * 
 *  64- Informar   si   un   número   es   centro   numérico.
 * 
 *  65- Informar   todos   los   centro   numéricos   hasta   el   millón.
 * 
 *  66-Informar   si   un   número   es   número   perfecto.
 * 
 *  67- Informar   todos   los   números   perfectos   hasta   el   millón. 
 * 
 *  68- Mostrar   la   serie   Fibonacci   hasta   el   dígito   20.
 * 
 *  69- Hacer   este   triángulo.
 *   X
 *   XXX                         
 *   XXXXX
 *   XXXXXXX.
 * 
 *  70- Hacer   el   triangulo   invertido.
 *
 *  71- Mostrar   el   patrón   de   números. 
 *    1
 *    12
 *    123
 *    1234
 *    12345
 * 
 *  72- Mostrar   el   patrón   de   letras a
 *  ab 
 *  abc 
 *  abcd 
 *  abcde
 * 
 *  73-Mostrar   la   pirámide   de   Pascal
 *  
 * @author sebastianurbina
 */
public class GuiaFor {
    
    public static void HacerEjercicio53()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numeroIngresado;
        int cantidadDeDigitos=0;
        
        System.out.println("Ingrese un número");
        numeroIngresado = miSc.nextInt();
        
        for (int numero = numeroIngresado; numero > 0; cantidadDeDigitos++) {
           numero = numero / 10; 
        }
       
        System.out.println("Cantidad de dígitos del número ingresado " + cantidadDeDigitos);
        
    }
    
    public static void HacerEjercicio54()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numeroIngresado;
        int cantidadDeDigitos=0;
        
        System.out.println("Ingrese un número");
        numeroIngresado = miSc.nextInt();
        
        for (int numero = numeroIngresado; numero > 0; cantidadDeDigitos++) {
            numero = numero / 10;
        }
         
        int digito;
        int suma=0;
        int auxNumero = numeroIngresado;
   
        
        while (auxNumero>0) 
        {            
          digito = auxNumero%10;
          suma = suma + (int) Math.pow(digito, cantidadDeDigitos);
          auxNumero = auxNumero/10;
          System.out.println(digito);  
        }
        
        
    }
    
    public static void HacerEjercicio55()
    {
        //Ej.: El factorial de 5 es: 5*4*3*2*1=120
        double factorial=1;
        int numero;
        
        Scanner miSc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        numero = miSc.nextInt();
        
        for (int contador = numero; contador > 0; contador--) {
            factorial = factorial * contador;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    public static void HacerEjercicio56()
    {
        
    }
    
}//Termina la class GuiaFor
