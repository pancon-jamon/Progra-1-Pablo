//Nombres: Sebastian Guerrero y Claudia Coello
//Taller 3

/*Desarrollar un sistema de control de inventario para un fabrica de productos de limpieza. El sistema debe realizar las siguientes operaciones:
- Ingresar el nombre, stock y precio para 3 productos. Se debe realizar las validaciones  respectivas (Ingreso de solo numeros positivos) 
- Realizar retiro de productos. Esto debe realizarse en una funcion que haga la sustraccion del stock total. Adicionalmente,esta funcion debe llamar a otra funcion que haga la validacion
de que exista un stock suficiente para realizar el retiro. 
- Ingreso de stock. Esto se debe realizar en una funcion que permita hacer la adicion al stock general. 
- Control de inventario. Una funcion que muestre las unidades, precios y valor total de los productos. 
- Mostrar que producto tiene el mayor stock. Esto se debe realizar en una funcion que muestre el nombre del producto con su precio. 
- Mostrar el producto con menor stock. Esto se debe realizar en una funcion que muestre el nombre del producto con su precio.
- Una funcion alarma. Que indique que productos tienen menos de 20 productos en stock para que se realice la compra de nuevos productos. 

Esto debe ser desarrollado como un menu, en donde el usuario pueda elegir las operaciones escoger las operaciones que desee. */
#include<iostream>
#include <string>

using namespace std;
bool validarNumerosPositivos(int,double);
int asignarNumeroAProducto(string, string, string, string);
int validarOpcMenu(int);
int restarDelStockTotal(int,int);
bool stockSuficiente(int,int);
void sumarDelStockTotal(int, int);
void mostrarInventario(string, int, double);
void mostrarProductoMenorStock(int, int, int);
void mostrarProductoMayorStock(int,int,int);
int main()
{
    int stockProductoUno, stockProductoDos,stockProductoTres, stockProductoARetirar, numeroDelProductoARetirar, stockProductoASumar,numeroDelProductoASumar;
    int opcMenu;
    double precioUno, precioDos, precioTres;
    string nombreProductoUno, nombreProductoDos, nombreProductoTres,productoARetirar, productoASumar;
    
    cout << "Ingrese el nombre del primer producto" << endl;
    cin>>nombreProductoUno;
    cout << "Ingrese el nombre del segundo producto" << endl;
    cin>>nombreProductoDos;
    cout << "Ingrese el nombre del tercer producto" << endl;
    cin>>nombreProductoTres;
    
    do{
        cout<<"Ingrese el precio del primer producto"<<endl;
        cin>>precioUno;
        cout<<"Ingrese  el stock del primer producto"<<endl;
        cin>>stockProductoUno;
    }while(validarNumerosPositivos(stockProductoUno,precioUno));
    
    do{
        cout<<"Ingrese el precio del segundo producto"<<endl;
        cin>>precioDos;
        cout<<"Ingrese  el stock del segundo producto"<<endl;
        cin>>stockProductoDos;
    }while(validarNumerosPositivos(precioDos, stockProductoDos));
    
   do{
        cout<<"Ingrese el precio del tercer producto"<<endl;
        cin>>precioTres;
        cout<<"Ingrese  el stock del tercer producto"<<endl;
        cin>>stockProductoTres;
   }while(validarNumerosPositivos(precioTres, stockProductoTres));
   
   cout<<"Que desea realizar?"<<endl<<"Digite 1 para ingresar stock."<<endl<<"Digite 2 para controlar el inventario (muestrar las unidades, precios y valor total de los productos)."<<endl
   		<<"Digite 3 para mostrar que producto tiene el mayor stock."<<endl<<"Digite 4 para mostrar el producto con menor stock."<<endl<<"Digite 5 para retirar stock."<<endl;
	cin>>opcMenu;
    
    switch(validarOpcMenu(opcMenu)){
    	case 1:
    		cout << "Cual producto desea aumentar?" << endl;
		   cin>>productoASumar;
		   numeroDelProductoASumar= asignarNumeroAProducto(nombreProductoUno, nombreProductoDos ,nombreProductoTres,productoASumar);
		   
		   do{
		   		cout<<"Cuanto desea aumentar?"<<endl;
		   		cin>>stockProductoASumar;
		   }while(stockProductoASumar<0);
		   
		   if(numeroDelProductoASumar==1){
		   		sumarDelStockTotal(stockProductoUno,stockProductoASumar);
		   }
		   if(numeroDelProductoASumar==2){
		   		sumarDelStockTotal(stockProductoDos,stockProductoASumar);
		   }
		   if(numeroDelProductoASumar==3){
		   		sumarDelStockTotal(stockProductoTres,stockProductoASumar);
		   }
    		break;
    	case 2:
    		mostrarInventario(nombreProductoUno,stockProductoUno, precioUno);
    		mostrarInventario(nombreProductoTres,stockProductoTres, precioTres);
    		mostrarInventario(nombreProductoDos,stockProductoDos, precioDos);
    		break;
    	case 3:
    		mostrarProductoMayorStock(stockProductoUno,stockProductoDos,stockProductoTres);
    		break;
    	case 4:
    		mostrarProductoMenorStock(stockProductoUno, stockProductoDos, stockProductoTres);
    		break;
    	case 5:
    		cout << "Cual producto desea retirar?" << endl;
		   cin>>productoARetirar;
		   numeroDelProductoARetirar= asignarNumeroAProducto(nombreProductoUno, nombreProductoDos ,nombreProductoTres,productoARetirar);
		   cout << "Cuantos productos desea retirar?" << endl;
		   cin >> stockProductoARetirar;
		   if(numeroDelProductoARetirar==1){
		   		stockProductoUno=restarDelStockTotal(stockProductoARetirar, stockProductoUno);
		   		cout<<"El stock ahora es de "<<stockProductoUno;
		   }
		   if(numeroDelProductoARetirar==2){
		   		stockProductoDos=restarDelStockTotal(stockProductoARetirar, stockProductoDos);
		   		cout<<"El stock ahora es de "<<stockProductoDos;
		   }
		   if(numeroDelProductoARetirar==3){
		   		stockProductoTres=restarDelStockTotal( stockProductoARetirar, stockProductoTres);
		   		cout<<"El stock ahora es de "<<stockProductoTres;
		   }
		  
    		break;
	}
   if(stockProductoUno<20)
   		cout<<"El primer producto tiene menos de 20 productos"<<endl;
    if(stockProductoDos<20)
   		cout<<"El segundo producto tiene menos de 20 productos"<<endl;
   	if(stockProductoTres<20)
   		cout<<"El tercer producto tiene menos de 20 productos"<<endl;
    return 0;
}

//imprime el producto con mayor stock
void mostrarProductoMayorStock(int stockProductoUno,int stockProductoDos,int stockProductoTres){
	if(stockProductoUno>stockProductoDos && stockProductoUno>stockProductoTres)
		cout<<"El primero producto es el de mayor inventario"<<endl;
	if(stockProductoDos>stockProductoUno && stockProductoDos>stockProductoTres)
		cout<<"El segundo producto es el de mayor inventario"<<endl;
	if(stockProductoTres>stockProductoDos && stockProductoUno<stockProductoTres)
		cout<<"El tercer producto es el de mayor inventario"<<endl;
	
}

//imprime el producto con menor stock
void mostrarProductoMenorStock(int stockProductoUno,int stockProductoDos,int stockProductoTres){
	if(stockProductoUno<stockProductoDos && stockProductoUno<stockProductoTres)
		cout<<"El primero producto es el de menor inventario"<<endl;
	if(stockProductoDos<stockProductoUno && stockProductoDos<stockProductoTres)
		cout<<"El segundo producto es el de menor inventario"<<endl;
	if(stockProductoTres<stockProductoDos && stockProductoUno>stockProductoTres)
		cout<<"El tercer producto es el de menor inventario"<<endl;
	
}
void mostrarInventario(string nombreProducto, int stockProducto, double precioProducto){
	cout<<"El nombre del producto es "<<nombreProducto<<" el stock es de "<<stockProducto<<" su precio es de "<<precioProducto<<endl;
}
//Suma al stock total
void sumarDelStockTotal(int stockProducto, int stockProductoASumar){
	stockProducto=stockProducto+stockProductoASumar;
	cout<<"El stock ahora es de "<<stockProducto;
}
//sustrae del stock total.
int restarDelStockTotal(int stockProductoARetirar,int stockProducto){
	if(stockSuficiente(stockProductoARetirar,stockProducto))
		stockProducto=stockProducto-stockProductoARetirar;		
	else
		stockProducto=-1;
	return stockProducto;
}
//valida que exista un stock suficiente para realizar el retiro.
bool stockSuficiente(int stockProductoARetirar,int stockProducto){
	if(stockProductoARetirar>stockProducto)
		return false;
	return true;
}
/*Asignara un numero segun el producto seleccionado*/
int asignarNumeroAProducto(string nombreProductoUno, string nombreProductoDos ,string nombreProductoTres,string productoARetirar){
    if(productoARetirar==nombreProductoUno)
        return 1;
    else if(productoARetirar==nombreProductoDos)
        return 2;
    else  if(productoARetirar==nombreProductoTres)
        return 3;
}
//Verificara que el numero es positivo
bool validarNumerosPositivos(int stockProducto,double precio){
    if((stockProducto>0 && precio>0))
        return false;
    return true;
}
/*Verificara si la opcion del menu esta dentro del rango y devolvera un numero*/
int validarOpcMenu(int opcMenu){
	if(opcMenu>0 && opcMenu<=5)
		return opcMenu;
	return -1;
}
