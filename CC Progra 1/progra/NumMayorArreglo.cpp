/******************************************************************************
    Autor: Claudia Coello
    Deber Arreglos
    Realice lo siguiente en el main: dado un arreglo de 10 elementos determine 
el mayor del valor arreglo e intentarlo como funcion 
*******************************************************************************/
#include <iostream>
#include <string>
#include <stdio.h>
#include <cmath>
#include <stdlib.h>//Esta libreria me permite usar el randomizador

using namespace std;

int* llenarArregloNuevo(int size);
void imprimirArreglos(int arregloUno[], int tamano);
int main()
{
    //Definicion de variables
    int size=0, numMayorDos=-1, primerNum = 0, numMayorUno=0, segundoNum = 0;
    
    cout<<"Ingrese un numero para el tamaÃ±o del arreglo"<<endl;
    cin>>size;
    
    int *arreglo = llenarArregloNuevo(size);
    
    cout<<"El arreglo generado aleatoriamente es ";
    imprimirArreglos(arreglo, size);
    
    for(int contUno=0; contUno<=size; contUno+=2){
        primerNum = arreglo[contUno];
        
        for(int contDos=1; contDos < size; contDos+=2){
            segundoNum = arreglo[contDos];
            
            if (primerNum>segundoNum)
                numMayorUno=primerNum;
            else if (segundoNum>primerNum)
                numMayorUno=segundoNum;
        }
        
        if(numMayorUno>numMayorDos)
            numMayorDos=numMayorUno;
    }
    cout<<"El numero mayor de ese arreglo es "<<numMayorDos;
    return 0;
}

/*
    Retorna un puntero a un arreglo lleno de manera aleatorio
    Necesita el tamano
*/
int* llenarArregloNuevo(int size){//no puedo retornar un arreglo pero si su direccion de memoria
    int* dirArreglo = new int[size];//crea un espacio de tamano especifico
    for(int posicion = 0;posicion < size;posicion++)
        dirArreglo[posicion] = rand () % 50;//apunta al valor que se encuentra en la posicion del for
    return dirArreglo;
    
}
/*
    Esta funcion imprime el arreglo
    Necesita el arreglo y el tamano
*/
void imprimirArreglos(int arregloUno[], int tamano){
    cout<<"{ ";
    for(int posicion = 0; posicion < tamano; posicion++)
        cout<< arregloUno[posicion] <<" ";
    cout << "}" << endl;
}
