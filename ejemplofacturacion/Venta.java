/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Venta {
    
    public Persona elCliente;
    public Persona miEmpleado;
    //public Producto productoVendido;
    public Producto[] ListadoProductos;
    
    public Venta()
    {
        this.ListadoProductos = new Producto[3];
    }
    
    private int RetornarPrimerLugarLibre()
    {
        int retorno=-1;
        
        for (int i = 0; i < this.ListadoProductos.length; i++) {
            if (Objects.isNull( this.ListadoProductos[i])==true) {
                retorno=i;
                return retorno;
            }
        }
        
        return retorno;
    }
    
    public void CargarProducto(Producto unProducto)
            
    {
        
        int indice;
        indice = this.RetornarPrimerLugarLibre();
        if (indice>-1) 
        {
          this.ListadoProductos[indice]=unProducto;  
        }else
        {
            System.out.println("No hay lugar");
        }
        /**
        if (Objects.isNull( this.ListadoProductos[0])==true) {
           this.ListadoProductos[0]=unProducto; 
        }else
        {
            if (Objects.isNull( this.ListadoProductos[1])==true) {
                this.ListadoProductos[1]=unProducto;
            }else
            {
                if (Objects.isNull( this.ListadoProductos[2])==true) {
                    this.ListadoProductos[2]=unProducto;
                }else
                {
                    System.out.println("No hay más lugar");
                }
            }
        }
       **/
        
    }
    
    public void MostrarVenta()
    {
        System.out.println("El empleado es: ");
        miEmpleado.MostrarPersona();
        
        System.out.println("El cliente es: ");
        elCliente.MostrarPersona();
        
        //System.out.println("El producto es: ");
        //productoVendido.mostrarProducto();
        
        for (int i = 0; i < this.ListadoProductos.length; i++) {
            
            if (Objects.isNull(this.ListadoProductos[i])==false) {
                this.ListadoProductos[i].mostrarProducto();
            }
            
        }
        
        float aux=0;
        //aux = productoVendido.DamePrecioFinal();
        
        //aux = this.ListadoProductos[0].DamePrecioFinal()+ aux = this.ListadoProductos[1].DamePrecioFinal()+ aux = this.ListadoProductos[2].DamePrecioFinal();
        
        for (int i = 0; i < this.ListadoProductos.length; i++) {
            if (Objects.isNull(this.ListadoProductos[i])==false) {
              aux = aux + this.ListadoProductos[i].DamePrecioFinal();  
            }
           
        }
        
        System.out.println("El importe a pagar es: " + aux);
       
    }
    
}
