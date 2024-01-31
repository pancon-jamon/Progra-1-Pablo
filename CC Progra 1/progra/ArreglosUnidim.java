/*Hacer 2 arreglos de tipo entero, su tamaño sera ingresado por la consola por el usuario, 
 crear una funcion que llene los arreglo con numeros de forma alearoria donde el usuario indique
 el rango
 La segunda funcion deseo sumar los 2 arreglos por posicion
 La tercera concatenar los numeros de los dos arreglos
 La cuarta es determinar el minimo valor de los dos arreglos
*/
 
import java.util.Scanner;
public class ArreglosUnidim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamArrUno = 0, tamArrDos = 0;
		int tamComparable = 0;
		int tamArrDosCorreguido =0, tamArrUnoCorreguido = 0;
		Scanner ingreso = new Scanner(System.in);
		
        do{
            System.out.println("Ingrese el tamaño del primer arreglo");
		    tamArrUno = Integer.parseInt(ingreso.nextLine());
            
        }while(tamArrUno<0);
		
		do{
		    System.out.println("Ingrese el tamaño del segundo arreglo");
	    	tamArrDos = Integer.parseInt(ingreso.nextLine());
		
		}while(tamArrDos<0);
		int[] arregloUno = new int[tamArrUno];
		int[] arregloDos = new int[tamArrDos];
		
		arregloUno = llenarArregloEnt(tamArrUno);
		arregloDos = llenarArregloEnt(tamArrDos);
		
		System.out.print("Los arreglo originales son: ");
		imprimirArregloEnt(arregloUno);
		System.out.print(" y: ");
		imprimirArregloEnt(arregloDos);
		imprimirTodo(tamArrUno, tamArrDos, arregloUno, arregloDos);
		
		
	}
	/**
	 *Esta funcion es para imprimir todo lo que me pide
	 * @param tamArrUno tamaño del primer arreglo
	 * @param tamArrDos tamaño del segundo arreglo
	 * @param arregloUno arreglo de enteros
	 * @param arregloDos segundo arreglo de enteros
	 */
	 public static void imprimirTodo(int tamArrUno, int tamArrDos, int[] arregloUno, int[] arregloDos){
        int tamComparable = determinarTamIgual(tamArrUno, tamArrDos);
		
		if(tamComparable == 1) {
			int tamArrDosCorreguido1 = tamArrDos + (tamArrUno-tamArrDos);
			int[] arregloDosCorreguido = new int[tamArrDosCorreguido1];
			arregloDosCorreguido = aumentarElemArreEnt(arregloDos, tamArrDosCorreguido1);
			
		    System.out.print("Ahora los arreglo son: ");
    		imprimirArregloEnt(arregloUno);
    		System.out.print(" y: ");
    		imprimirArregloEnt(arregloDosCorreguido);
    		
			System.out.println("La suma de los dos arreglo es ");
		    imprimirArregloEnt(determinarSumaArreglos(arregloUno, arregloDosCorreguido));
		    imprimirConcatencacionArreEnt(arregloUno, arregloDosCorreguido);
		    
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloUno));
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloDosCorreguido));
		}else if(tamComparable == 2) {
			int tamArrUnoCorreguido1 = tamArrUno + (tamArrDos-tamArrUno);
			int[] arregloUnoCorreguido = new int[tamArrUnoCorreguido1];
			arregloUnoCorreguido = aumentarElemArreEnt(arregloUno, tamArrUnoCorreguido1);
			
		    System.out.print("Ahora los arreglo son: ");
    		imprimirArregloEnt(arregloUnoCorreguido);
    		System.out.print(" y: ");
    		imprimirArregloEnt(arregloDos);
			
			System.out.println("La suma de los dos arreglo es ");
		    imprimirArregloEnt(determinarSumaArreglos(arregloUnoCorreguido, arregloDos));
		    imprimirConcatencacionArreEnt(arregloUnoCorreguido, arregloDos);
		    
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloUnoCorreguido));
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloDos));
		}else if(tamComparable == 3){
		    System.out.println("La suma de los dos arreglo es ");
		    imprimirArregloEnt(determinarSumaArreglos(arregloUno, arregloDos));
		    imprimirConcatencacionArreEnt(arregloUno, arregloDos);
		    
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloUno));
		    System.out.println("El menor numero del primer arreglo es: " + determinarNumMen(arregloDos));
		}
	 }
	/**
	 * Esta funcion me sumara los valores de los arreglos 
	 * @param arregloUno
	 * @param arregloDos
	 * @return un arreglo de enteros
	 */
	public static int[] determinarSumaArreglos(int[] arregloUno, int[] arregloDos) {
		// TODO Auto-generated method stub
		int[] arregloSuma = new int[arregloUno.length];
		for(int i = 0; i<arregloDos.length; i++) {
			arregloSuma[i] = arregloUno[i] + arregloDos[i];
		}
		return arregloSuma;
	}
	/**
	 * Esta funcion me imprimira un arreglo de enteros
	 * @param arregloUno
	 */
	public static void imprimirArregloEnt(int[] arreglo) {
		// TODO Auto-generated method stub
		System.out.print("{ ");
		for(int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ,");
		}
		System.out.println("}");
	}
	/**
	 * Esta funcion me llenara un arreglo de numeros enteros ramdoms del 0 al 100
	 * @param tamArr es el tamaño del arreglo
	 * @return un arreglo de enteros
	 */
	public static int[] llenarArregloEnt(int tamArr) {
		// TODO Auto-generated method stub
		int[] arregloNuevo = new int[tamArr];
		for(int i= 0; i<tamArr; i++) {
			arregloNuevo[i] = (int)(Math.random()*100);
		}
		return arregloNuevo;
	}
    /**
     * Esta funcion determinara si los arreglos tiene el mismo tamaño y cual es mayor 
     * @param tamArrUno es el tamaño del primer arreglo
     * @param tamArrDos es el tamaño del segundo arreglo
     * @return entero que depende cual es el arreglo de mayor tamaño
     */
	public static int determinarTamIgual(int tamArrUno, int tamArrDos) {
		// TODO Auto-generated method stub
		if(tamArrUno>tamArrDos)
			return 1;
		else if(tamArrUno<tamArrDos)
			return 2;
		return 3;
	}
	/**
	 * Esta funcion es para aumentar elementos de un arreglo
	 * @param arreglo sera el arreglo de enteros que queremos aumentar
	 * @param nuevoSize es un entero que es el valor del tamaño para el arreglo
	 * @return un arreglo de enteros
	 * */
	 public static int[] aumentarElemArreEnt(int[] arreglo, int nuevoSize){
	     int[] arregloResult = new int[nuevoSize];
	     for(int cont = 0; cont < arreglo.length; cont++){
	         arregloResult[cont] = arreglo[cont];
	     }
	     for(int contDos = arreglo.length; contDos < nuevoSize; contDos++){
	         arregloResult[contDos] =(int)(Math.random()*100);
	     }
	     return arregloResult;
	 }
	 
	 /**
	  * Esta funcion es para imprimir la concatenacion de los elementos de dos arreglo 
	  * @param arregloUno
	  * @param arregloDos
	  * */
	  public static void imprimirConcatencacionArreEnt(int[] arregloUno, int[] arregloDos){
	      System.out.print("La concatencacion es {");
	      for(int i=0; i<arregloUno.length; i++){
	          int numeroUno = arregloUno[i];
	          System.out.print( "" +  numeroUno + "" + arregloDos[i] + " ,");
	      }
	      System.out.println("}");
	  }
	  
	  /**
	   * Esta funcion es para determinar el menor elemento de un arreglo
	   * @param arreglo es un arreglo de enteros
	   * @return numMen es un numero entero 
	   * */
	   public static int determinarNumMen(int [] arreglo){
	       int numMen = arreglo[0];
	       for(int cont = 0; cont<arreglo.length; cont++){
	           if(numMen > arreglo[cont])
	            numMen = arreglo[cont];
	       }
	       return numMen;
	   }
}
