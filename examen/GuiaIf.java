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
    * 13- Se ingresa un color y una localidad, si es avellaneda o Lanús y el
    *  color es rojo, mostrar el mensaje “sos de independiente”.
    * 
    * 14- Se pide el sexo y el nombre, si es “f” de femenino, se muestra el mensaje”
    * feliz dia XXXXX”, donde XXXX es el nombre.
    * 
    * 15-Se pide el nombre, el sexo y la localidad. Si se llama José o maría y
    * es de sexo masculino, viviendo en morón, se muestra el mensaje “sos de morón”.
    * 
    * 16-Se debe ingresar un edad  e  informar si es mayor de edad o no.
    * 
    * 17-Se pide una edad y se informa si es niño adolescente o mayor de edad.
    * 
    * 18- Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”  
    * de lo contrario mostrar el mensaje “clave incorrecta.
    * 
    * 19- se ingresa un importe, si supera los 100 pesos se  le suma un 
    * impuesto del 23%, si no se les descuenta el 50%.
    * 
    * 20- Se ingresa un importe del pasaje de avión y el mes de viaje, si el
    * mes es enero, se les descuenta un 10% por temporada baja.
    * 
    * 22- se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4
    * mostrar aprobó , de lo contrario mostrar “ la próxima será”.
    * 
    * Ferretería Ferrete
    * Debemos hacer una serie de aplicaciones para este negocio
    * 23- Debemos pedir el ancho y el largo de un terreno e informar cuantos
    * metros de alambre necesitamos para dar tres (3) vueltas de alambre.
    * 
    * 24- Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos
    * de alambre e informar cuantos metros de alambre necesitamos para completar
    * las vueltas de alambre.
    * 
    * 25-Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared
    * de 1 metro cuadrado, se pide el alto y ancho y se informa la cantidad
    * de cada material que necesito.
    * 
    * 26- de pide una temperatura y se pide si se quiere pasar Celsius
    * o Fahrenheit, hacer la cuenta y mostrar el resultado.
    * 
    * 27- para una pileta se necesita saber la superficie, se debe pedir que
    * tipo de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio
    * y si es cuadrada pedir el largo y el ancho, mostrar la superficie de la
    * pileta.
    * 
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
    
    public static void HacerEjercicio14()
    {
         Scanner miSc = new Scanner(System.in);
        
        String sexo;
        String nombre;
        
        System.out.println("Ingrese su sexo: ");
        sexo = miSc.next();
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        
        if ("f".equals(sexo)) {
            System.out.println("Feliz día " + nombre);
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
    
    public static void HacerEjercicio16()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer edad;
        
        System.out.println("Ingrese su edad: ");
        datoAux = miSc.next();
        edad = Integer.parseInt(datoAux);
        
        if (edad>17) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("No es mayor de edad");
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
    
    public static void HacerEjercicio18()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer clave;
        
        System.out.println("Ingrese su clave");
        datoAux = miSc.next();
        clave = Integer.parseInt(datoAux);
        
        //Si la clave es correcta bienvenido
          if (123 == clave) {
            System.out.println("Bienvenido");
          }
          else {
              System.out.println("Clave incorrecta");
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
    
    public static void HacerEjercicio20()
    {
        String datoAux;
        String mes;
        Double importe;
        Double total;
        
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el importe: ");
        datoAux = miScanner.next();
        importe = Double.parseDouble(datoAux);
        
        System.out.println("Ingrese el mes del viaje: ");
        mes = miScanner.next();
        
        
        if (mes.equals("enero"))
        {
            total = 0.90*importe;
            System.out.println("El precio final es: " + total);
        }
        else
        {
            total=importe;
            System.out.println("El precio final es: " + total);
        }
    }
    
    public static void HacerEjercicio22()
    {
        
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer nota;
  
        System.out.println("Ingrese su nota: ");
        datoAux = miSc.next();
        nota = Integer.parseInt(datoAux);
        
        if (nota==10) {
            System.out.println("Sos un genio");
        }
        else{
            if (nota<10 && nota>=4) {
                System.out.println("Aprobó");
            }
            else {
                System.out.println("La próxima será...");
            }
        }
    }
    
    public static void HacerEjercicio23()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double ancho;
        Double largo;
        Double totalUno;
        Double totalFinal;
        
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el largo?");
        datoAux = miSc.next();
        largo = Double.parseDouble(datoAux);
        
        totalUno = ancho * largo;
        totalFinal = totalUno * 3;
        
        System.out.println("Se necesitan " + totalFinal + " metros de alambre");

    }
    
    public static void HacerEjercicio24()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double ancho;
        Double largo;
        Integer hilos;
        Double total;
               
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el largo?");
        datoAux = miSc.next();
        largo = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto hilos de alambre necesita?");
        datoAux = miSc.next();
        hilos = Integer.parseInt(datoAux);
        
        total = ancho * largo * hilos;
                
        System.out.println("Se necesitan " + total + " metros de alambre");
        
    }
    
    public static void HacerEjercicio25()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Integer cal;
        Integer cemento;
        Double alto;
        Double ancho;
        Double superficie;
        Double totalCal;
        Double totalCemento;
        
        cal = 2;
        cemento = 3;
        
        System.out.println("¿Cuánto es el ancho?");
        datoAux = miSc.next();
        ancho = Double.parseDouble(datoAux);
        
        System.out.println("¿Cuánto es el alto?");
        datoAux = miSc.next();
        alto = Double.parseDouble(datoAux);
        
        superficie = ancho * alto;
        totalCal = superficie * 2;
        totalCemento = superficie * 3;
        
        System.out.println("Necesita " + totalCal + " bolsas de cal");
        System.out.println("Necesita " + totalCemento + " bolsas de cemento");
    }
    
    public static void HacerEjercicio26()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        Double celsius;
        Double fahrenheit;
        String decision;
        
        System.out.println("¿Cuánto es la temperatura?");
        datoAux = miSc.next();
        celsius = Double.parseDouble(datoAux);
        
        //la decisión debe ser "si" o "no"
        System.out.println("¿Quiere pasarla a Fahrenheit?");
        decision = miSc.next();
        
        if ("si".equals(decision)) {
            fahrenheit = 1.8 * celsius + 32; 
            System.out.println("La temperatura en Fahrenheit es " + fahrenheit);
        }
        else{
            System.out.println("Gracias por usar la aplicación");
        }

    }
    
    public static void HacerEjercicio27()
    {
        Scanner miSc = new Scanner(System.in);
        
        String datoAux;
        String superficie;
        Double largo;
        Double ancho;
        Double totalSup;
        Double radio;
        
        //la decisión debe ser "cuadrada" o "redonda"
        System.out.println("¿Diga si su pileta es cuadrada o redonda?");
        superficie = miSc.next();
                
        if ("cuadrada".equals(superficie)) {
            System.out.println("¿Cuánto es el largo");
            datoAux = miSc.next();
            largo = Double.parseDouble(datoAux);
            
            System.out.println("¿Cuánto es el ancho");
            datoAux = miSc.next();
            ancho = Double.parseDouble(datoAux);
            
            totalSup = largo * ancho;
            
            System.out.println("La superficie de la pileta es " + totalSup);
        }
        
        if ("redonda".equals(superficie)) {
            System.out.println("¿Cuánto es el radio");
            datoAux = miSc.next();
            radio = Double.parseDouble(datoAux);
            
            totalSup = radio * radio * 3.1416;
            
            System.out.println("La superficie de la pileta es " + totalSup);
            
        }
        

    }
    
}//nunca nada abajo de esto
