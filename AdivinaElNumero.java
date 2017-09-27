/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        Integer numero;
        Integer numeroIngresado;
        String datoAux;
        Integer diferencia;
     
        Integer miNumeroSecreto = 3;//(int) (Math.random()*10)+1;
     
        //System.out.println("Número secreto " + miNumeroSecreto);
        System.out.println("Ingrese el número");
        datoAux = miSc.next();
        numeroIngresado = Integer.parseInt(datoAux);
        
        if (numeroIngresado==miNumeroSecreto) {
            System.out.println("Ganó");
        }
        else
        {
            if (numeroIngresado>miNumeroSecreto) {
                System.out.println("Te pasaste");
            }
            else{
                System.out.println("Falto");
            }
            
            diferencia = numeroIngresado - miNumeroSecreto;
            
            //"uso este Math.abs(diferencia) de abajo solo si no quiero usar el 
            //-1 y -2 etc".
            //diferencia = Math.abs(diferencia);
            
            //"este sout es para ver si me funciona (diferencia) y solo para eso, 
            //después lo saco".
            //System.out.println(diferencia);
            
            switch(diferencia)
            {   
                case -1:
                case 1:
                System.out.println("Casi casi");
                break;
                    
                case -2:
                case 2:
                System.out.println("Cerca");
                break;
                
                case -3:
                case 3:
                System.out.println("Ni Cerca");
                break;
                
                case -4:
                case 4:
                System.out.println("Bien lejos");
                break;
                
                default:
                System.out.println("Sos horrible en este juego");
                break;
                    
            }
            
        }//del else de if (numeroIngresado==miNumeroSecreto)
    }
    
}
