#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>

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
  system("cls");
  double cotacaoBase, valorASerConvertido;
  int tecla;
  char option [], moeda01 [], moeda02 [];

  MENU:
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
  	cout << "| DOLAR -> REAL | [DR]\n | EURO -> REAL |[ER]\n| REAL -> DOLAR |[RD]\n| REAL -> EURO |[RE]\n|DOLAR -> EURO |[DE]\n| EURO -> DOLAR |[ED]";
  	cout << "\n \nConversions Values based on may/30/2020"
  	cout << "Escolha uma Conversão Monetária: ";
  	cin >> option;
  	cout << "Digite o Valor Monetario a Ser Convertida: $ ";
  	cin >> valorASerConvertido;
  	
  	switch (option) {
  		case 'DR':
  			cotacaoBase = 0.19;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
  		case 'ER':
  			cotacaoBase = 0.17;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
  		case 'RD':
  			cotacaoBase = 5.33;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
		case 'RE':
			cotacaoBase = 5.92;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
		case 'DE':
			cotacaoBase = 0.9;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
		case 'ED':
			cotacaoBase = 1.11;
  			valorConvertido = ConverterValorMonetario(, valorASerConvertido);
  			break;
  		default:
  			cout << "Conversão Inváilda, Por favor insira uma conversão Válida!!";
	  }
	  
	  cout << endl << "$" << valorASerConvertido << " em "<< moeda01 <<" vale R$" << valorConvertido << moeda02 << endl  << endl;

  goto MENU;

  OUT:
  return 0;

}


