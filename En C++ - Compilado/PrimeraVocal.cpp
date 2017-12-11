#include <iostream>
#include <string>
using namespace std;

int main() {
    string palabra;
    cout << "Ingrese la palabra a evaluar: ";
    getline(cin >> ws, palabra);

    for(int id = 0; id < palabra.length(); id++) {
        if(palabra[id] == 'a' || palabra[id] == 'A') {
            cout << "La primera vocal es: " << palabra[id] << endl;
            break;
        } else if(palabra[id] == 'e' || palabra[id] == 'E') {
            cout << "La primera vocal es: " << palabra[id] << endl;
            break;
        } else if(palabra[id] == 'i' || palabra[id] == 'I') {
            cout << "La primera vocal es: " << palabra[id] << endl;
            break;
        } else if(palabra[id] == 'o' || palabra[id] == 'O') {
            cout << "La primera vocal es: " << palabra[id] << endl;
            break;
        } else if(palabra[id] == 'u' || palabra[id] == 'U') {
            cout << "La primera vocal es: " << palabra[id] << endl;
            break;
        } else if(palabra.length() == id) {
            cout << "Lo sentimos, no hay vocales!" << endl;
        }
    }
    return 0;
}
