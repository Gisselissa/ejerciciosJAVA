/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploClasesyObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //esto es estático.
//        int edad = 33;
//        calculadora.mostrarEstatico(edad);
//        
//        
//        //es es de instancia.
//        calculadora miCal = new calculadora();
//        miCal.mostrarInstancia();

//    //ejemplo de profe
//    int numero;
//    String dato;
//    
//    alumno nuevoAlumno;
//    nuevoAlumno = new alumno();
//   

//    usuario UnUsuario;
//    UnUsuario = new usuario();
//    
//    UnUsuario.DameNombre("natalia natalia");
//    UnUsuario.DameClave("123");
//    System.out.println("El nombre es " + UnUsuario.GetNombre());
//    UnUsuario.mostrarDatos();
    
     
    
    alumno nuevoAlumno;
    nuevoAlumno = new alumno();
    
    nuevoAlumno._nombre = "Sebastián";
//    nuevoAlumno._apellido = "Urbina";
//    nuevoAlumno._correo = "sebaurbina@gmail.com";
//    nuevoAlumno._sexo = "masculino";
//    nuevoAlumno._fechaDeNacimiento = "14 de noviembre de 1982";
//    nuevoAlumno._localidad = "Avellaneda";
//    nuevoAlumno._direccion = "Alsina 122";
//    nuevoAlumno._legajo = 1234;
//    nuevoAlumno._dni = 29987309;
    
    nuevoAlumno.GetNombre();
    System.out.println("El nombre es " + nuevoAlumno.GetNombre());
    
    nuevoAlumno.GetApellido();
    System.out.println("El apellido es " + nuevoAlumno.GetApellido());
    
    nuevoAlumno.GetCorreo();
    System.out.println("El correo es " + nuevoAlumno.GetCorreo());
    
    nuevoAlumno.GetSexo();
    System.out.println("El sexo es " + nuevoAlumno.GetSexo());
    
    nuevoAlumno.GetNacimiento();
    System.out.println("La fecha de nacimiento es " + nuevoAlumno.GetNacimiento());
    
    nuevoAlumno.GetLocalidad();
    System.out.println("La localidad es " + nuevoAlumno.GetLocalidad());
    
    nuevoAlumno.MostrarInstanciaAlumno();
    
    
    
    
    //nuevoAlumno.mostrarDatos();
        
    }
    
}
