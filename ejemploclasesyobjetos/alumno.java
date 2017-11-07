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
public class alumno {
    //nombre, apellido, correo, sexo, fecha de nacimiento, localidad, dirección, legajo y dni.
    //crear estos atributos y generar 10 objetos alumnos. 
    
//    public String nombre;
//    public String apellido;
//    public String correo;
//    public String sexo;
//    public String fechaDeNacimiento;
//    public String localidad;
//    public String direccion;
//    public int legajo;
//    public int dni;
//    
//    public void mostrarDatos()
//    {
//        System.out.println("Su nombre es " + this.nombre + " apellido " +
//        this.apellido + " correo " + this.correo + " sexo " + this.sexo + 
//        " fecha de nacimiento " + this.fechaDeNacimiento + " localidad " +
//        this.localidad + " dirección " + this.direccion + " legajo " + this.direccion + 
//        " DNI " + this.dni);
//    }
    public String _nombre; // > 3 letras o "nn"
//    private String _apellido; // > 3 letras o "nn"
//    private String _correo; // > 8 letras o "nn"
//    private String _sexo; // f o m o "esta mal"
//    private String _fechaDeNacimiento;
//    private String _localidad;// > 4 letras o "mal localidad"
//    private String _direccion; // > 8 letras o "mal dirección"
//    private int _legajo; //de 6 caracteres o "mal"
//    private int _dni; // = a 8 caracteres o "mal DNI". 
    
    /**
     * para la salida todos los textos en mayúscula. 
     * 
     */
    
    public String GetNombre()
    {
        if (_nombre.length()<3) {
            return this._nombre = "nn";
        }
        else
        {
            return this._nombre.toUpperCase();   
        }
        
    }
    
    public String GetApellido()
    {
        if (_apellido.length()<3) {
            return this._apellido = "nn";
        }
        else
        {
            return this._apellido.toUpperCase();   
        }
        
    }
     
    public String GetCorreo()
    {
        if (_correo.length()<8) {
            return this._correo = "nn";
        }
        else
        {
            return this._correo.toUpperCase();   
        }
        
    }
    
    public String GetSexo()
    {
        if (_sexo.equals("f")) {
            return this._sexo.toUpperCase();
        }
        else
        {
            if (_sexo.equals("m")) {
                return this._sexo.toUpperCase(); 
            }
            else
            {
                return this._sexo = "esta mal";
            }
        }
        
    }
    
    public String GetNacimiento()
    {
            return this._fechaDeNacimiento;      
    }
    
    public String GetLocalidad()
    {
        if (_localidad.length()<4) {
            return this._localidad = "mal localidad";
        }
        else
        {
            return this._localidad.toUpperCase();   
        }
        
    }
    
    public String GetDireccion()
    {
        if (_direccion.length()<8) {
            return this._direccion = "mal dirección";
        }
        else
        {
            return this._direccion.toUpperCase();   
        }
        
    }
    
    //Empieza explicación del profe.
    public void MostrarInstanciaAlumno()
    {
        //1º versión
        System.out.println("Nombre: "+ this._nombre);
        
        //2º versión
        alumno.MostrarDatosAlumno(this);
    }
    
    public static void MostrarDatosAlumno(alumno unAlguien)
    {
        //1º versión
        unAlguien.MostrarInstanciaAlumno();
        
        //2º versión
        System.out.println("Nombre: " + unAlguien.GetNombre());
    }
    
    
    //Termina explicación del profe.
    
    
    
    public void mostrarDatos()
    {
        System.out.println("Su nombre es " + this.nombre + " apellido " +
        this.apellido + " correo " + this.correo + " sexo " + this.sexo + 
        " fecha de nacimiento " + this.fechaDeNacimiento + " localidad " +
        this.localidad + " dirección " + this.direccion + " legajo " + this.direccion + 
        " DNI " + this.dni);
    }
    
}
