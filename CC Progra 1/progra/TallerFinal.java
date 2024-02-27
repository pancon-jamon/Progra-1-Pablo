/**
 * Esta programa es el taller, un sistema para una compañía de diferentes transportes
 * @author Claudia Coello
 * @version 1.0
 * @date 27/02/2023
 */
import java.util.Scanner;

public class TallerFinal {
    public static void main(String[] args) {
        
        String[] medioTrans = {"taxi", "camion", "bus", "buseta", "camioneta"};
        int[] sucursalQ = {5, 7, 3, 4, 2};
        int[] sucursalG = {10, 2, 5, 4, 5};
        int[] sucursalC = {2, 4, 7, 8, 5};

        Scanner ingresoDatos = new Scanner(System.in);
        int banderaEnt = 0, opcIngresada = 0, numeroAumento = 0;
        String sucursalAumento, transAumento;
        do{
            System.out.println("Bienvenido a la compania de transporte");
            System.out.println("Desea ingresar medios de transporte? Ingrese 1");
            banderaEnt = Integer.parseInt(ingresoDatos.nextLine());
            
            if(banderaEnt == 1){
                System.out.println("A que sucursal desea ingresar?");
                sucursalAumento = ingresoDatos.nextLine();
                opcIngresada = determinarSucursal(sucursalAumento); 
                
                System.out.println("A que transporte desea aumentar");
                transAumento = ingresoDatos.nextLine().toLowerCase();
                
                System.out.print("Cuanto desea aumentar");
                numeroAumento = Integer.parseInt(ingresoDatos.nextLine());
                
                int[] nuevoArr;
        	     switch(opcIngresada){
        	         case 1:
        	             nuevoArr = aumentoSucursal(transAumento, numeroAumento, sucursalQ);
        	             
        	             break;
        	         case 2:
        	              nuevoArr = aumentoSucursal(transAumento, numeroAumento, sucursalG);
        	              
        	             break;
        	         case 3:
        	              nuevoArr = aumentoSucursal(transAumento, numeroAumento, sucursalC);
        	              
        	            break;
        	         default:
        	         System.out.printf("Error opción no válida");
        	            break;
        	            
        	     }
                
            }
        }while(banderaEnt<0);
        /*
b) Determinar el numero mayor del tipo de unidades por sucursal, y en general, en este caso 
debe tener una matriz para poder obtener estos valores, por ejemplo. 
{ 
{5, 7, 3, 4, 2} 
{5, 17, 3, 1, 3} 
{5, 7, 3, 4, 12} 
} 
Cada fila representara una sucursal, en este caso para Quito el numero mayor es 7 que 
representa los camiones, para Guayaquil el numero mayor es 17 que representa lo camiones y 
para Cuenca el numero mayor es 12 que representa las camionetas. Y el numero mayor 
general es el 17 para la sucursal Guayaquil para los camiones 
En esta opción se tendrá la siguiente respuesta: 
“Para la sucursal Quito se tiene 7 camiones, Guayaquil se tiene 17 Camiones y Cuenca 12 
Camionetas y La sucursal con más medios de transporte es Guayaquil” 

*/      System.out.println("Ahora que desea hacer? \n Digite 1 para imprimir las sucursales.");
        System.out.println("Digite 2 para Determinar el numero mayor del tipo de unidades por sucursal");
        System.out.println("Digite 3 para Determinar la inversion total");
        int menuDos = Integer.parseInt(ingresoDatos.nextLine());
        int matrizSucursales = [3][4];
        switch (menuDos) {
            case 1:
                imprimirSucursal("Quito", sucursalQ, medioTrans);
                imprimirSucursal("Guayaquil", sucursalG, medioTrans);
                imprimirSucursal("Cuenca", sucursalC, medioTrans);
                break;
            case 2:
                
                int posNumMayQ = determinarPosNumMayo(sucursalQ);
                int posNumMayG = determinarPosNumMayo(sucursalG);
                int posNumMayC = determinarPosNumMayo(sucursalC);
                
                // Llenar la matriz
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (i == 0)
                            matrizSucursales[i][j] = sucursalQ[j];
                        else if (i == 1) 
                            matrizSucursales[i][j] = sucursalG[j];
                        else if (i == 2) 
                            matrizSucursales[i][j] = sucursalC[j];
                        
                    }
                }

                break;
            case 3:

                System.out.println("La inversion total para la sucursal de Quito es: " + determinarInversionTotal(sucursalQ));
                System.out.println("La inversion total para la sucursal de Guayaquil es: " + determinarInversionTotal(sucursalG));
                System.out.println("La inversion total para la sucursal de Cuenca es: " + determinarInversionTotal(sucursalC));

                break;
            default:
            System.out.println("Error opc no valida");
                break;
        }
    }
    /**
     * Esta funcion es para asingnar un numero a la sucursal ingresada
     * @author Claudia Coello
     * @param sucursal es un String
     * @return un entero
     * */
    public static int determinarSucursal(String sucursal){
        int numeroSuc = -1;
        if((sucursal.toLowerCase()).equals("quito"))
            numeroSuc = 1;
        if((sucursal.toLowerCase()).equals("guayaquil"))
            numeroSuc = 2;
        if((sucursal.toLowerCase()).equals("cuenca"))
            numeroSuc = 3;
            
        return numeroSuc;
    }
   
	/**
	 * Esta funcion es para hacer aumentar el numero de transpotes
	 * @author Claudia Coello
     * @param sucursal es un arreglo de String
     * @return un arreglo de enteros
	 * */
       public static int[] aumentoSucursal(String transAumento, int numeroAumento, int[] sucursal) {
            int[] nuevoArr = new int[sucursal.length];
            for (int i = 0; i < sucursal.length; i++) {
                nuevoArr[i] = sucursal[i];
                if (medioTrans[i].equals(transAumento.toLowerCase())) {
                    nuevoArr[i] += numeroAumento;
                }

            }
            return nuevoArr;
        }
    
    /**
	 * Esta funcion es para hacer imprimir la sucursal
	 * @author Claudia Coello
     * @param sucursal es un arreglo de String
	 * */
    public static void imprimirSucursal(String nombreSucursal, int[] sucursal, String[] medioTrans) {
        System.out.print(nombreSucursal + ": [");
        for (int i = 0; i < medioTrans.length; i++) {
            System.out.print(sucursal[i] + "->" + medioTrans[i]);
        }
        System.out.println("]");
    }
    /**
     * Esta funcion es para determinar el precio de la inversion total por sucursal
     * @author Claudia Coello
     * @param sucursal es un arreglo de enteros
     * @return un entero
     * */
    public static int determinarInversionTotal(int[] sucursal){
        int[] precioTrans = {12000, 30000, 50000, 25000, 18000};
        int inversion = 0;
        
        for(int i =0; i<precioTrans.length; i++){
            inversion += precioTrans[i] * sucursal[i];
        }
        return inversion;
    }
    /**
     * Esta es una funcion para determinar la posicion del numero mayor en un arreglo
     * */
    public static int determinarPosNumMayo(int[] sucursal){
        int posNumMay = 0;
        for(int i =0; i<sucursal.length; i++){
            if(sucursal[i]>sucursal[i+1]){
                posNumMay = i;
            }
        }
        return posNumMay;
    }
    
    /**
     * Esta funcion es para imprimir el mensaje del 
     * */
}

