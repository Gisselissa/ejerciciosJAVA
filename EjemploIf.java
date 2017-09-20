/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        //defino variables
//        String nombre;
//        String clave;
//        String sexo;
//        String localidad;
//        String colorFavorito;
        
        //tomo datos
//        System.out.println("Ingrese nombre: ");
//        nombre = miSc.next();
//        
//        System.out.println("Ingrese la clave: ");
//        clave = miSc.next();
//        
//        System.out.println("Ingrese su sexo: ");
//        sexo = miSc.next();
//        
//        System.out.println("Ingrese su localidad: ");
//        localidad = miSc.next();
        
//        System.out.println("Ingrese su color favorito: ");
//        colorFavorito = miSc.next();
        
        /**
        * Si es masculino que viva en lanús o avellaneda y qeu su color favorito sea el rojo
        * mostrar el mensaje "sos de Independiente".
        *
        * Si el nombre es Andrea, la localidad es morón y el color favorito es 
        * verde o azul se le pone el mensaje "feliz primavera".
        * 
        *
        **/
        String sexo;
        String localidad;
        String colorFavorito;
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        
        System.out.println("Ingrese su localidad: ");
        localidad = miSc.next();
        
        System.out.println("Ingrese su color favorito: ");
        colorFavorito = miSc.next();
        
        if ("m".equals(sexo) && "rojo".equals(colorFavorito) && "avellaneda".equals(localidad) || "lanus".equals(localidad)) {
                 System.out.println("Sos de Independiente");
        }
        
        if ("f".equals(sexo) && "moron".equals(localidad)&& "verde".equals(colorFavorito) || "azul".equals(colorFavorito)) {
                 System.out.println("Feliz primavera");    
        }
         
        
        //Si es el admin bienvenido sino bienvenido X usuario
//        if ("admin".equals(nombre)) {
//            System.out.println("Bienvenido administrador");
//        }
//        else {
//            System.out.println("Bienvenido usuario: " + nombre);
//        }    
        
        
        //Ingresa m para masculino, f para femenino
        
//        if ("f".equals(sexo)) {
//            System.out.println("Feliz día de la mujer");
//            if ("lanus".equals(localidad)) {
//                System.out.println("Bienvenida mujer de Lanús");
//            }
//        }
        
        //Ejemplo de && o (y). Va a dar la bienvenida solamente que sea una mujer y de lanús
        //si alguna de las dos no se cumplen no da la bienvenida. 
//        if ("lanus".equals(localidad) && "f".equals(sexo)) {
//            System.out.println("Bienvenida");
//        }
        
//        if (colorFavorito.equals("celeste") || colorFavorito.equals("blanco")) {
//            System.out.println("Sos un patriota");
//        }
        
    }     
}
