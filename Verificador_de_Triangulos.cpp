#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>
using namespace std;

void menu(){

    cout << "*******" << endl;
    cout << "*      MENU     *" << endl;
    cout << "*******" << endl;
    cout << "* 1 |  Executar *" << endl;
    cout << "* 2 |    Sair   *" << endl;
    cout << "*******" << endl;

}

int main(){
    setlocale(LC_ALL, "Portuguese");
    double A, B, C;
    int tecla;
    bool triangulo = false;
    char again;

    END:
    	system("cls");
    	menu();
    	cout << "Digite a opção desejada: ";
    	cin >> tecla;

    	switch (tecla){
     	   	case 1:
   	         	cout << endl;
      	      	goto A;
      	      	break;
      	  	case 2:
           	 	exit;
            	break;
        	default:
            	cout << "Opção inválida!!" << endl << endl;
            	exit;
    	}
    	
    	A:
    	cout << "Digite o valor do primeiro lado: ";
    	cin >> A;
    	cout << endl << "Digite o valor do segundo lado: ";
    	cin >> B;
    	cout << endl << "Digite o valor do terceiro lado: ";
    	cin >> C;
    	
    	if (A < B + C && B < A + C && C < A + B){
        	triangulo = true;
    	}else{
        	triangulo = false;
    	}

    	if (triangulo == true){
        	cout << endl << "Trata-se de um triângulo!" << endl << endl;
    	}else{
        	cout << endl << "Não pode ser um Triangulo" << endl << endl;
    	}
    	cout<<"Deseja testar novamente? [S/N]\n";
    	cin >> again;
    	if(again == 's' || again == 'S'){
    		goto END;
		}else{
			system("pause");
		}
	
    return 0;
}
