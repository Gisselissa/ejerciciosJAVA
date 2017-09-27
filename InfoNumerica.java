/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     * Se brinda la información sobre un número ingresado.
     * modulo %
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Resultado;
        
        NumeroUno = 2;
        NumeroDos = 10;
        */
        /*
        Resultado = 2%10;
        System.out.println("El resultado es 2%10 " + Resultado);
        
        Resultado = 10%2;
        System.out.println("El resultado es 10%2 " + Resultado);
        
        Resultado = 11%2;
        System.out.println("El resultado es 11%2 " + Resultado);
        
        Resultado = 11%3;
        System.out.println("El resultado es 11%3 " + Resultado);
        */
        
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer NumeroIngresado;
        
        System.out.println("Ingrese un número");
        datoAux = miSc.next();
        NumeroIngresado = Integer.parseInt(datoAux);
        
        /*
        1- Informar si el número es mayor o menor a 100
        2- Si es positivo o negativo el número ingresado
        3-Informar si es par. 
        */
        
        //1- Informar si el número es mayor o menor a 100
        /*
        if (NumeroIngresado>100) {
            System.out.println("Su número es mayor a 100");
        }
        else{
            if (NumeroIngresado!=100) {
                System.out.println("Su número es menor a 100");
            }
        }
        */
        
        //2- Si es positivo o negativo el número ingresado
        /*Opción 1
        if (NumeroIngresado>0) {
            System.out.println("Su número es positivo");
        }
        else {
            if (NumeroIngresado!=0) {
                System.out.println("Su número es negativo");
            }
            
        }
        */
        /*Opción 2
        if (NumeroIngresado!=0) {
            if (NumeroIngresado>0) {
                System.out.println("Positivo");
            }
            else{
                System.out.println("Negativo");
            }
        }
        */

        //3-Informar si es par.
        
        /*if (NumeroIngresado%2==0) {
            System.out.println("Su número es par");
        }
        */
        
        
    }
    
}
