/**
 * Esta es una clase  de recursividad
 * @author Claudia Coello
 * @version 1.0
 * */
/*
 * La recursividad es algo que se repite, simpre debe tener un limite, este es aplicado en funciones, si es void se ejecuta todo y si no lo es hasta un return(me permite obtener un resultado
 * sobre una operacion, en la programacion estructurada todo lo que esye en el main se ejecuta.
 * Las fucniones son comparables a ventanas independientes que se cierran cuando llega a un return, en la recursividad se llama a su misma funcion, debe tener una condicion que se altere 
 * 
 */
public class Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 42;
		//System.out.println(factorial(num));
		
		//imprimirNombreRecursividad(num);
		int [] arreglo = {1, 2, 3};
		//conseguirNumArreglo(arreglo, 0);
		invertirNumsArreglo(arreglo, 0, arreglo.length-1);
		//System.out.println(calcularSumaNumPosiPar(num));
		for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " "); // Imprimir cada elemento del arreglo
        }
	}

	/**
	 * Esta funcion me permite calcular un factorial
	 * @author CLaudia Coello
	 * @param num es un entero
	 * @return un entero
	 */
	public static int factorial(int num) {
		
		if(num > 1 ) {
			return num * factorial(num-1);
			//return numFactor;
			
		}
			return 1;//En algunas versiones me permite hacer esta funcion sin este return pero al mumero que e resulte se multiplicara con el valor de este return
		
	}
	/**
	 * Esta es un funcion para imprimir su nombre un numero determinado de veces
	 * @author Claudia Coello
	 * @param num entero
	 */

	public static void imprimirNombreRecursividad(int num) {
		System.out.println("Antes del if " + num + " Claudia" );//puedo tener el syso dentro o fuera del if, ya sea antes o despues, se imprimira el valor de manera descendente
		if(num > 0) {
			System.out.println(num + " Claudia" );//es importante tener en cuenta si la impresion viene antes o despues de la llamada

			imprimirNombreRecursividad(num-1);
		}
		System.out.println("Despues del if " +num + " Claudia" );//puedo tener el syso dentro o fuera del if, ya sea antes o despues, sin embargo, se inprimira wl valor de manera ascendente

	}

	/**
	 * Esta funcion es para encuentrar la suma de los enteros pares positivos desde un numero entero n hasta 2, si n es impar se imprime error
	 * @author Claudia Coello
	 * @param num entero
	 */
	public static int calcularSumaNumPosiPar(int num) {
		int numResult = -1;
		
		if(num%2 == 0) {
			//System.out.println();
			if(num>2) 
				return num + calcularSumaNumPosiPar(num - 2);//No es recomendable usar usar variables si no usar return directamente
			
		}
		
		else {
			System.out.print("El numero es impar ");
			return numResult;
		}
		return 0;//Debe ser 0 porque se sumaria con el otro return 
		
	}

  /*Programe un metodo recursivo que le invierta los numeros de un arreglo de enteros*/
  
  /**
   * Esta funcion es para conseguir los elementos de un arreglo de enteros
   * @param arreglo es un arreglo de enteros
   * @param contInicial es un entero
   * @return un entero
   * */
   //necesito una funcion para sacar los elementos del arreglo
    
    
    public static void invertirNumsArreglo(int[] arreglo, int contInicial, int contFinal) {
        if (contInicial < contFinal) {
            
            int temp = arreglo[contInicial];
            arreglo[contInicial] = arreglo[contFinal];
            arreglo[contFinal] = temp;
            
            invertirNumsArreglo(arreglo, contInicial + 1, contFinal - 1);
            
        }
        
    }

}
