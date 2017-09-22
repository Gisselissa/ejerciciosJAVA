/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioif26;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioIf26 {

    /**
     * @param args the command line arguments
     * 26- se pide una temperatura y se pide si se quiere pasar Celsius o 
     * Fahrenheit, hacer la cuenta y mostrar el resultado.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double celsius;
        Double fahrenheit;
        String decision;
        
        System.out.println("¿Cuánto es la temperatura?");
        datoAux = miSc.next();
        celsius = Double.parseDouble(datoAux);
        
        //la decisión debe ser "si" o "no"
        System.out.println("¿Quiere pasarla a Fahrenheit?");
        decision = miSc.next();
        
        if ("si".equals(decision)) {
            fahrenheit = 1.8 * celsius + 32; 
            System.out.println("La temperatura en Fahrenheit es " + fahrenheit);
        }
        else{
            System.out.println("Gracias por usar la aplicación");
        }
        
    }
    
}
