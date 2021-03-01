#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	setlocale(LC_ALL, "Portuguese");
	END:
		system("cls");
		int maca;
		float preco;
		cout<<"Quantas macas serao compradas: ";
		cin>>maca;
		if(maca < 12){
			preco = maca * 0.3;
		}else{
			preco = maca * 0.25;
		}
		cout<<"Preco Total: R$ "<<preco<<endl;
		getchar();
		system("pause");
		goto END;

		return 0;
}
