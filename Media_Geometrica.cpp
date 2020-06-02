#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <iomanip>

using namespace std;

//setw() = funcao c++ para dar espaçamentos
//setfill() = preenchimento de espaços com um paractere ou conjunto de caracteres especificos
//setprecision() = determinação das precisão casas decimais 
//setbase() = converte o 'cout <<' para uma base comum, podendo ser octal(8), decimal(10) ou hexadecimal(16)

double valor01, valor02, valor03, resultado;

//inicialização das funções
void MenuDeControle();
double lerPrimeiroValor();
double lerSegundoValor();
double lerTerceiroValor();
double CalcularMedia(double n1, double n2, double n3);
void ExibirResultado();

void MenuDeControle(){
    cout << " " << setfill('=') << setw(27) <<  " " << endl;
    cout << "|      Média Geométrica    |" << endl;
    cout << "|" << setfill('_') << setw(27) <<  "|" << endl;
    cout << "|                          |" << endl;
    cout << "| 1 |  Ler valores         |" << endl;
    cout << "| 2 |  Calcular média      |" << endl;
    cout << "| 3 |  Exibir Resultado    |" << endl;
    cout << "| 4 |  Sair                |" << endl;
    cout << "|" << setfill('_') << setw(27) <<  "|" << endl;
}

int main() {
  setlocale(LC_ALL, "Portuguese");
  int tecla;
//Menu de controle
  MENU:
  MenuDeControle();
  cout << "\nDigite a opção desejada: ";
  cin >> tecla;

  switch (tecla){
      case 1:
          cout << endl;
          valor01 = lerPrimeiroValor();
          valor02 = lerSegundoValor();
          valor03 = lerTerceiroValor();
          system("cls");
          goto MENU;
          break;
      case 2:
          resultado = CalcularMedia (valor01, valor02, valor03);
          system("cls");
          goto MENU;
          break;
      case 3:
          ExibirResultado();
          system("cls");
          goto MENU;
          break;
      case 4:
          goto OUT;
          break;
      default:
          cout << "Opção inválida!!" << endl << endl;
          system("pause");
          system("cls");
          goto MENU;
  }

OUT:
  cout << endl;
  system("cls");
  return 0;
}


double lerPrimeiroValor(){
double a;
  cout << "Digite o primeiro número: ";
  cin >> a;
  return a;
}

double lerSegundoValor(){
double b;
  cout << "Digite o segundo número: ";
  cin >> b;
  return b;
}

double lerTerceiroValor(){
double c;
  cout << "Digite o terceiro número: ";
  cin >> c;
  return c;
}

//Função de calcular média geométrica
double CalcularMedia(double n1, double n2, double n3){
  double result;
  result = cbrt((n1 * n2 * n3));
  cout << "Média Geométrica Calculada Com Sucesso!!"<<endl;
  system("pause");
  return result;
}

//Função void para exibir tudo na tela
void ExibirResultado()  {
  cout << endl << "Primeiro valor: " << valor01;
  cout << endl << "Segundo valor: " << valor02;
  cout << endl << "Terceiro valor:" << valor03 << endl;
  cout << endl << "média Geométrica " << setprecision(4) << resultado << endl  << endl;
  cout << "Se desejar fazer uma nova consulta, pressione 1\n\n";
  system("pause");
  }  
