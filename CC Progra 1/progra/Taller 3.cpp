/*Desarrollar un sistema de control de inventario para un 
fabrica de productos de limpieza. El sistema debe realizar
 las siguientes operaciones:
• Ingresar el nombre, stock y precio para 3 productos.
 Se debe realizar las validaciones  respectivas (Ingreso de solo números positivos) !
• Realizar retiro de productos. Esto debe realizarse en una
 función que haga la sustracción del stock total. Adicionalmente,
  esta función debe llamar a otra función que haga la validación
de que exista un stock suficiente para realizar el retiro. 
• Ingreso de stock. Esto se debe realizar en una función que
 permita hacer la adición al stock general. 
• Control de inventario. Una función que muestre las unidades, 
precios y valor total de los productos. 
• Mostrar que producto tiene el mayor stock. Esto se debe realizar 
en una función que muestre el nombre del producto con su precio. 
• Mostrar el producto con menor stock. Esto se debe realizar en 
una función que muestre el nombre del producto con su precio.
• Una función alarma. Que indique que productos tienen menos de 20 
productos en stock para que se realice la compra de nuevos productos. 
Esto debe ser desarrollado como un menú, en donde el usuario 
pueda elegir las operaciones escoger las operaciones que desee. */
#include<iostream>
#include <string.h>

using namespace std;
bool validarNumerosPositivos(int, int, int, double, double, double);
int asignarNumeroAProducto(string, string, string, string);
int main()
{
    int stockProductoUno, stockProductoDos,stockProductoTres, stockProductoARetirar, numeroDelProductoARetirar;
    double precioUno, precioDos, precioTres;
    string nombreProductoUno, nombreProductoDos, nombreProductoTres,productoARetirar;
    
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
    }while(validarNumerosPositivos(precioUno, stockProductoUno));
    
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
    
   cout << "Cual producto desea retirar?" << endl;
   cin>>productoARetirar;
   numeroDelProductoARetirar= asignarNumeroAProducto(nombreProductoUno, nombreProductoDos ,nombreProductoTres,productoARetirar);
   cout << "Cuantos productos desea retirar?" << endl;
   cin >> stockProductoARetirar;
   
   switch(numeroDelProductoARetirar){
       case 1:
            break;
       case 2:
            break;
       case 3:
            break;       
    }
    
    return 0;
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
bool validarNumerosPositivos(int stockProductoUno,int stockProductoDos, int stockProductoTres, double precioDos, double  precioTres, double precioUno){
    if((stockProductoUno>0 && precioUno>0)|| (stockProductoDos>0 && precioDos>0)|| (stockProductoTres>0 && precioTres>0))
        return false;
    return true;
}