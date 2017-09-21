/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer nota;
  
        System.out.println("Ingrese su nota: ");
        datoAux = miSc.next();
        nota = Integer.parseInt(datoAux);
        
        if (nota==10) {
            //los que 10
            System.out.println("Sos un genio");
        }
        else{
            //los menores a 10
            if (nota<10 && nota>7) {
                //los que 8 y 9
                System.out.println("Estas entre los mejores");
            }
            else{
                //los menores a 8
                if (nota>5) {
                    System.out.println("casi bien");
                }else{
                    if (nota<4) {
                        System.out.println("La próxima");
                    }else{
                        System.out.println("Casi mal");
                    }
                }
            }
        }
    }
    
}
