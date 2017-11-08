/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeobjetos;

/**
 *
 * @author alumno
 */
public class EjemploDeObjetos {

    /**
     * - Necesito una lapicera con dos colores: rojo y azul.
     * 
     * - Cada uno tiene una cantidad de 100.
     * 
     * - El método escribir ("rojo", 100) recibe el color y la cantidad de tinta
     * a utilizar de no tener cantidad suficiente se muestra un mensaje.
     * 
     * - El método cargar ("rojo", 180) tinta recibe el color y la cantidad
     * para cargar. 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    lapicera UnaLapicera;
    UnaLapicera = new lapicera();
    UnaLapicera.escribir("rojo", 120);
    UnaLapicera.cargar("azul", 50);
    UnaLapicera.escribir("rojo", 90);
    
    }
    
}
