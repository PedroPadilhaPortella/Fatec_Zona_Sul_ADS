#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <string.h>

using namespace std;

void menu(){
    cout << "********************************" << endl;
    cout << "*      CONVERSOR MONETARIO     *" << endl;
    cout << "********************************" << endl;
    cout << "********** 1 |  Executar *******" << endl;
    cout << "******** 2 |    Sair   *********" << endl;
    cout << "********************************" << endl;

}

double ConverterValorMonetario(double cotacaoMoeda, double valorMoeda){
  double conversaoMoeda;
  conversaoMoeda = cotacaoMoeda * valorMoeda;
  return conversaoMoeda;
}

int main() {
	setlocale(LC_ALL, "Portuguese");
	double cotacaoBase, valorASerConvertido, valorConvertido;
	int tecla, option;
	char moeda01[8], moeda02[8];

  	MENU:
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
        		goto OUT;
        		break;
    		default:
    			cout << "Opção inválida!!" << endl << endl;
        		goto MENU;
		}

  	A:
  		cout << "| DOLAR -> REAL | [1]\n | EURO -> REAL |[2]\n| REAL -> DOLAR |[3]\n| REAL -> EURO |[4]\n|DOLAR -> EURO |[5]\n| EURO -> DOLAR |[6]";
  		cout << "\n \nConversions Values based on may/30/2020";
  		cout << "Escolha uma Conversão Monetária: ";
  		cin >> option;
  		cout << "Digite o Valor Monetario a Ser Convertida: $ ";
  		cin >> valorASerConvertido;
  	
  		switch (option) {
  			case 1:
  				cotacaoBase = 0.19;
  				strcpy( moeda01, "dolar");
  				strcpy( moeda02, "real");
  				break;
  			case 2:
  				cotacaoBase = 0.17;
  				strcpy( moeda01, "euro");
  				strcpy( moeda02, "real");
  				break;
  			case 3:
  				cotacaoBase = 5.33;
  				strcpy( moeda01, "real");
  				strcpy( moeda02, "dolar");
  				break;
			case 4:
				cotacaoBase = 5.92;
				strcpy( moeda01, "real");
  				strcpy( moeda02, "euro");
				  break;
			case 5:
				cotacaoBase = 0.9;
				strcpy( moeda01, "dolar");
  				strcpy( moeda02, "euro");
  				break;
			case 6:
				cotacaoBase = 1.11;
				strcpy( moeda01, "euro");
  				strcpy( moeda02, "dolar");
  				break;
  			default:
  				cout << "Conversão Inváilda, Por favor insira uma conversão Válida!!";
		}	
		valorConvertido = ConverterValorMonetario(cotacaoBase, valorASerConvertido);
		cout << endl << "$" << valorASerConvertido << " em "<< moeda01 <<" vale R$ " << valorConvertido << " em "<< moeda02 << endl  << endl;

	goto MENU;
	OUT:
	return 0;
}


