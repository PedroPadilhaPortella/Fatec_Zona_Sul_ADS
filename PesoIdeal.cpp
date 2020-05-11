#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	setlocale(LC_ALL, "Portuguese");
	END:
		system("cls");
		char sexo;
		float altura, pesoideal;
		cout<<"Qual sua Altura? ";
		cin>>altura;
		cout<<"Qual seu Sexo? [M/F]"<<endl;
		cin>>sexo;
		if(sexo == 'M'|| sexo == 'm'){
			pesoideal = (72.7 * altura) - 58;
		}else if(sexo == 'F' || sexo == 'f'){
			pesoideal = (62.1 * altura) - 44.7;
		}else{
			cout<<"Sexo Inválido!";
			system("pause");
			goto END;
		}
		cout<<"Seu peso ideal é de "<<pesoideal<<" quilos"<<endl;
		system("pause");
		goto END;
		return 0;
}
