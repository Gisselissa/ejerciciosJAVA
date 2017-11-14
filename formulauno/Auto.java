/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

/**
 *
 * @author alumno
 */
public class Auto {
    
    private int numero;
    private Escuderia escuderia;
    private String modelo;
    private Piloto elPiloto;
    private int TiempoRecorrido;
    
    public void Mostrar()
    {
        System.out.println("Numero "+this.numero);
        System.out.println("escuderia "+this.escuderia.nombre);
        System.out.println("Modelo "+this.modelo);
        System.out.println("Tiempo Recorrido "+this.TiempoRecorrido);
        System.out.println("Piloto "+this.elPiloto.DameNombreCompletoMay());
        
        //Piloto nuevoPiloto = new Piloto();
        //nuevoPiloto.DameNombreCompletoMay();
        
    }
    
    public int DameElTiempoRecorrido()
    {
        return this.TiempoRecorrido;
    }
    
    public void AgregarTiempoRecorrido(int tiempo)
    {
        this.TiempoRecorrido = this.TiempoRecorrido+tiempo;
    }
    
    public Auto(int numero)
    {
        this.elPiloto = new  Piloto();
        this.modelo = "Ford"; 
        this.numero = numero;
        //this.escuderia=new Escuderia(1930, "Italia", "Ferrari");
        
        this.CargarPilotoRandom();
        
        this.CargarEscuderia();
    }
    
    private void CargarPilotoRandom()
    {
        this.NombreRandom();
        this.ApellidoRandom();
    }
    
    private void NombreRandom()
    {
        int miRandom =(int) (Math.random()*10);
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterNombre("Rogelio");
                break;
                
                case 1:
                this.elPiloto.SetterNombre("Seba");
                break;
                
                case 2:
                this.elPiloto.SetterNombre("Miguel");
                break;
                
                case 3:
                this.elPiloto.SetterNombre("Fede");
                break;
                
                case 4:
                this.elPiloto.SetterNombre("Lea");
                break;
                
                case 5:
                this.elPiloto.SetterNombre("Gabi");
                break;
                
                case 6:
                this.elPiloto.SetterNombre("Alan");
                break;
                
                case 7:
                this.elPiloto.SetterNombre("Fernanda");
                break;
                
                case 8:
                this.elPiloto.SetterNombre("María");
                break;
                
                default:
                this.elPiloto.SetterNombre("Pedro");
                break;
        }
    }
    
    private void ApellidoRandom()
    {
        int miRandom =(int) (Math.random()*10);
        
        switch(miRandom)
        {
            case 0:
                this.elPiloto.SetterApellido("Rogelio");
                break;
                
                case 1:
                this.elPiloto.SetterApellido("Seba");
                break;
                
                case 2:
                this.elPiloto.SetterApellido("Miguel");
                break;
                
                case 3:
                this.elPiloto.SetterApellido("Fede");
                break;
                
                case 4:
                this.elPiloto.SetterApellido("Lea");
                break;
                
                case 5:
                this.elPiloto.SetterApellido("Gabi");
                break;
                
                case 6:
                this.elPiloto.SetterApellido("Alan");
                break;
                
                case 7:
                this.elPiloto.SetterApellido("Fernanda");
                break;
                
                case 8:
                this.elPiloto.SetterApellido("María");
                break;
                
                default:
                this.elPiloto.SetterApellido("Pedro");
                break;
        }
    }
    
}
