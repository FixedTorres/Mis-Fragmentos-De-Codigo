#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    string texto;
    int aux = 0, igual = 0;

    cout << "Ingrese la palabra a evaluar: ";
    getline(cin >> ws, texto);

    string reversa = texto;
    reverse(reversa.begin(), reversa.end());

    if(texto == reversa) {
        cout << "La palabra ingresada es palindromo!! :D" << endl;
    } else {
        cout << "La palabra ingresada no es palindromo!! :(" << endl;
    }

    return 0;
}
