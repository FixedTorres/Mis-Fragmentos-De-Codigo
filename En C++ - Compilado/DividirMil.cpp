#include <iostream>
using namespace std;

int main() {
    long numero;
    cout << "Ingrese un numero: ";
    cin >> numero;

    for(long d = 1; d < 1000; d++) {
        cout << numero / d << " - ";
    }
    cout << "\n";
    return 0;
}
