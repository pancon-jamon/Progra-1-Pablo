import java.util.Scanner;		

public class Main{

	public static void main(String[] args) {

		// Parte def de variables
		double coordenaX, coordenaY, distanciPunOri, direccionAngulo, cantidadADesplazarX, cantidadADesplazarY; 
		double coordenaXDos, coordenaYDos, distanciPunOriDos, direccionAnguloDos; 
		double coordenaXTres, coordenaYTres, distanciPunOriTres, direccionAnguloTres; 
		int cuadrantePunto; 
		int cuadrantePuntoDos;
		int opcDesplazamiento;
				
		//inicializacion de valores

		coordenaX = 0; 
		coordenaY = 0; 
		distanciPunOri = 0;
		cuadrantePunto = 0; 
		Scanner ingresoDatos = new Scanner(System.in);
		//Solicitud de datos
        
        //Con el primer punto
        System.out.println("Digite el valor para la coordena en X");
		coordenaX = Double.parseDouble(ingresoDatos.nextLine());
		
		System.out.println("Digite el valor para la coordena en Y");
		coordenaY = Double.parseDouble(ingresoDatos.nextLine());
		
		distanciPunOri = calcularModulo(coordenaX, coordenaY); 
		System.out.println("La distancia del punto al origen es " + distanciPunOri);
		
		double angulo= determinarDireccionPunto(coordenaX, coordenaY);
		imprimirCuadrante(angulo, cuadrantePunto, coordenaX, coordenaY);
		
		//Con el segundo punto
		System.out.println("Digite el valor para la coordena en X del segundo punto");
		coordenaXDos = Double.parseDouble(ingresoDatos.nextLine());
		
		System.out.println("Digite el valor para la coordena en Y del segundo punto");
		coordenaYDos = Double.parseDouble(ingresoDatos.nextLine());
		
		distanciPunOriDos = calcularModulo(coordenaXDos, coordenaYDos); 
		System.out.println("La distancia del punto al origen del segundo punto es " + distanciPunOriDos);
		
		double anguloDos= determinarDireccionPunto(coordenaXDos, coordenaYDos);
		imprimirCuadrante(anguloDos, cuadrantePunto, coordenaXDos, coordenaYDos);
		
		System.out.println("La distancia entre los dos puntos es " + distanciaPuntos(coordenaX, coordenaY, coordenaXDos, coordenaYDos));
		
		System.out.println("Digite 1 si quiere desplazar el primer punto, digite 2 si desea desplazar el segundo punto, digite 3 si no desea desplazar ninguno ");
		opcDesplazamiento = Integer.parseInt(ingresoDatos.nextLine());
		
		switch(opcDesplazamiento){
		    case 1:
                System.out.println("Cuanto desea desplazar el primer punto en x");
                cantidadADesplazarX = Double.parseDouble(ingresoDatos.nextLine());

                System.out.println("Cuanto desea desplazar el primer punto en y");
                cantidadADesplazarY = Double.parseDouble(ingresoDatos.nextLine());

                // Debes asignar los nuevos valores de coordenadas después de desplazar
                coordanadasDesplazadas(coordenaX, coordenaY, cantidadADesplazarX, cantidadADesplazarY);
                
                break;

            case 2:
                System.out.println("Cuanto desea desplazar el segundo punto en x");
                cantidadADesplazarX = Double.parseDouble(ingresoDatos.nextLine());

                System.out.println("Cuanto desea desplazar el segundo punto en y");
                cantidadADesplazarY = Double.parseDouble(ingresoDatos.nextLine());

                // Debes asignar los nuevos valores de coordenadas después de desplazar
                coordanadasDesplazadas(coordenaXDos, coordenaYDos, cantidadADesplazarX, cantidadADesplazarY);
                break;

            case 3:
                break;

            default:
                System.out.println("Opcion no valida ");
                break;
        }
		imprimirCoordenadasPolares(coordenaX, coordenaY);
		imprimirCoordenadasPolares(coordenaXDos, coordenaYDos);
		//La funcion al retornar true cuando el primero es mayor al segundo, el segundo es el menor, si es falso el primero es el mayor
		if(determinarModuloMenor(coordenaX, coordenaY, coordenaXDos, coordenaYDos)){
		    System.out.println("El punto mas cercano al punto de origen es el segundo");
		}else{
		     System.out.println("El punto mas cercano al punto de origen es el primero");
		}
		
		System.out.println("Ingrese la coordena en X para el tercer lado");
		coordenaXTres = Double.parseDouble(ingresoDatos.nextLine());
		
		System.out.println("Ingrese la coordena en Y para el tercer lado");
		coordenaYTres = Double.parseDouble(ingresoDatos.nextLine());
		
		if(determinarFormacionTriangulo(coordenaX, coordenaY, coordenaXDos, coordenaYDos, coordenaXTres, coordenaYTres)){
		    System.out.println("Se puede formar un triangulo");
		}else{
		    System.out.println("No se puede formar un r¿triangulo");
		}
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
		cuadCoorX = Math.pow(coordenaX, 2); 
		cuadCoorY = Math.pow(coordenaY, 2);

		return Math.sqrt(Math.pow(coordenaX, 2) + Math.pow(coordenaY,2));

	}
	
	/**
		 * @autor : Pablo
		 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
		 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
		 * @return: retorna la direccion del angulo
		 * @description: Esta es una funcion me permite calcular la direccion del angulo al punto (angulo)
	*/
	public static double determinarDireccionPunto (double coordenaX, double coordenaY){
		double angulo; 
		// Este angulo esta en randianes. 
		angulo = Math.abs(Math.atan(coordenaY / coordenaX)); 
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
	public static int determinarCuadrante(double coordenaX, double coordenaY) {
    int numero;

    if ((coordenaX > 0) && (coordenaY > 0)) {
        numero = 1;
    } else if ((coordenaX < 0) && (coordenaY > 0)) {
        numero = 2;
    } else if ((coordenaX < 0) && (coordenaY < 0)) {
        numero = 3;
    } else if ((coordenaX > 0) && (coordenaY < 0)) {
        numero = 4;
    } else if ((coordenaX == 0) && (coordenaY == 0)) {
        numero = 0;
    } else {
        // Manejar otros casos si es necesario
        numero = -1; // Por ejemplo, si no se cumple ninguna de las condiciones anteriores
    }

    return numero;
}
	
    /**
    	 * Esta es una funcion imprime el mensaje para saber en que cuadrante se encuentra y su angulo. 
    	 * @autor : Pablo
    	 * @param: direccionAngulo es el angulo del punto
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
    	 * @param: cuadrantePunto es el cuadrante el cual se encuentra el punto
     */
	public static void imprimirCuadrante(double direccionAngulo,int cuadrantePunto, double coordenaX, double coordenaY) {
	    
		cuadrantePunto = determinarCuadrante(coordenaX, coordenaY);
		System.out.println("El punto se encuentra en el cuandrante " + cuadrantePunto); 
		if(cuadrantePunto == 1){
			direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
			System.out.println("La direccion del punto es " + direccionAngulo);
		}	
		if(cuadrantePunto == 2){
			direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
			System.out.println("La direccion del punto es " + (180 - direccionAngulo ));
		}
		if(cuadrantePunto == 3){
			direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
			System.out.println("La direccion del punto es " + (180 + direccionAngulo )); 
		}
		if(cuadrantePunto == 4){
			direccionAngulo = determinarDireccionPunto(coordenaX, coordenaY);
			System.out.println("La direccion del punto es " + (360 - direccionAngulo )); 
		}
	}
	
    /**
    	 * Esta es una funcion calcula la distancia entre dos puntos
    	 * @autor: Claudia Coello
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
    	 * @return: un doble que representa la distancia entre los dos puntos ingresados
    */
    public static double distanciaPuntos(double coordenaXUno, double coordenaYUno, double coordenaXDos, double coordenaYDos) {
    double distanciaPuntoX = coordenaXUno - coordenaXDos;
    double distanciaPuntoY = coordenaYUno - coordenaYDos;

    return Math.sqrt(Math.pow(distanciaPuntoX, 2) + Math.pow(distanciaPuntoY, 2));
    }
    
    /**
    	 * Esta es una funcion que imprime el desplazamiento de un punto
    	 * @autor: Claudia Coello
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
      	 * @param: desplazamientoEnX representa la cantidad de desplazamiento en X
    	 * @param: desplazamientoEnY   representa la cantidad de desplazamiento en Y
    */
    public static void coordanadasDesplazadas(double coordenaX, double coordenaY, double desplazamientoEnX, double desplazamientoEnY){
        double coordenadaDesplazadaX = coordenaX+desplazamientoEnX;
        double coordenadaDesplazadaY = coordenaY+desplazamientoEnY;
        
        System.out.println("La nueva coordenada en x es " + coordenadaDesplazadaX);
        System.out.println("La nueva coordenada en y es " + coordenadaDesplazadaY);
    }
    
    /** 
    	 * Esta es una funcion para imprimir las coordenadas polares de un punto
    	 * @autor : Claudia Coello
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
     */
     public static void imprimirCoordenadasPolares(double coordenaX, double coordenaY){
        double radio = calcularModulo(coordenaX, coordenaY);
        double angulo = determinarDireccionPunto(coordenaX, coordenaY);
        System.out.println("Las coordenadas polares son: Radio " + radio + " Angulo: " + angulo);
     }
    /** 
    	 * Esta es una funcion para determinar el punto mas cercano al punto de origen, el modulo de menor valor
    	 * @autor : Claudia Coello
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
    	 * @param: coordenaXDos representa la distancia desde el origen hasta el segundo valor en X
    	 * @param: coordenaYDos  representa la distancia desde el origen hasta el segundo valor en Y
    	 * @return: true si el modulo del primer punto es menor al segundo, false si el segundo es mayor al primero
     */
    public static boolean determinarModuloMenor(double coordenaX, double coordenaY, double coordenadaXDos, double coordenadaYDos){
        if( (calcularModulo(coordenaX, coordenaY)) > (calcularModulo(coordenadaXDos, coordenadaYDos)) )
            return true;
        return false;
    }
    
    /** 
    	 * Esta es una funcion para determinar si dados tres puntos se puede formar un triangulo
    	 * @autor : Claudia Coello
    	 * @param: coordenaX representa la distancia desde el origen hasta el valor en X
    	 * @param: coordenaY  representa la distancia desde el origen hasta el valor en Y
    	 * @param: coordenaXDos representa la distancia desde el origen hasta el segundo valor en X
    	 * @param: coordenaYDos  representa la distancia desde el origen hasta el segundo valor en Y
    	 * @param: coordenaXTres representa la distancia desde el origen hasta el tercer valor en X
    	 * @param: coordenaYTres  representa la distancia desde el origen hasta el tercer valor en Y
    	 * @return: true si se puede formar un triangulo, false si no
     */
    public static boolean determinarFormacionTriangulo(double coordenaX, double coordenaY, double coordenadaXDos, double coordenadaYDos, double coordenadaXTres, double coordenadaYTres) {
        double ladoAB = distanciaPuntos(coordenaX, coordenaY, coordenadaXDos, coordenadaYDos);
        double ladoBC = distanciaPuntos(coordenadaXDos, coordenadaYDos, coordenadaXTres, coordenadaYTres);
        double ladoAC = distanciaPuntos(coordenaX, coordenaY, coordenadaXTres, coordenadaYTres);
    
        return (ladoAB + ladoBC > ladoAC) && (ladoAB + ladoAC > ladoBC) && (ladoAC + ladoBC > ladoAB);
    }
}
