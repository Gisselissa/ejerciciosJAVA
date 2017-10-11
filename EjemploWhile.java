/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.SalidaPorLogica();
        //EjemploWhile.PedirNumeros();
        //EjemploWhile.MostrarMenu();
        //EjemploWhile.TomarDatosValidos();
        //EjemploWhile.ContadoresYAcumuladores();
        //EjemploWhile.NumeroPrimo();
        EjemploWhile.PrimosDelUnoAlCien();
        
    }//finaliza el main
    
    public static void PrimosDelUnoAlCien()
    {
        Integer numeroIngresado=1;
        
        while(numeroIngresado<101)
        {
            
            Integer contador=2;
            Integer contadorDivisores=0;

            while (contador<numeroIngresado) 
            {            
                if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                contador++;
            }
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;
        }
    }
    
    public static void NumeroPrimo()
    {
        Integer numeroIngresado=357;
        Integer contador=2;
        Integer contadorDivisores=0;
        
        while (contador<numeroIngresado) 
        {            
            if (numeroIngresado%contador==0)
            {
                contadorDivisores++;
                break;
            }
            contador++;
        }
        if (contadorDivisores>0)
        {
            System.out.println("No es primo");
        }
        else
        {
            System.out.println("Es primo");
        }
    }
    
    public static void ContadoresYAcumuladores()
    {
        Integer contador=0;
        Integer acumulador=0;
        Integer multiplicador=1;
        Integer restador=0;
        Integer contadorPares=0;
        Integer contadorDiv3=0;
        
        while (contador<10) 
        {   
            contador++;
            System.out.println("Número " + contador);
            acumulador = acumulador + contador;
            multiplicador = multiplicador * contador;
            restador = restador - contador;
            
            if (contador%2==0) 
            {
                contadorPares++;
            }
            if (contador%3==0)
            {
                contadorDiv3++;
            }
        }
        
        System.out.println("La suma es " + acumulador);
        System.out.println("La multiplicación es " + multiplicador);
        System.out.println("La resta es " + restador);
        System.out.println("Los pares son " + contadorPares);
        System.out.println("Los multiplos de 3 son " + contadorDiv3);
        
    }
    
    
    /**
    * Pide los datos de una persona y valida cada uno. 
    * Datos a pedir: 
    * nombre
    * edad(entre 1 y 100)
    * sexo(f o m)
    * Estado civil(S: soltero, C: casado, D: divorciado, V: viudo)
    * nacionalidad (n: nativo, l: latinoamericano, e: europeo, r: resto del mundo)
    * sueldo (entre 8.000 y 58.000)
    * dono organos (Si o No). 
    * clave de no menos de 6 caracteres.
    */
    public static void TomarDatosValidos()
    {
        Scanner miSc = new Scanner(System.in);
        
        String aux;
        String nombre;
        Integer edad;
        String sexo;
        String estadoCivil;
        String nacionalidad;
        Integer sueldo;
        String donador;
        String clave;
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        
        System.out.println("Ingrese su edad: ");
        aux = miSc.next();
        edad = Integer.parseInt(aux);
        while (edad<1 || edad>100) 
        {            
            System.out.println("Ingrese su edad nuevamente: ");
            aux = miSc.next();
            edad = Integer.parseInt(aux);
        }
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        while (!sexo.equals("f") && !sexo.equals("m")) 
        {            
            System.out.println("Ingrese su sexo nuevamente: ");
            sexo = miSc.next();
        }
        
        System.out.println("Ingrese su estado civil: ");
        estadoCivil = miSc.next();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("d") && !estadoCivil.equals("v")) 
        {            
            System.out.println("Ingrese su estado civil nuevamente: ");
            estadoCivil = miSc.next();
        }
        
        System.out.println("Ingrese su nacionalidad: ");
        nacionalidad = miSc.next();
        while (!nacionalidad.equals("n") && !nacionalidad.equals("l") && !nacionalidad.equals("e") && !nacionalidad.equals("r")) 
        {            
            System.out.println("Ingrese su nacionalidad nuevamente: ");
            nacionalidad = miSc.next();
        }
        
        System.out.println("Ingrese su sueldo: ");
        aux = miSc.next();
        sueldo = Integer.parseInt(aux);
        while (sueldo<8000 || sueldo>58000) 
        {            
            System.out.println("Ingrese su sueldo nuevamente: ");
            aux = miSc.next();
            sueldo = Integer.parseInt(aux);
        }
        
        System.out.println("Ingrese si es donador: ");
        donador = miSc.next();
        while (!donador.equals("s") && !donador.equals("n")) 
        {            
            System.out.println("Ingrese si es donador nuevamente: ");
            donador = miSc.next();
        }
        
        System.out.println("Ingrese una clave con no menos de 6 caracteres");
        clave = miSc.next();
        while (clave.length()<6) 
        {            
            System.out.println("Ingrese una clave nuevamente: ");
            clave = miSc.next();
        }
        
        
    }
    
    
    /**
     * Pide dos números e informa el promedio.
     * 
     */
    
    public static void PromedioConIf()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numeroUno;
        Integer numeroDos;
        Integer promedio;
        String datoAux;
        
        System.out.println("Ingrese el número uno");
        datoAux = miSc.next();
        numeroUno = Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el número dos");
        datoAux = miSc.next();
        numeroDos = Integer.parseInt(datoAux);
        
        promedio = (numeroUno + numeroDos) / 2;
        System.out.println("El promedio es: " + promedio);
        
    }//finaliza promedio con if
    
    /**
     * Pide dos números e informa el promedio.
     * 
     */
    
    public static void PromedioConWhile()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numero;
        Integer promedio;
        Integer contador=0;
        Integer suma=0;
        String datoAux;
        
        while (contador<3) 
        {
            contador++;
            System.out.println("Ingrese el número " + contador);
            datoAux = miSc.next();
            numero = Integer.parseInt(datoAux);
            
            suma = suma + numero;
            
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
        
    }
    
    /**
     * Cuando no sabemos la cantidad de iteraciones. 
     */
    
    public static void IteracionSinCantidad()
    {
        String continuar="si";
        while(!continuar.equals("no"))
            {
                System.out.println("Hola, desea continuar ");
                Scanner miSc = new Scanner(System.in);
                continuar = miSc.next();
            }
        
    }
    
    public static void SalidaPorLogica()
    {
        String continuar="si";
            while(true)
            {
                System.out.println("Hola, desea continuar ");
                Scanner miSc = new Scanner(System.in);
                continuar = miSc.next();
                if (continuar.equals("no")) 
                {
                    break;
                }
            }
    }
    
    public static void PedirNumeros()
    {
        Integer numero;
        Integer contador=0;
        Integer suma=0;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        while (contador<10 && suma<50) 
        {   
            contador++;
            System.out.println("Ingrese el número " + contador + ":");
            datoAux=miSc.next();
            numero=Integer.parseInt(datoAux);
            suma = suma + numero;
            /**if (suma>50)
            {
                break;
            }
            **/ 
        }
        System.out.println("La suma es " + suma);
        System.out.println("La cantidad es " + contador);
        
    }
    
    public static void MostrarMenu()
    {
        String opcion="nada";
        
        Scanner miSc = new Scanner(System.in);
        
        while (!opcion.equals("6")) 
        {   
            
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("6-salir");

            System.out.println("Ingrese opción deseada ");
            opcion=miSc.next();
            switch(opcion)
            {
                case "1":
                    EjemploWhile.Sumar();
                    break;
                
                case "2":
                    EjemploWhile.Restar();
                    break;
                    
                case "3":
                    EjemploWhile.Multiplicar();
                    break;
                    
                case "4":
                    EjemploWhile.Dividir();
                    break;
                    
                case "6":
                    System.out.println("Adios!!!");
                    break;
                    
                default:
                    System.out.println("Ingreso una opción equivocada");
            }
            
        }
        //del while
        System.out.println("Cerró el menu");
        
        
       
    }
    
    public static void Sumar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static void Restar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno - numeroDos;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    
    public static void Multiplicar()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno * numeroDos;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    
    public static void Dividir()
    {
        Integer numeroUno;
        Integer numeroDos;
        Integer resultado;
        String datoAux;
        
        Scanner miSc = new Scanner(System.in);
        
        //primer numero
        System.out.println("Ingrese el primer número: ");
        datoAux=miSc.next();
        numeroUno= Integer.parseInt(datoAux);
        
        //segundo numero
        System.out.println("Ingrese el segundo número: ");
        datoAux=miSc.next();
        numeroDos= Integer.parseInt(datoAux);
        
        resultado = numeroUno / numeroDos;
        System.out.println("El resultado de la división es: " + resultado);
    }
    
}
