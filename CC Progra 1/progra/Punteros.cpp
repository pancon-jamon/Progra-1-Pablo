/******************************************************************************
Punteros :referencias 
Hay dos formas de pasar parametros(algo que necesuta la funcion para trabajar)
Me permite cambiar el valor de un variable sin tener que reasignarla
*******************************************************************************/
#include <string>
#include <iostream>

using namespace std;
//Funcion donde se pase un valor y retorna el valor mas 10
int calcularValorMasDiez(int);
int funcionPunteros(int*);
int main()
{
    int valor = 10;
    int *direccionValor = &valor;//Es el puntero de valor, pasa el valor por referencia(en lugar de pasar el dato paso la direccion del dato)
    //el & es como decirle que use la flecha y no la caja donde se almacena la variable
    //si cambio el valor de valor no cambiara su espacio de memoria
    cout<<valor<<endl<<direccionValor<<endl;
	
	cout<<"Antes de la funcion "<<valor<<endl;
	calcularValorMasDiez(valor);//lamo a la funcion como una variable pero no cambie el valor de la cajita, para eso lo rasignamos
	cout<<"Despues de la funcion "<<valor<<endl;
	
	cout<<"Antes de la funcionPunteros "<<valor<<endl;
	funcionPunteros(direccionValor);//no necesito reasignar el valor, tambien puedo pasarle &valor
	//& me devuelve la direccion
	cout<<"Despues de la funcionPunteros "<<valor<<endl;//al ir directamente en lo que habia en ese puntero cambia direcatmente su valor

    return 0;
}
//La funcion 
int calcularValorMasDiez(int valor){
	return valor+10;
}
//Esta funcion retorna un entero y como insumo necesita un puntero
//Funcion por referencia
int funcionPunteros(int* valor){
	*valor=*valor+10;//esta sumando el valor que se encuentra en esa direccion y la gurado en la dirrecion donde apunta el puntero
	return *valor;
}
