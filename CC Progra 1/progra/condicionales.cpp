//Claudia Coello
//Version 1.0
//12 dic 2023, condicionales

/*
                                                        Sentencia de codigo:
linea de codigo delimitada por el punto y coma, indica una accion o instruccion directa. 
Como los condicionales, sin embargo, me abre un bloque de codigo.
   
                                                            Bloque de codigo:
conjunto de sentencias de codigo que se ejecutan de manera secuencial delimitada por las llaves, una funcion puede ser considerado como un bloque

                                                            Condicionales:
solo pueden ser verdaderas o falsas (<, >, <=, >=, =, ==, !=).

-simples:una sola comparacion
-compuestas:conjunto de comparaciones(solo puedo comparar 2 variables a la vez)
TIPOS:
if else o else if-si es verdadero se ejecuta una sentencia de lo contrario la otra sentencia (if else para una, si son varias else if) else if es usado 
cuando se trabaja con rangos

IMPORTANTE
->  x=y asignacion
->  x==y comparacion de los valores
*/

#include <iostream> //entrada salida de datos
#include <string>   //Imprimir textos
#include <stdio.h> //funciones matematicas

using namespace std;

int main()
{
    cout<<"Primera forma de condicional"<<endl;
    //inicio del Bloque de codigo
    if(3<5)//se ejecuta porque y solo porque es verdadero, solo le interesa el resultado(verdadero o falso)
        cout<<"Bloque verdadero"<<endl;
    else//si no es verdadero automaticamente es falso y salta directamente a esta sentencia
        cout<<"Bloque falso"<<endl;
    //fin del Bloque de codigo
    
    //inicio del Bloque de codigo
    int valorAComparar=10;
    if(valorAComparar<2)
        cout<<"Bloque 1"<<endl;
    else if(valorAComparar>5)
        cout<<"Bloque 2"<<endl;
    else if(valorAComparar<100)
        cout<<"Bloque 3"<<endl;
    else 
        cout<<"Bloque 4"<<endl;
    //fin del Bloque de codigo
    
    return 0;
}
