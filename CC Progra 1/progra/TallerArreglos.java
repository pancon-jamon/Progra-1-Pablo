//Claudia Coello
//Taller 1
import java.util.Scanner;
public class TallerArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nombre cantidad de stock precio y si ofrece descuento
		int size = 7;
		Scanner ingresoDatos = new Scanner(System.in);
		String productoIngresado;
		
		String[] producto = new String[size];
		int[] stock = new int[size];
		double[] precio = new double[size];
		boolean[] descuento = new boolean[size];
		
		producto = new String[]{"P1" , "P2" , "P3", "P4" , "P5" , "P6", "P7"};
		stock = new int[] {52, 30 , 15, 12, 18, 26, 35};
		precio = new double[] {0.9, 1.95, 2.23,3.14, 16.7, 3, 2.24};
		descuento = new boolean[] {true, true, true, false, false, false, true};
		
		calcularPrecioTotal(stock, precio);
		System.out.println();
		mostrarProductoMasStock(determinarProductoMasStock(stock), producto);
		//Retiro producto
		System.out.print("Ingrese el nombre del producto que desea retirar ");
		productoIngresado = ingresoDatos.nextLine();
		
		System.out.print("Cuanto desea retirar ");
		int cantProducto = Integer.parseInt(ingresoDatos.nextLine());
		int cantProductoAumento = cantProducto * -1;
		stock = determinarNuevoStock(stock, cantProductoAumento, productoIngresado);
		
		//Aumento Producto
		System.out.print("Ingrese el nombre del producto que desea aumentar ");
		productoIngresado = ingresoDatos.nextLine();
		
		System.out.print("Cuanto desea aumentar ");
		cantProducto = Integer.parseInt(ingresoDatos.nextLine());
		cantProductoAumento = cantProducto;
		stock = determinarNuevoStock(stock, cantProductoAumento, productoIngresado);
		
		//mostrarArregloEnt(stock);
		
	}
	public static void mostrarArregloEnt(int[] arreglo) {
		System.out.print("{");
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i] + " ,");
		}
		System.out.println("}");
	}
	/**
	 * Esta funcion es para calcular el valor total por producto
	 * @author Claudia Coello
	 * @param stock es el arreglo de enteros 
	 * @param precio es un arreglo de dobles
	 * @return valorProducto es un arreglo de dobles
	 */
	public static double[] calcularPrecioTotal(int[] stock, double[] precio) {
		int size = stock.length;
		double[] precioTotal = new double[size];
		
		for(int cont=0; cont<size; cont++) {
			precioTotal[cont] = stock[cont] * precio[cont];
		}
		return precioTotal;
	}
	/**
	 * Esta funcion determinara el producto con mayor stock
	 * @author Claudia Coello
	 * @param stock es un arreglo de enteros
	 * @return numProductoMay es un numero entero que representa el numero del producto
	 */
	public static int determinarProductoMasStock(int[] stock) {
		int numeroProducto = stock[0];
		int numProductoMayor = 0;
		for(int i= 0; i<stock.length; i++) {
			if(stock[i]> numeroProducto) {
				numeroProducto = stock[i];
				numProductoMayor = i;
			}
		}
		
		return numProductoMayor;
	}
	/**
	 * Esta funcion es para mostrar el producto con mas stock
	 * @author Claudia Coello
	 * @param numeroProducto entero
	 * @param productos es en arreglo de strings
	 */
	public static void mostrarProductoMasStock(int numeroProducto, String[] productos) {
		System.out.print("El producto con mayor stock es: ");
		for(int cont=0; cont<productos.length; cont++) {
			if(cont == numeroProducto) {
				System.out.println(productos[cont]);
			}
		}
	}
	/**
	 * Esta funcion me permitira saber cual es el producto que se desea aumentar stock
	 * @author Claudia Coello
	 * @param productoRetiro es un string
	 * @return numeroProducto es un entero
	 */
	public static int determinarProductoRetiro(String productoRetiro) {
	    int numeroProducto = 4;

	    if ("P1".equals(productoRetiro)) 
	        numeroProducto = 0;
	    if ("P2".equals(productoRetiro)) 
	        numeroProducto = 1;
	    else if ("P3".equals(productoRetiro))
	        numeroProducto = 2;
	    else if ("P4".equals(productoRetiro))
	        numeroProducto = 3;
	    else if ("P5".equals(productoRetiro))
	        numeroProducto = 4;
	    else if ("P6".equals(productoRetiro)) 
	        numeroProducto = 5;
	    else if ("P7".equals(productoRetiro)) 
	        numeroProducto = 6;
	    

	    return numeroProducto;
	}
	/**
	 * Esta funcion es para modificar el stock del producto
	 * @param stock es un arreglo de enteros
	 * @param cantProductoAumento es un entero 
	 * @return nuevoStock es un arreglo de enteros
	 */
	public static int[] determinarNuevoStock(int[] stock, int cantProductoAumento, String productoAumento) {
		int[] nuevoSock = new int[7];
		int productoASumar = determinarProductoRetiro(productoAumento);
		for(int contador=0; contador<stock.length; contador++) {
			if(contador == productoASumar) {
				stock[contador] = stock[contador] + cantProductoAumento;
			}
			nuevoSock[contador] = stock[contador];
		}
		return nuevoSock;
	}
}
