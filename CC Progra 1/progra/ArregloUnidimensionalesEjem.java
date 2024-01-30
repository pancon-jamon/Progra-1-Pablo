/**
 * Esta clase me permitira afinzar conceptos de arreglos unidimensionales
 * 
 */
public class ArregloUnidimensionalesEjem {
	public static void main(String[] args) {
	    //arreglo lleno de randomicos del 11-400****
		double[] arregloDoble = new double[20];
        arregloDoble = llenarArregloDouble(arregloDoble.length);
        imprimirArregloDob(arregloDoble);
        //**************
        
        //arreglo Int[10], usar la funcion para llenarla de elementos y luego 
        //crear una funcion que lo sume con el arreglo que ya estaba*********
        int[] arregloIntUno = new int[10];
        int[] arregloIntDos = new int[10];
        int[] sumaArreglos = new int[arregloIntUno.length];
        
        arregloIntUno = llenarArregloEnt(arregloIntUno.length);
        arregloIntDos = llenarArregloEnt(arregloIntDos.length);
        
        System.out.print("Los arreglos originales son: ");
        imprimirArregloEnt(arregloIntUno);
        System.out.print(" y: ");
        imprimirArregloEnt(arregloIntDos);
        
        System.out.println("Su suma es: ");
        sumaArreglos = sumarArreglosEnteros(arregloIntUno, arregloIntDos);
        imprimirArregloEnt(sumaArreglos);
        //*********************
        //Tercero crear una funcion que reciba un arreglo de tipo entero de parametro y retorne la suma de todos los elementos**************************
        int[] arregloEntero = new int[10];
        arregloEntero = llenarArregloEnt(arregloEntero.length);
       imprimirArregloEnt(arregloEntero);
        System.out.println( sumarElemEnt(arregloEntero));
        //**************************************
        //Cuarto: Crear una funcion que reciba el tamaño de un arreglo y retorne 
        //un arreglo de tipo caracter, este tendra un tamaño de 100
        //y los caracteres se generaran de manera aleatoria***********************
        char[] arregloChar = new char[100];
        arregloChar = llenarArreglosChar(arregloChar.length);
        imprimirArregloChar(arregloChar);
        //**********************************
	}
	/**
	 * Esta funcion me sumara todos los elementos de un arreglo de numeros enteros
	 * @param arregloEntero es un arreglo de enteros
	 * @return un entero
	 */
	public static int sumarElemEnt(int[] arregloEntero) {
		// TODO Auto-generated method stub
		int suma = 0;                                                                                                       
		for(int i = 0; i < arregloEntero.length; i++) {
			suma += suma;
			suma = arregloEntero[i];
		}
		return suma;
	}

	/**
	 * Esta funcion imprime los valores de un arreglo de tipo entero
	 * @param arregloEnt: Es un arreglo de tipo entero
	 */
	public static void imprimirArregloEnt(int[] arregloEnt) {
		System.out.print("{");
		for(int i = 0 ; i < arregloEnt.length ; i++) {
			System.out.print(arregloEnt[i] + " , ");
		}
		System.out.println("}");

		
	}
    /**
	 * Esta funcion llena un arreglo de tipo entero
	 * @param tamanoArreglo: Es el size del arreglo
	 * @return Un arreglo de tipo entero
	 */
	public static int[] llenarArregloEnt(int tamanoArreglo) {
		int[] arregloRet = new int[tamanoArreglo]; 
		// llenar el arreglo con valores 50 - 200; 
		for(int i = 0 ; i < arregloRet.length ; i++) {
			arregloRet[i] = (int)((Math.random()*151)+50); 
		}
		
		return arregloRet;
	}
	/**
	 * Esta funcion imprime los valores de un arreglo de tipo texto
	 * @param arreglo: Es un arreglo de tipo String
	 */
	public static void imprimirArreglo(String[] arreglo) {
		System.out.print("{");
		for(int i = 0 ; i < arreglo.length ; i++) {
			System.out.print(arreglo[i] + " , ");
		}
		System.out.println("}");
	}
	/**
	 * Esta funcion llena un arreglo de tipo String
	 * @param tamanoArreglo: el numero de elementos de arreglo
	 * @return Un arreglo de tipo string 
	 */
	public static String[] llenarArreglo(int tamanoArreglo) {
		String[] arregloRet = new String[tamanoArreglo]; 
		String [] diccionario = {"Hola","Adios","Progra","Texto","Valor"};
		int posDiccionario ; 
		//Castear : Transformar un tipo de dato a otro. Tome en cuenta
		// que el casteo solo se aplica a UNA linea de codigo. 

		for(int i = 0 ; i < arregloRet.length; i++) {
			posDiccionario = (int)((Math.random()*diccionario.length));
			arregloRet [i] = diccionario[posDiccionario]; 
		}

		return arregloRet;
	}
    /**
	 * Esta funcion llena un arreglo de tipo double
	 * @param sizeArreglo: Es el size del arreglo
	 * @return Un arreglo de tipo double
	 */
	 public static double[] llenarArregloDouble(int sizeArreglo){
	     double[] arreglo = new double[sizeArreglo];
	     for(int i = 0; i<sizeArreglo ; i++){
	         arreglo[i] = (Math.random() * 389) + 11;
	          
	     }
	    
	     return arreglo;
	 }
	 /**
	 * Esta funcion imprime los valores de un arreglo de tipo entero
	 * @param arregloEnt: Es un arreglo de tipo entero
	 */
	public static void imprimirArregloDob(double[] arregloDob) {
		System.out.print("{");
		for(int i = 0 ; i < arregloDob.length ; i++) {
			System.out.print(arregloDob[i] + " , ");
		}
		System.out.println("}");

		
	}
	
	/**
	 * Esta funcion me sumara dos arreglos de numeros enteros
	 * @param arregloEntUno es un arreglo de enteros
	 * @param arregloEntDos es un arreglo de enteros
	 * @return un arreglo de enteros
	 */
	 public static int[] sumarArreglosEnteros(int[] arregloEntUno, int[] arregloEntDos){
	     int sizeArreglo = arregloEntUno.length;//Al ser arreglos del mismo tamaño puede utilizar cualquiera de los dos para saber su tamaño
	     int[] arregloSuma = new int[sizeArreglo];
	     for(int i=0; i<sizeArreglo; i++){
	         arregloSuma[i] = arregloEntUno[i] + arregloEntDos[i];
	     }
	     return arregloSuma;
	 }
	 
	 /**
	 * Esta funcion llena un arreglo de tipo char
	 * @param sizeArreglo: Es el size del arreglo
	 * @return Un arreglo de tipo char
	 */
	 public static char[] llenarArreglosChar(int sizeArreglo){
	     char[] arreglo = new char[sizeArreglo];
	     
	     for(int i=0; i<sizeArreglo; i++ ){
	         arreglo[i] = (char)((Math.random() * 94) + 33);
	     }
	     return arreglo;
	 }
	 /**
	 * Esta funcion imprime los valores de un arreglo de tipo char
	 * @param arreglo: Es un arreglo de tipo char
	 */
	public static void imprimirArregloChar(char[] arreglo) {
		System.out.print("{");
		for(int i = 0 ; i < arreglo.length ; i++) {
			System.out.print(arreglo[i] + " , ");
		}
		System.out.println("}");
	}
}
