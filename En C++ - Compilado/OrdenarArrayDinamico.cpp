/*  Programa que que ordena elementos de un array dinamico
*	de manor a mayor y de mayor a menor!
*
*   Autor: Fixed Torres
*   Fecha: 21/09/2016
*/
#include <iostream>
#include <new>
using namespace std;

void mayor(int valores[], int cant){
    int aux;
    for(int i = 0; i < cant; i++){
        for(int x = 0; x < cant; x++){
            if(valores[i] > valores[x]){
                aux = valores[i];
                valores[i] = valores[x];
                valores[x] = aux;
            }
        }
    }
    cout << "\nArray dinamico ordenado: ";
    for(int i = 0; i < cant; i++){
        cout << "{" << valores[i] << "} ";
    }
    cout << "Fin!" << endl;
}

void menor(int valores[], int cant){
    int aux;
    for(int i = 0; i < cant; i++){
        for(int x = 0; x < cant; x++){
            if(valores[i] < valores[x]){
                aux = valores[x];
                valores[x] = valores[i];
                valores[i] = aux;
            }
        }
    }
    cout << "\nArray dinamico ordenado: ";
    for(int i = 0; i < cant; i++){
        cout << "{" << valores[i] << "} ";
    }
    cout << "Fin!" << endl;
}

int main() {
    int *valores, cant, num, resp;

    cout << "¿Cuantos valores desea ingresar?: ";
    cin >> cant;

    valores = new int[cant];

    for(int i = 0; i < cant; i++){
        cout << "Ingrese el valor No. " << i + 1 << ": ";
        cin >> num;
        valores[i] = num;
    }

    cout << "\nSelecciones una de las siguientes opciones" << endl;
    cout << "------------------------------------------" << endl;
    cout << "1) Ordenar de mayor a menor" << endl;
    cout << "2) Ordenar de menor a mayor" << endl;
    cout << "------------------------------------------" << endl;
    cout << "Opcion: ";
    cin >> resp;

    switch(resp) {
    case 1:
        mayor(valores, cant);
        break;
    case 2:
        menor(valores, cant);
        break;
    default:
        cout << "Opcion invalida!" << endl;
    }
    
    delete[] valores;
    return 0;
}
