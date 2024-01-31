 /*
 Hacer en un nuevo archivo crear dos arreglos de tipo enteo donde el usuario ingrese el tam los valor son alearorios:
- Uno determinar que valor se repite mas veces dentro del arreglo
- Dos Realizar la suma de los arreglos pero en orden invertido(el ultimo con el primero)
- Tres Multiplicar el arreglo por el valor mayor
Si un arreglo es un palindromo*/
import java.util.Scanner;
public class Main
{
	
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
		
		System.out.println("Los arreglo originales son: ");
		imprimirArregloEnt(arregloUno);
		System.out.print(" y: ");
		imprimirArregloEnt(arregloDos);
		//imprimirTodo(tamArrUno, tamArrDos, arregloUno, arregloDos);
		
		
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
	 * Esta es una funcion para determinar el numero que mas se repite dentro de un arreglo
	 * @param arreglo es un arreglo de enteros
	 * @return numMasRepetido es un entero
	 * */
	 public static int numMasRepetido(int[] arreglo){
	     for(int contUno = 0; contUno<arreglo.length; contUno++){
	         
	     }
	 }
}
