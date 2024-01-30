/*Hacer 2 arreglos de tipo entero, su tamaño sera ingresado por la consola por el usuario, 
 crear una funcion que llene los arreglo con numeros de forma alearoria donde el usuario indique
 el rango
 La segunda funcion deseo sumar los 2 arreglos por posicion
 La tercera concatenar los numeros de los dos arreglos
 La cuarta es determinar el minimo valor de los dos arreglos*/
import java.util.Scanner;
public class ArreglosUnidim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamArrUno = 0, tamArrDos = 0;
		int tamComparable = 0;
		Scanner ingreso = new Scanner(System.in);
		int[] arregloUno = new int[tamArrUno];
		int[] arregloDos = new int[tamArrDos];
		

		System.out.println("Ingrese el tamaño del primer arreglo");
		tamArrUno = Integer.parseInt(ingreso.nextLine());
		
		System.out.println("Ingrese el tamaño del segundo arreglo");
		tamArrDos = Integer.parseInt(ingreso.nextLine());
		
		arregloUno = llenarArregloEnt(tamArrUno);
		arregloDos = llenarArregloEnt(tamArrDos);
		
		System.out.print("Los arreglo originales son: ");
		imprimirArregloEnt(arregloUno);
		System.out.print(" y: ");
		imprimirArregloEnt(arregloDos);
		
		tamComparable = determinarTamIgual(tamArrUno, tamArrDos);
		
		if(tamComparable == 1) {
			tamArrDos = tamArrDos + (tamArrUno-tamArrDos);
		}else if(tamComparable == 2) {
			tamArrUno = tamArrUno + (tamArrDos-tamArrUno);
		}
		
		System.out.println("La suma de los dos arreglo es ");
		determinarSumaArreglos(arregloUno, arregloDos);
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
}
