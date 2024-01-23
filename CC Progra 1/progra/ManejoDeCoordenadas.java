/*

		
	}
	

	
	
	
	
	double calcularModulo(){
		
	
	}
	
	*/
public class ManejoDeCoordenadas {

	public static void main(String[] args) {

		// Parte def de variables
		double coordenaX, coordenaY, distanciPunOri, direccionAngulo; 
		int cuadrantePunto; 
				
		//inicializacion de valores

		coordenaX = 0; 
		coordenaY = 0; 
		distanciPunOri = 0;
		cuadrantePunto = 0; 
		import java.util.Scanner;		
		Scanner ingresoDatos = new Scanner(System.in);
		//Solicitud de datos

		coordenaX = Double.parseDouble(ingresoDatos.nextLine());
		System.out.println("Digite el valor para la coordena en X");
		
		coordenaY = Double.parseDouble(ingresoDatos.nextLine());
		System.out.println("Digite el valor para la coordena en Y");
		
		distanciPunOri = calcularModulo(coordenaX, coordenaY); 
		
		System.out.println("\"La distancia del punto al origen es " + distanciPunOri);
		//++++++++++++++++Tarea: Transformar el siguiente codigo a una funcion de tipo void. 
		//Esta funcion necesita el angulo y el cuadrante. 
		//Imprime el mensaje para saber en que cuadrante se encuentra. 
				
				cuadrantePunto = determinarCuadrante(coordenaX, coordenaY);
				cout<<"El punto se encuentra en el cuandrante " << cuadrantePunto <<endl; 
				if(cuadrantePunto == 1){
					direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
					cout<< "La direccion del punto es " << direccionAngulo <<endl; 
				}	
				if(cuadrantePunto == 2){
					direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
					cout<< "La direccion del punto es " << (180 - direccionAngulo )<<endl; 
				}
				if(cuadrantePunto == 3){
					direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
					cout<< "La direccion del punto es " << (180 + direccionAngulo )<<endl; 
				}
				if(cuadrantePunto == 4){
					direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
					cout<< "La direccion del punto es " << (360 - direccionAngulo )<<endl; 
				}
				
				return 0; 
	}
	
	/**
		 * Esta es una funcion que me calcula la distancia desde el origen a un punto. 
		 * @autor : Pablo
		 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
		 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
		 * @return: retorna la distancia desde el origen al punto. 
	 */
	public static double calcularModulo(double coordenaX, double coordenaY) {
		double cuadCoorX, cuadCoorY;  
		cuadCoorX = pow(coordenaX, 2); 
		cuadCoorY = pow(coordenaY, 2);

		return sqrt(pow(coordenaX, 2) + pow(coordenaY,2));

	}
	
	/**
		 * @autor : Pablo
		 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
		 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
		 * @return: retorna la direccion del angulo
		 * @description: Esta es una funcion me permite calcular la direccion del angulo al punto
	*/
	
	public static double determinarDireccionPunto (double coordenaX, double coordenaY){
		double angulo; 
		// Este angulo esta en randianes. 
		angulo = abs(atan(coordenaY / coordenaX)); 
		angulo = convertirRadAGra(angulo);
		return angulo; 
	}
	
	/**
		 * @autor : Pablo
		 * @param: angulo representa el angulo en radianes
		 * @return: el angulo en grados. 
		 * @description: Esta es una funcion me permite transformar un angulo en radianes a grados. 
	*/
	
	public static double convertirRadAGra (double anguloRad){
		double anguloTrans;
		anguloTrans = 0; 
		anguloTrans = (anguloRad * 180) / 3.141592653589793; 
		return anguloTrans; 
	}
	

	/**
		 * @autor : Pablo
		 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
		 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
		 * @return: retorna el cuadrante donde se encuentra el punto. 
		 * @description: Esta es una funcion indica en que cuadrante se encuentra el punto. 
	*/
	public static int determinarCuadrante (double coordenaX, double coordenaY){
		if((coordenaX > 0)&&(coordenaY>0)){
			return 1; 
		}
		if((coordenaX < 0)&&(coordenaY>0)){
			return 2; 
		}
		if((coordenaX < 0)&&(coordenaY<0)){
			return 3; 
		}
		if((coordenaX > 0)&&(coordenaY<0)){
			return 4; 
		}
			if((coordenaX == 0)&&(coordenaY==0)){
			return 0; 
		}
	}
	public static void imprimirCuadrante() {
		
	}
}
