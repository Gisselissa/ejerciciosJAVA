/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GuiaIf {
    /**
    *13- Se ingresa un color y una localidad, si es avellaneda o Lanús y el
    *  color es rojo, mostrar el mensaje “sos de independiente”.
    * 
    *15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría y
    * es de sexo masculino, viviendo en morón, se muestra el mensaje “sos de morón”.
    * 
    * 17-Se pide una edad y se informa si es niño adolescente o mayor de edad.
    * 
    *  19- se ingresa un importe, si supera los 100 pesos se  le suma un 
     * impuesto del 23%, si no se les descuenta el 50%
    * 
    * */
    public static void HacerEjercicio13(){
        
    Scanner miSc = new Scanner(System.in);
    
    String localidad;
    String colorFavorito;
    
    System.out.println("Ingrese su localidad: ");
    localidad = miSc.next();
        
    System.out.println("Ingrese su color favorito: ");
    colorFavorito = miSc.next();
    
    if ("rojo".equals(colorFavorito) && "avellaneda".equals(localidad) || "lanus".equals(localidad)) {
                 System.out.println("Sos de Independiente");
        }
        
    }
    
    public static void HacerEjercicio15(){
    Scanner miSc = new Scanner(System.in);
        
        String nombre;
        String sexo;
        String localidad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        
        System.out.println("Ingrese su localidad: ");
        localidad = miSc.next();
        
        if ("Jose".equals(nombre) || "Maria".equals(nombre) && "m".equals(sexo) && "moron".equals(localidad)) {
            System.out.println("Sos de Morón");
        }
    
    
    }
    
    public static void HacerEjercicio17(){
         Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer edad;
        
        System.out.println("Ingrese su edad: ");
        datoAux = miSc.next();
        edad = Integer.parseInt(datoAux);
        
        if (edad>17) 
        {
            System.out.println("es mayor");
        }
        else
        {
            //son menores a 18
            if (edad<13) 
            {
                System.out.println("es niño"); 
            }else{
                System.out.println("es adolescente");
            }
        }
    }
    
    public static void HacerEjercicio19(){
        String datoAux;
        Double importe;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe: ");
        datoAux = miScanner.next();
        importe = Double.parseDouble(datoAux);
        
        if (importe>100)
        {
            total = 1.23*importe;
            System.out.println("El precio final es: " + total);
        }
        else
        {
            total = 0.50*importe;
            System.out.println("El precio final es: " + total);
        }
    }
    
}//nunca nada abajo de esto
    


        


