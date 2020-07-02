#include "iostream"
#include "string.h"
using namespace std;

double cont = 0, salario, salariomaior, salariomenor; 
double media = 0, saldo = 0;

void salarios();
void mostrar();

int main() 
{ 
   setlocale(LC_ALL, "Portuguese");

   int tecla = 0;

    while ( tecla != 3 )
    { 
      system("cls");
      
      cout << "\n**menu**\n1 Ler\n2 Mostrar\n3 sair\nitem:";
      cin >> tecla;
      
      switch ( tecla )
      { 
        case 1: salarios(); 
                break;

        case 2: mostrar();
                break;

        case 3: cout << "\nPrograma finalizado!";
                exit(0); 
                break;
      } 
    }         
}

void salarios ()  
{
	cout << "\nSalário " << cont + 1 << ":";
	cin >> salario;  
	cont ++;  // cont = cont + 1

	saldo += salario; // somatório dos salarios
	media = saldo / cont;
 
	if ( cont == 1 ){ 
     salariomenor = salario;  
     salariomaior = salario; 
    }
 
	if ( salario < salariomenor ) 
        salariomenor = salario;
 
	if ( salario > salariomaior )  
        salariomaior = salario;
}


void mostrar() 
{
 cout << "\nSalário Menor:" << salariomenor << " |\nSalário Maior:" << salariomaior << "\n|Média:" << media << "|\nSaldo :"<< saldo << endl; 
 system("pause");
 
}
