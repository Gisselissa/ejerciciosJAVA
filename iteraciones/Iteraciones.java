/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraciones;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Iteraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //GuiaWhile.saludar();
        //GuiaWhile.SacarCantidadDeMayores();
        //GuiaWhile.SacarCantidadDePositivos();
        //GuiaWhile.SacarCantidadDePares();
        //GuiaWhile.CuentaRegresiva();
        //GuiaWhile.testing1();
        GuiaWhile.mostrarPares();
        
        // TODO code application logic here
        /**
         * Diferencia entre If y While.
        Integer edad = 18;
        
         while (edad<17) {
            System.out.println("Hola es menor");
        }
        
        while (edad>17)
        {
            System.out.println("Hola es mayor");
        }
        **/
        
        Scanner miSc = new Scanner(System.in);
        /**
        Integer contador=0;
        String aux;
        Integer edad;
        Integer sumador=0;
        Integer promedio;
        
        while(contador<3)
        {
            System.out.println("Ingrese su edad " +contador);
            aux= miSc.next();
            edad=Integer.parseInt(aux);
            
            sumador= sumador+edad;
            contador=contador+1;
        }
        promedio=sumador/3;
        System.out.println("El promedio es " + promedio);
        **/
        
        String respuesta;
        Integer contador=0;
        
        System.out.println("¿Hay alguien para la edad?");
        respuesta=miSc.next();
        
        while (respuesta.equals("si")) 
        {   
            //tomo los datos
            //System.out.println("Ingrese su edad: ");
            
            contador++;
            
            System.out.println("¿Hay alguien más para la edad?");
            respuesta=miSc.next();
        }
        
    }
    
}
