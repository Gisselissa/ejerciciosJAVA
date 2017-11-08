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
public class lapicera {
    
    private int azul=100;
    private int rojo=100;
    
    public void escribir (String color, int cantidad)
    {
        if (color.equalsIgnoreCase("rojo")) {
            if (cantidad < this.rojo) {
                this.rojo = this.rojo - cantidad;
            }
            else
            {
                System.out.println("No hay rojo");
            }
        }
        
        if (color.equalsIgnoreCase("azul")) {
            if (cantidad < this.azul) {
                this.rojo = this.azul - cantidad;
            }
            else
            {
                System.out.println("No hay azul");
            }
        }
    }
    
    public void cargar (String color, int cantidad)
    {
        if (color.equalsIgnoreCase("rojo")) 
        {
            this.rojo = this.rojo + cantidad;
        }
        
        if (color.equalsIgnoreCase("azul")) 
        {
            this.azul = this.azul + cantidad;
        }
    }
    
}//termina la clase lapicera
