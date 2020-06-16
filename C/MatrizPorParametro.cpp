#include <stdio.h>

int main(){
	int matriz [3][3]={1, 2, 3, 4, 5, 6, 7, 8, 9};
	void functionMatriz(int x [3][3]);
	functionMatriz(matriz);
	getchar();
	return 0; 
}

void functionMatriz(int x [3][3]){
	int i, j;
	for(i = 0; i < 3; ++i){
		for(j = 0; j < 3; ++j){
			printf("%i", x[i][j]);
		}
		printf("\n");
	}
}
