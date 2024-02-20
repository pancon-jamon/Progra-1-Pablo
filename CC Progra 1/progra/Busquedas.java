/*Busqueda secuencial
 * Los datos pueden estar ordenados, se va a comparar directamente dato por dato y puede devolverse su ubicacion 
 * 
 * Busqueda binaria
 * Los datos deben estar ordenados para saber en que lado se debe buscar, cuando el numero de datos es impar se castea, el elemento que nos ayudara
 * con esto se conoce como pivote que sera la referencia
*/
/*
 * Esta es un clase que me permite 
 * @author Claudia Coello
 * @version 1.0
 */
//Hasta el domingo correccion del taller completo y 
/*Aumentar una fucinon para encontrar un palabra de busqueda secuencial(con .toEquals) y una binaria  */
import java.util.Scanner;

public class Busquedas
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] arrSecuencial = {1,2,3,7,4,7,8};
        int[] arrBinario = {4,2,5,7,7,8,3};
        int pivote =(int) arrBinario.length/2;
        int datoBusqueda;

        //En la busqueda se admite como respuesta un no encontrado, esta respuesta 
        //normalmente se representa como -1 para indicar que no existe el elemento en 
        //una pocision determinada en un gurpo de datos
        
        System.out.println("Que dato desea encontrar de manera secuencial");
        datoBusqueda = Integer.parseInt(sc.nextLine());
        busqueda(arrSecuencial, datoBusqueda);

        System.out.println("Que dato desea encontrar de manera binaria");
        datoBusqueda = Integer.parseInt(sc.nextLine());
        busqueda(arrBinario, datoBusqueda, pivote);
	}
    /*
     * Esta funcion es para una busqueda binaria
     * @author: Claudia Coello
     * @param arrBinario
     * @param datoBusqueda
     */
    private static void busqueda(int[] arrBinario, int datoBusqueda, int pivote) {

        if(arrBinario[pivote] == datoBusqueda)
            System.out.println("Dato encontrado en pos " + pivote);
        if(arrBinario[pivote] > datoBusqueda)//Buscamos a la izquierda de manera secuencial
            busqueda(arrBinario, datoBusqueda);
        
        else//Buscamos a la derecha de manera secuencial
            busqueda(arrBinario, datoBusqueda);
        
    }
    /*
     * Esta funcion me permite imprimir una busqueda secuencial
     * @author: Claudia Coello
     * @param arrSequencial
     * @param datoBusqueda
     */
    private static void busqueda (int[] arrSecuencial, int datoBusqueda){//Agregar el pivote para sobrecargarlo y un caracter
        int bandera = -1;
        for (int pos = 0; pos<arrSecuencial.length; pos++) {
            if(arrSecuencial[pos] == datoBusqueda){
                bandera = pos;
                System.out.println("Dato encontrado en la posicion " + bandera);
            }
               
        }
        if(bandera == -1)
            System.out.println("Dato no encontrado " + bandera);
        
    }
}
