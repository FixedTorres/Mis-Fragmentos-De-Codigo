#include <stdio.h>
#include <math.h>

void main(void) {
    float potencia;

    printf("Ingrese un numero N potencia: ");
    scanf("%f", &potencia);

    printf("%.0f", pow(2, potencia));
}
