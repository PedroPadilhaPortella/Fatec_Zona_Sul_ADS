#include <iostream>
#include <stdio.h>
using namespace std;
int main(){
	setlocale(LC_ALL, "Portuguese");
	END:
		system("cls");
		int a, b, c, n;
		cout<<"Insira Três Valores?\n ";
		cin>>a>>b>>c;
		if(a > b){
			n = a;
			a = b;
			b = n;
		}
		if(a > c){
			n = a;
			a = c;
			c = n;
		}
		if(b > c){
			n = b;
			b = c;
			c = n;
		}
		cout<<"Valores em ordem Crescente:\n";
		cout<<a<<endl<<b<<endl<<c<<endl;
		system("pause");
		goto END;
		return 0;
}
