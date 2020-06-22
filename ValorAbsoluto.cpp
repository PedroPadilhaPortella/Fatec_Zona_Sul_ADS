#include <stdio.h>

int main(){
	float somaAbsoluta(float n1, float n2);
	float a, b, soma;
	printf("Digite 2 numeros para Calculara Soma Absoluta:\n");
	scanf("%f", &a);
	scanf("%f", &b);
	soma = somaAbsoluta(a, b);
	printf("A Soma Absoluta e %.2f", soma);
}

float somaAbsoluta(float n1, float n2){
	float valorAbsoluto(float x);
	if(n1 < 0){
		n1 = valorAbsoluto(n1);
	}
	if(n2 < 0){
		n2 = valorAbsoluto(n2);
	}
	return n1 + n2;
}

float valorAbsoluto(float x){
	return x * (-1);
}
