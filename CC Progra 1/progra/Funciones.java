/**
	 * Esta clase contiene ejemplos de funciones
	 * @author Claudia Coello
	 * @version 1.0
 */
public class Funciones {

	public static void main(String[] args) {
		//Def variables
		int resultado, edad = 21;
		double dinero = 10;
		boolean tenenciaCedula = true;
		resultado = sumarDosNumeros(5, 3);
		System.out.println("El resultado de la suma es " + resultado);

		edad = Integer.parseInt(ingresoDatos.nextLine()) ;
		
		determinarFactores(12);
		
		if(aprobarEntrada(tenenciaCedula, edad, dinero))
			System.out.println("Puede entrar");
		else 
			System.out.println("No puede ingresar");
	}
	
/**
	 * Esta funcion me permite determinar si se puede entrar a un bar
	 * @author Claudia Coello
	 * @param tenenciaCedula: Booleano de si tiene o no una cedula
	 * @param edad: Entero de la edad
	 * @param dinero: Double del dinero que tiene
	 * @return Retorna un boolean, verdadero si puede entrar, falso si no 
 */
	public static boolean aprobarEntrada(boolean tenenciaCedula, int edad, double dinero) {
		if((tenenciaCedula==true) && (edad>=18) && (dinero>5))
			return true;
		return false;
		//return ((tenenciaCedula==true) && (edad>=18) && (dinero>5));
	}

/**
	 * Esta funcion me permite imprimir los factores de un numero
	 * @author Claudia Coello
	 * @param numero: Es el valor a determinar su factor
*/
	public static void determinarFactores(int numero) {
		// TODO Auto-generated method stub
		for(int contador=1; contador<=numero; contador++) {
			if((numero%contador)==0)
				System.out.println("El numero " + contador + " es factor de " + numero);
		}
	}
/**
	 * Esta funcion me permite sumar dos numeros enteros
	 * @author Claudia Coello
	 * @param numUno: Primer numero a sumar
	 * @param numDos: Segundo numero a sumar
	 * @return Retorna un numero entero suma de los parametros
 */
	public static int sumarDosNumeros(int numUno, int numDos) {
		
		int resultado = numUno + numDos;
		return resultado;
		//return numUno + numDos;
	}

}
