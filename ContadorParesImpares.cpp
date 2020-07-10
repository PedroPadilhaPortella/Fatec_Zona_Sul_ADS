#include <stdio.h>
#include <iostream>
using namespace std;

int n, TotalPares = 0, TotalImpares = 0;

void lerValores();
void somaPares();
void somaImpares();
void exibir();
void menu();

void menu(){
	cout << "=============";
	cout << "1) Ler Valores";
	cout << "2) Calcular Pares e Impares";
	cout << "3) Exibir Resultados";
	cout << "4) Sair";
	cout << "__";
}
int main() 
{ 
   setlocale(LC_ALL, "Portuguese");

   int tecla = 0;

    while ( tecla != 3 ){ 
      system("cls");
      
      cout << "\n**menu**\n1 Ler\n2 Mostrar\n3 sair\nitem:";
      cin >> tecla;
      
      switch ( tecla ){
	  	case 1:
		  	lerValores();
			somaPares();
			somaImpares(); 
            break;
            
        case 2: 
			exibir();
            break;

        case 3: 
			cout << "\nPrograma finalizado!";
            exit(0); 
            break;
      	} 
    }         
}

void lerValores(){
	cout << "\n\nInsira um valor:";
	cin >> n;
}

void somaPares(){
	if(n % 2 == 0){
		TotalPares ++;
	}
}

void somaImpares(){
	if(n % 2 != 0){
		TotalImpares ++;
	}
}

void exibir () {
	cout << "PARES: " << TotalPares << "\nIMPARES: " << TotalImpares << endl;
	system("pause");
}
