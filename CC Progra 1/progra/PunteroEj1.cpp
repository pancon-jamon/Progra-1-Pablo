//Imprimir las direcciones de memoria del uno al cinco
#include <iostream>
#include <string>
using namespace std;
int multiplicarValor(int*);
int main(){
	int valor;
	//Hacer una funcion que dado un valor me de el doble del mismo y que lo modifique directamente
	cout<<"Ingrese un numero ";
	cin>>valor;
	int* punteroValor= &valor;
	multiplicarValor(&valor);
	cout<<valor;
}
//Esta funcion multiplica por dos el dato almacenado en la dirreccion de memoria utilizada
//retorna un entero
//necesita un parametro de puntero
int multiplicarValor(int* valor){
	*valor=*valor*2;
	return *valor;
}
