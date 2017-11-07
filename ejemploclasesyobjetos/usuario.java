/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesyobjetos;

/**
 *
 * @author alumno
 */
public class usuario {
    
    //atributos
    private String nombre;
    private String clave;
    
    //metodos getters (si devuelve)
    public String GetNombre()
    {
        return this.nombre.toUpperCase();
    }
    
     public String GetClave()
    {
        return this.clave;
    }
    
    
    //métodos Setters (no devuelven - asignan)
    //public void SetNombre(String dato)
    public void DameNombre(String dato)
    {
           this.nombre = dato; 
    }
    
    //public void SetClave(String dato)
    public void DameClave(String dato)
    {   
        if (dato.length()<4) {
            this.clave = "mal";
        }
        else
        {
        this.clave = dato;
        }
    }
    
    public void mostrarDatos()
    {
        System.out.println("Su nombre es " + this.GetNombre() + " y la clave es " + this.clave);
    }
    
}
