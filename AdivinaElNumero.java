/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     * Informar si: 
     * a) Si le erró por un punto. Mensaje "Casi casi".
     * b) Si le erró por dos puntos. Mensaje "Cerca".
     * c) Si le erró por tres puntos. Mensaje "Ni cerca".
     * d) Si le erró por cuatro puntos. Mensaje "Bien lejos".
     * e) Para todos los demás. Mensaje "Sos horrible en este juego".
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
      /**  
        String datoAux;
        Integer numero;
        
        Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 10
        int intAletorio = aleatorio.nextInt(10);
        // Más código

        // Refrescar datos aleatorios 
        aleatorio.setSeed(System.currentTimeMillis());
        
        System.out.println("Ingrese el numero");
        datoAux = miSc.next();
        numero = Integer.parseInt(datoAux);
        
        if (intAletorio==numero) {
            System.out.println("Acertó el número");
        }
        else{
            System.out.println("No acertó");
        }
      
        **/
     
     Integer numero;
     Integer numeroIngresado;
     String datoAux;
     
     Integer miNumeroSecreto = (int) (Math.random()*10)+1;
     
        //System.out.println("Número secreto " + miNumeroSecreto);
        System.out.println("Ingrese el número");
        datoAux = miSc.next();
        numeroIngresado = Integer.parseInt(datoAux);
        
        if (miNumeroSecreto == numeroIngresado) {
            System.out.println("Ganó");
        }else
        {
            if (numeroIngresado>miNumeroSecreto) {
                System.out.println("Te pasaste");
            }else 
            {
                System.out.println("Te faltó");
            }
            
        }
        
        
    }
    
}
