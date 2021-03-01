#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "Portuguese");
	END:
		system("cls");
		float delta, x1, x2;
		int a, b, c;
		char again;
		
		cout<<"Insira os valores de A, B, C da funçao quadratica:\n ";
		cin>>a;
		cin>>b;
		cin>>c;
		if(a == 0){
			cout<<"Valor de A inválido, Insira outro valor!\n";
			system("pause");
			goto END;
		}
		delta = pow(b, 2) - (4 * a * c);
		cout<<"O valor de Delta é "<<delta<<endl;
		if(delta > 0){
			 x1 = ((b * (-1)) + sqrt(delta)) / (2 * a);
			 x2 = ((b * (-1)) - sqrt(delta)) / (2 * a);
			 cout<<"As raizes dessa funcao sao "<<x1<<" e "<<x2<<endl;			 
		}else if(delta < 0){
			cout<<"Não existem raizes reais para essa função!!\n";
		}else{
			 x1 = ((b * (-1)) + sqrt(delta))/ (2 * a);
			 cout<<"A raiz desa funcao e "<<x1<<endl;
		}
		cout<<"Deseja calcular outra Funcao?? [S/N] \n";
		cin>>again;
		if(again == 'S' || again == 's'){
			goto END;
		}else{
			exit;
		}

		return 0;
}
