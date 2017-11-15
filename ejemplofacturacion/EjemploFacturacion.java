/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofacturacion;

/**
 *
 * @author alumno
 */
public class EjemploFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // registrar una venta. 
        
        
        Venta NuevaVenta; 
        NuevaVenta = new Venta();
        
        
        /**
        Producto unProducto = new Producto();
        unProducto.SetterCantidad(3);
        unProducto.SetterDescripcion("Sprite");
        unProducto.SetterPrecio(35);
        
        Producto unProducto2 = new Producto();
        unProducto2.SetterCantidad(3);
        unProducto2.SetterDescripcion("Fanta");
        unProducto2.SetterPrecio(40);
        
        Producto unProducto3 = new Producto();
        unProducto3.SetterCantidad(3);
        unProducto3.SetterDescripcion("Coca-Cola");
        unProducto3.SetterPrecio(45);
        
        Producto unProducto4 = new Producto();
        unProducto4.SetterCantidad(3);
        unProducto4.SetterDescripcion("7Up");
        unProducto4.SetterPrecio(50);
        **/
        
        
        NuevaVenta.elCliente=Persona.RetornarPersonaRandom();
        NuevaVenta.miEmpleado=Persona.RetornarPersonaRandom();
        //NuevaVenta.productoVendido=unProducto;
        
        
        NuevaVenta.CargarProducto(Producto.RetornarProductoRandom());
        NuevaVenta.CargarProducto(Producto.RetornarProductoRandom());
//        NuevaVenta.CargarProducto(unProducto);
//        NuevaVenta.CargarProducto(unProducto3);
//        NuevaVenta.CargarProducto(unProducto3);
        
        NuevaVenta.MostrarVenta();
    }
    
}
