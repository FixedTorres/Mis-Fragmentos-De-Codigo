#include <iostream>
#include <new>
using namespace std;

void capturar(unsigned int *conjunto[], unsigned int &tam) {
    unsigned int num, sb;
    for(sb = 0; sb < tam; sb++) {
        cout << "Ingrese el valor #" << sb + 1 << ": ";
        cin >> num;
        (*conjunto)[sb] = num;
    }
}

int main() {
    unsigned int *conjunto;
    unsigned int tam, reban, sbn;
    unsigned int sbnsum1 = 0, sbnsum2 = 0;

    cout << "Ingrese el numero de valores del conjunto: ";
    cin >> tam;

    cout << "\n";
    conjunto = new unsigned int[tam];
    capturar(&conjunto, tam);

    reban = tam / 2;

    for(sbn = 0; sbn < reban; sbn++) {
        sbnsum1 += conjunto[sbn];
    }

    for(sbn = reban; sbn < tam; sbn++) {
        sbnsum2 += conjunto[sbn];
    }

    cout << "\n";
    if(sbnsum1 == sbnsum2) {
        cout << "La suma de los subconjuntos da el mismo resultado!" << endl;
    } else {
        cout << "La suma de los subconjuntos no da el mismo resultado!" << endl;
    }

    delete[] conjunto;
    return 0;
}
