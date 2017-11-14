/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulauno;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Carrera {
    
    public Auto[] AutosParticipantes;
    private String fecha;
    private String pais;
    
    /**
     * 1) No tiene valor de retorno. 
     * 2) Se llama igual que la clase.
     * 3) El por defecto, puede estar o no. 
     * 4) (Ventaja): Se ejecuta solamente al crear el objeto.  
     * 
     */
    public Carrera()//constructor
    {
        this.fecha=Calendar.getInstance().toString();
        this.pais="Argentina";
        this.AutosParticipantes = new Auto[20];
        this.CrearAutosTest();
    }
    
    private void CrearAutosTest()
    {
        for (int i = 0; i < this.AutosParticipantes.length; i++) 
        {
            this.AutosParticipantes[i] = new Auto(i);
        }
    }
    
    public void CorrerCarrera(int CantidadDeVueltas)
    {
        for (int vueltas = 0; vueltas < CantidadDeVueltas; vueltas++) 
        {
            for (int i = 0; i < this.AutosParticipantes.length; i++) 
            {
                int random = (int) (Math.random()*100);
                this.AutosParticipantes[i].AgregarTiempoRecorrido(random);
            }
        }
    }
    
    public Auto DameElGanador()
    {
        Auto retorno = new Auto(0);
        int menorRecorrido=0;
        
        for (int i = 0; i < this.AutosParticipantes.length; i++) 
        {
            if (i==0) 
            {
                menorRecorrido = this.AutosParticipantes[i].DameElTiempoRecorrido();
                retorno = this.AutosParticipantes[i];
            }
            else
            {
                if (menorRecorrido > this.AutosParticipantes[i].DameElTiempoRecorrido()) 
                {
                    menorRecorrido = this.AutosParticipantes[i].DameElTiempoRecorrido();
                    retorno = this.AutosParticipantes[i];
                }
            }
        }
        
        return retorno;
    }
    
}//nada después de esto. 
