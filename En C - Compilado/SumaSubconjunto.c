#include <stdio.h>
#include <stdlib.h>

void capturar(unsigned int *conjunto[], unsigned int *tam) {
    unsigned int num, sb;
    for(sb = 0; sb < *tam; sb++) {
        printf("Ingrese el valor #%d: ", sb + 1);
        scanf("%d", &num);
        (*conjunto)[sb] = num;
    }
}

void main(void) {
    unsigned int *conjunto;
    unsigned int tam, reban, sbn;
    unsigned int sbnsum1 = 0, sbnsum2 = 0;

    printf("Ingrese el numero de valores del conjunto: ");
    scanf("%d", &tam);

    printf("\n");
    conjunto = (unsigned*) malloc(tam);
    capturar(&conjunto, &tam);

    reban = tam / 2;

    for(sbn = 0; sbn < reban; sbn++) {
        sbnsum1 += conjunto[sbn];
    }

    for(sbn = reban; sbn < tam; sbn++) {
        sbnsum2 += conjunto[sbn];
    }

    printf("\n");
    if(sbnsum1 == sbnsum2) {
        printf("La suma de los subconjuntos da el mismo resultado!\n");
    } else {
        printf("La suma de los subconjuntos no da el mismo resultado!\n");
    }
    free(conjunto);
}
