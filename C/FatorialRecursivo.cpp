#include <stdio.h>
#include <stdlib.h>

void menu () {
	printf("===================\n   FATORIAL  \n\n===================\n");
}

int main () {
	void menu();
	int fatorial(int x);
	int numero, resultado;
	menu();
	printf("Digite um Numero Inteiro: ");
	scanf("%i", &numero);
	resultado = fatorial(numero);
	printf("\nO fatorial de %i e igual a %i", numero, resultado);

	getchar();
	return 0;
}

int fatorial(int x){
	int resultado;
	if(x == 0){
		resultado = 1;
	}else{
		resultado = x * fatorial(x-1);
	}
	return resultado;
}
