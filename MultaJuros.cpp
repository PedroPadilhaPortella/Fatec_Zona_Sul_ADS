#include"iostream"
#include"cstdlib"
#include <iomanip>
using namespace std;

/* Quadro resumo de funções/subrotinas */
double getPrestacao();
double getDias();
double setMulta(double valor);
double setJuros(double valor, double dias);
double setValueToPay(double valor, double multa, double juros);
void show(double valor, double dias, double multa, double juros, double total );


int main ( ) {
  setlocale(LC_ALL, "Portuguese");
  double valor, dias, multa, juros, total;
  int tecla = 0;

  while (tecla != 4) {
    system("cls");
    cout << "\n=========Multa a Juros Simples===============\n1)Inserir Valores da prestacao\n2)Calcular Multa\n3)Exibir Valores\n4)Sair\n__";
    cin >> tecla;

    if (tecla == 1 ){
      valor = getPrestacao();
      dias = getDias();
      system("pause");
    }else if (tecla ==2 ) {
      multa = setMulta(valor);
      juros = setJuros(valor, dias);
      total = setValueToPay(valor, multa, juros);      
      cout << "\nCálculo bem sucedido!" << endl;
      system("pause");
    }else if (tecla ==3 ) {
      show(valor, dias, multa, juros, total);
      system("pause");
	}
  }
  
cout << "\nPrograma finalizado!\n";
system("pause");
return 0;
}

double getPrestacao(){
  double valor;
  cout << "\nValor da Prestação: ";
  cin >> valor;
  return valor;
}

double getDias(){
  double dias;
  cout << "\nQuantidade de dias em atraso: ";
  cin >> dias;
  return dias;
}
  
double setMulta(double valor) {
  double multa;
  multa = valor * 0.02;
  return multa;
}

double setJuros(double valor, double dias) {
  double juros;
  juros = dias*((valor * 0.01)/30);
  return juros;
}

double setValueToPay(double valor, double multa, double juros) {
  double total;
  total = valor + multa + juros;
  return total;
}
    
void show(double valor, double dias, double multa, double juros, double vlpagar ) {
    system("cls");    
    cout << "\nValor da Prestação: " << setfill(' ') << setw(9)<< valor;
    cout << "\nQuantidade de dias: " << setfill(' ') << setw(11) << dias;
    cout << "\nValor da Multa: " << setfill(' ') << setw(15) << multa;
    cout << "\nValor do Juros: " << setfill(' ') << setw(15) << juros << endl;cout << "\nValor Total: " << setfill(' ') << setw(18) << vlpagar << endl;    
}
