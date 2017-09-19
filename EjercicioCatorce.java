/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * Se pide ingresar una clave, si es "UTN750" se mostrará el mensaje "Bienvenido", de lo contrario el mensaje será "Clave errónea".
     * 15 - Se ingresa un importe si supera los 100 pesos se le suma un 23%, si es menor a 100 pesos se le descuenta el 50%.
     * 16 - Se ingresa el importe de un pasaje de avión y el mes de viaje, si es enero se le descuenta un 10% por temporada baja.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        String clave;
        Boolean variableUno;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese su clave: ");
        //clave = miScanner.next();
        variableUno = miScanner.nextBoolean();
        variableUno = "UTN750";
        
        //if (clave == "UTN750"){
            if ("UTN750".equals(clave)) {
            System.out.println("Bienvenido");    
        }
        else{
            System.out.println("Su clave es errónea");
        }  
    }
    
}
