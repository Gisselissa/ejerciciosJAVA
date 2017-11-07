/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasodearray;

/**
 *
 * @author alumno
 */
public class RepasoDeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RepasoDeArray.CrearArray();
        
//        int[] listadoNumerosMain;
//        listadoNumerosMain = RepasoDeArray.RetornarArray();
        
//        int retornarrandom = RepasoDeArray.RetornarRandom();
//        retornarrandom = RepasoDeArray.RetornarRandom();
//        retornarrandom = RepasoDeArray.RetornarRandom();
//        retornarrandom = RepasoDeArray.RetornarRandom();
        
//        int[] listadoNumerosMain;
//        listadoNumerosMain = RepasoDeArray.RetornarArrayDeRandom();
        
        //int[] listadoNumerosMain;
        //listadoNumerosMain = RepasoDeArray.RetornarArrayDeRandom();
        
//        int[] listadoNumerosMain;
//        listadoNumerosMain = RepasoDeArray.RetornarArray();
//        RepasoDeArray.MostrarArray(listadoNumerosMain);

//        int[] listadoNumerosMain;
//        listadoNumerosMain = RepasoDeArray.RetornarArrayDeRandomConCantidad(33);
//        RepasoDeArray.MostrarArray(listadoNumerosMain);

        int[] listadoNumerosMain;
        listadoNumerosMain = RepasoDeArray.RetornarArrayDeRandomConCantidad(3);
        RepasoDeArray.MostrarArray(listadoNumerosMain);
        int cantidadA = RepasoDeArray.RetornarCantidadDeAprobados(listadoNumerosMain);
        int cantidadB = RepasoDeArray.RetornarCantidadDeDesaprobados(listadoNumerosMain);
        float cantidadC = RepasoDeArray.RetornarPromedio(listadoNumerosMain);
        
        int[] notasUBA=RepasoDeArray.RetornarArrayDeRandomConCantidad(3);
        int[] notasUTN=RepasoDeArray.RetornarArrayDeRandomConCantidad(3);
        String devolucion;
        devolucion=RepasoDeArray.RetornarQuienTieneMejorPromedio(notasUBA, notasUTN);
        
//        int[] mejorNota;
//        mejorNota = RepasoDeArray.retornarMejoresNotasArray(notasUBA, notasUTN);
        

        String[] devolucionNombre;
        devolucionNombre = RepasoDeArray.RetornarNombresRandom();
        
        
    }
    
    public static String[] RetornarNombresRandom()
    {
        String[] datos = new String[10];
        String[] nombres={"rogelio", "alfredo", "sebastian", "miguel", "mariano", "juan", "maria", "florencia", "silvina", "gabriela"};
        String[] apellidos={"perez", "garcia", "urbina", "sosa", "gutierrez", "lennon", "cerati", "spinetta", "carambula", "epumer"};
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = nombres[i]+ " " +apellidos[i];
        }
        
        return datos;
    }
    
    public static int RetornarMejorNota(int[] arrayparametro)
    {
         int notaRetorno = 0;
        
        
        for (int i = 0; i < arrayparametro.length; i++) {
            if (i==0) {
                notaRetorno = arrayparametro[i];
            }
            else
            {
                if (notaRetorno<arrayparametro[i]) {
                    notaRetorno = arrayparametro[i];
                }
            }
        }
        
        return notaRetorno;
    }
    
    public static int RetornarPeorNota(int[] arrayparametro)
    {
        int notaRetorno = 0;
        
        for (int i = 0; i < arrayparametro; i++) {
            if (i==0) {
                notaRetorno = arrayparametro[i];
            }
            else
            {
                if (notaRetorno>arrayparametro[i]) {
                    notaRetorno = arrayparametro[i];
                }
            }
        }
        return notaRetorno;
    }
    
    public static int[] retornarMejoresNotasArray(int[] uno, int[] dos)
    {
        int[] retorno = new int[uno.length];
        
        
        for (int i = 0; i < uno.length; i++) {
            if (uno[i]>dos[i]) {
                retorno[i]=uno[i];
            }
            else
            {
               retorno[i]=uno[i]; 
            }
        }
        
        return retorno;
    }
    
    /**
     * Los parametros son dos arrays de enteros 
     * 
     * @return
     * retorna "El primero tiene mejor promedio" o "El segundo tiene el mejor
     * promedio", según quién tenga el mejor promedio de los dos arrays de notas.
     */
    public static String RetornarQuienTieneMejorPromedio(int[] primerArray, int[] segundoArray)
    {
        String retorno="El primero tiene mejor promedio";
        
         float PrimerPromedio;
         float SegundoPromedio;
         
         PrimerPromedio = RepasoDeArray.RetornarPromedio(primerArray);
         SegundoPromedio = RepasoDeArray.RetornarPromedio(segundoArray);
         
         if (PrimerPromedio>SegundoPromedio) {
             
        }
         else
         {
             retorno="El segundo tiene mejor promedio";
         }
        
        return retorno;
    }
    
    public static float RetornarPromedio(int[] notas)
    {
        float promedio=0;
        int suma=0;
        
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        
        promedio = (float)suma/ (float)notas.length;
        
        return promedio;
    }
    
    public static int RetornarCantidadDeDesaprobados(int[] listadoDeNotas)
    {
        int retorno=0;
        
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if (listadoDeNotas[i]<4) {
                retorno++;
            }
        }
        
        
        return retorno;
    }
    
    public static int RetornarCantidadDeAprobados(int[] listadoDeNotas)
    {
        int retorno=0;
        
        for (int i = 0; i < listadoDeNotas.length; i++) {
            if (listadoDeNotas[i]>3) {
                retorno++;
            }
        }
        
        
        return retorno;
    }
    
    public static int[] RetornarArrayDeRandomConCantidad(int cantidad)
    {
        int[] arrayRetorno = new int[cantidad];
        
        for (int i = 0; i < arrayRetorno.length; i++) {
            arrayRetorno[i]=RepasoDeArray.RetornarRandom();
        }
        
        
        return arrayRetorno;
    }
    
    public static void MostrarArray(int[] parametroArray)
    {
        for (int i = 0; i < parametroArray.length; i++) {
            System.out.println("Número: " + parametroArray[i]);
        }
    }
    
    public static int[] RetornarArrayDeRandom()
    {
        int[] retorno = new int[10];
        
        for (int i = 0; i < retorno.length; i++) {
            retorno[i]=RepasoDeArray.RetornarRandom();
        }
        
        return retorno;
    }
    
    public static int RetornarRandom()
    {
        int numeroRandom=0;
        double randomAux=Math.random();
        
        randomAux = randomAux*10;
        
        numeroRandom = (int)randomAux;
        
        return numeroRandom;
    }
    
    public static int[] RetornarArray()
    {
        
        int[] arraynuevo={2,3,5};
        return arraynuevo;
        
    }
    
    public static void CrearArray()
    {
        int[] arrayDeNumeros;
        arrayDeNumeros = new int[3];
        
        arrayDeNumeros[0]=55;
        arrayDeNumeros[2]=33;
        arrayDeNumeros[1]=-22;
        // da error ArrayIndexOutOfBoundsException - arrayDeNumeros[3]=99;
        
        int[] arrayDeNumerosBis= new int[3];
        
        int[] arraynuevo={2,3,5};
        
        
    }
    
}//nada después de esto. 
