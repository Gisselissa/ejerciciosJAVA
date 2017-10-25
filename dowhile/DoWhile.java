/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

/**
 *
 * @author alumno
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoWhile.MostrarNumeros();
    }//termina el main
    
    public static void MostrarNumeros()
    {
        int numero=10;
        
        do 
        {            
            System.out.println("Número " + numero); 
            //tomar dato ...numero=
        } while (numero<10);
            
        
        
//        System.out.println("Mensaje");
//        while (numero>10) 
//        {            
//            System.out.println("Mensaje");
//            //tomar dato ...numero=
//        }
    }
    
}//termina la clase Do While.
