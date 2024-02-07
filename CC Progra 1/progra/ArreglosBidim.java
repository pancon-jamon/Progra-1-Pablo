/*
Multiplicacion de dos matrices
El deber 
*/
public class ArreglosBidim
{
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int numFilas = matriz.length;
	    int numColumnas = matriz[0].length;
	    
		matriz = llenarMatrizDobleRand(numFilas, numColumnas);
		//mostrarMatrizEnt(matriz);
		
		int[] arregloColum = llenarArregloColumEnt(matriz);
		int[] arregloFila = llenarArregloFilaEnt(matriz);
		/*
		System.out.print("La suma de las filas es: ");
		imprimirMatriz(arregloFila);
		System.out.print("La suma de las columnas es: ");
		imprimirMatriz(arregloColum);
		
		// traza = calcularTraza(matriz);
        //System.out.println("La traza de la matriz es: " + traza);
        */
        int[][] matrizUno = llenarMatrizDobleRand(numFilas, numColumnas);
        int[][] matrizDos = llenarMatrizDobleRand(numFilas, numColumnas);
        System.out.println("Multiplicacion de matrices, las originales son");

        mostrarMatrizEnt(matrizUno);
        System.out.println();

        mostrarMatrizEnt(matrizDos);
        System.out.println("Su resultado es ");

        mostrarMatrizEnt(multiplicacionMatrices(matrizUno, matrizDos));
        System.out.println("Su transpuesta es ");
        mostrarMatrizEnt(multiplicacionMatrices(matrizUno, matrizDos));

	}
	
	/**
	 * Esta funcion es para rellenar una matriz doble con numeros randoms
	 * @author Claudia Coello
	 * @param matriz es una matriz de enteros
	 * @return una matriz de numeros enteros
	 * */
	public static int[][] llenarMatrizDobleRand (int numFilas, int numColumnas){
	    int[][] matrizLlena = new int[numFilas][numColumnas];
	    
	    for(int i=0; i<numFilas; i++){
	        for(int j=0; j<numColumnas; j++)
	            matrizLlena[i][j] = (int)(((Math.random())*10));
	    }
	    
	    return matrizLlena;
	}
	
	/**
	 * Esta funcion es para imprimir una matriz de enteros
	 * @author Claudia Coello
	 * @param matriz es una matriz de enteros
	 * */
	public static void mostrarMatrizEnt (int[][] matriz){
	     
	    int numFilas = matriz.length;
	    int numColumnas = matriz[0].length;

	    for(int i=0; i<numFilas; i++){
	        System.out.print("{");
	        for(int j=0; j<numColumnas; j++)
	            System.out.print(matriz[i][j] + " ");
	            
	        System.out.print("}");
	        System.out.println();
	    }
	    
	 }
	 
	/**
	 * Esta funcion es para llenar un arreglo con la suma de los valores de una fila
	 * @author Claudia Coello
	 * @param matriz es una matriz de enteros
	 * @return un arreglo de enteros
	 * */
	public static int[] llenarArregloFilaEnt (int[][] matriz){
	      int[] sumaFilas = new int[matriz.length];
	      
	      for(int i=0; i<matriz.length; i++){
	          for(int j=0; j<matriz[0].length; j++)
	        	  sumaFilas[i] += matriz[i][j]; 
	      }
	      
	      return sumaFilas;
	  }
	  
	/**
	 * Esta funcion es para llenar un arreglo con la suma de los valores de una fila
	 * @author Claudia Coello
	 * @param matriz es una matriz de enteros
	 * @return un arreglo de enteros
	 * */
	public static int[] llenarArregloColumEnt (int[][] matriz){
	      int[] sumaColum = new int[matriz.length];
	      
	      for(int i=0; i<matriz.length; i++){
	          for(int j=0; j<matriz[0].length; j++)
	        	  sumaColum[j] += matriz[i][j]; 
	      }
	      
	      return sumaColum;
	  }
	  
	/**
	 * Esta funcion es para imprimir un arreglo
	 * @author Claudia Coello
	 * @param arreglo es un arreglo de enteros
	 * */
	 public static void imprimirMatriz (int[] matriz) {
	     System.out.print("{");
	     
		for(int i=0; i<matriz.length; i++){
		    System.out.print(matriz[i] + " ");
		}
		
		System.out.println("}");
		
	 }
	 
	/**
     * Esta función calcula la traza (suma de los elementos en la diagonal) de una matriz cuadrada
     * @param matriz es una matriz cuadrada de enteros
     * @return la suma de los elementos en la diagonal de la matriz
     */
    public static int calcularTraza(int[][] matriz) {
        int traza = 0;
        
        for (int i = 0; i < matriz.length; i++) 
            traza += matriz[i][i];
        
        return traza;
    }
    
    /**
     * Esta función es para determinar la multiplicacion de dos matrices (del mismo tamaño)
     * @param filas numero entero
     * @param columnas numero entero
     * @return una matriz de enteros
     * */
    public static int[][] multiplicacionMatrices(int[][] matrizUno, int[][] matrizDos){
        
        int[][] matrizResultado = new int[matrizUno.length][matrizDos[0].length];

        for(int i=0; i<matrizUno.length; i++){
            for(int j=0; j<matrizUno[0].length; j++){
                for(int k=0; k<matrizDos[0].length; k++)
                    matrizResultado[i][j] += matrizUno[i][k]*matrizDos[k][j];
                
            }
        }
        return matrizResultado;
    }
    
    /**
     * Esta funcion es para transponer una matriz
     * @author Pablo 
     * @param matriz es una matriz de enteros
     * @return una matriz de enteros
     * */
        public static int[][] transponerMatrices(int[][] matriz){
            int filas = matriz.length;
            int columnas = matriz[0].length;
            int[][] matrizResultado = new int[filas][columnas];
            
            for(int contLento = 0; contLento < columnas; contLento++){//contador para columnas
                for(int contRap = 0; contRap < filas; contRap++){//contador para filas
                    matrizResultado[contLento][contRap] = matriz[contLento][contRap];
                }
            }
            return matrizResultado;
        } 

}
