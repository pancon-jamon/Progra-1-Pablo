//Claudia Coello
//13 dic 2023
//Version 1.0 ciclos
/*
                                                    ciclos
Repite conjunto de acciones hasta que se cumple una condicion de salida
For: conozco la condicion de salida y de entrada
while:mas usado para tratar con boleanos, mientras esta sea verdadera 
Do while:primero hace, almenos se ejecuta una vez, el bloque de codigo y despues comprueba la condicion de salida 

*/

#include <iostream>
#include <string>
#include <stdio.h>

using namespace std;

int main()
{
    //Imprimir 100 veces mi nombre
   for(int contador=0; contador<=100; contador++)//contador++ es igual a contador=contador+1 y contador+=
   {
       cout<<contador+1<<" vez repetida.- "<<contador;
        if(contador==0)
            cout<<" El contador es 0, no es par ni impar"<<endl;
        else
        {
            if(contador%2)//si tiene residuo si quisiera que no tuviera residuo (contador%2)==0
                cout<<" Es impar"<<endl;
        
            else
                cout<<" Es par"<<endl;
        }
       
   }

    return 0;
}
