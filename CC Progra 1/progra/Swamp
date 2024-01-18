/******************************************************************************
Autor: Claudia Coello
Tema:Swamp de dos maneras

*******************************************************************************/

#include <iostream>
#include <string>
#include <cstdlib>
#include <cmath>
#include <bits/stdc++.h>
using namespace std;
/*
    Funcion para intercambiar las posiciones
    Necesita los punteros a las variables a cambiar
*/
void swapValor(int *a,int *b){
    int temp = *a;//Esta variable es temporal y debe ser del mismo tipo del dato
    *a = *b;
    *b = temp;
}

int main()
{
    int x=5, y=7;
    int *pntr1=&x, *pntr2=&y;
    cout<<"Valores iniciales: x="<<x<<" y="<<y<<endl;
    swapValor(pntr1, pntr2);
    cout<<"Valores finales: x="<<x<<" y="<<y<<endl;
    
    //Con el comando swap
    
    int a=5; 
    int b=7;
    
    cout<<"Valores iniciales con swap: a="<<a;
    cout<<" b="<<b<<endl;
    
    swap(a, b);
    
    cout<<"Valores finales con swap: a="<<a;
    cout<<" b="<<b<<endl;
    return 0;
}
/*
    Aumentar la funcion al trabajo en grupo la suma de los arreglos
    Deber: 
   
    Realice una funcione que retorne un entero en la cual se le asigne como parametro un puntero de un arreglo y retorne la suma de los Valores
    Realice lo siguiente en el main: dado un arreglo de 10 elementos determine el mayor del valor arreglo e intentarlo como funcion 
*/
