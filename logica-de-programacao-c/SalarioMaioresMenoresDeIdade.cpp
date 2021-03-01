#include "iostream"
#include "string.h"
using namespace std;

double saldo, salario1, salario2, salariomaior1, salariomenor1, salariomaior2, salariomenor2; 
double saldo2 = 0, saldo1 = 0, cont1 = 0, cont2 = 0;
int idade;

void salarios();
void mostrar();
void salarioMaiores();
void salarioMenores();

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
		  	salarios();
            break;
            
        case 2: 
			mostrar();
            break;

        case 3: 
			cout << "\nPrograma finalizado!";
            exit(0); 
            break;
      	} 
    }         
}

void salarios ()  
{
	cout << "\nIdade: ";
	cin >> idade;
	
 	if(idade < 18 && idade >= 10){
		salarioMenores();
	}else if(idade >= 18){
		salarioMaiores();
	}else{
		cout << "\n\nIdade Inválida!!";
		system("pause");
	}
}

void salarioMenores(){
	cout << "\nSalario:";
	cin >> salario1;
	saldo1 += salario1;
	cont1 ++;
	if ( cont1 == 1 ){ 
     salariomenor1 = salario1;  
     salariomaior1 = salario1; 
    }
 
	if ( salario1 < salariomenor1 ) 
        salariomenor1 = salario1;
 
	if ( salario1 > salariomaior1 )  
        salariomaior1 = salario1;
}

void salarioMaiores(){
	cout << "\nSalario:";
	cin >> salario2;
	saldo2 += salario2;
	cont2 ++;
	if ( cont2 == 1 ){ 
     salariomenor2 = salario2;  
     salariomaior2 = salario2; 
    }
 
	if ( salario2 < salariomenor2 ) 
        salariomenor2 = salario2;
 
	if ( salario2 > salariomaior2 )  
        salariomaior2 = salario2;
}

void mostrar() 
{
 cout << "\n|MENORES DE IDADE|\n|Maior Salario:" << salariomaior1 << " \n|Menor Salario:" << salariomenor1 << "\n|Total de Menores:" << cont1 << endl;
 cout << "#################";
 cout << "\n|MAIORES DE IDADE|\n|Maior Salario:" << salariomaior2 << " \n|Menor Salário:" << salariomenor2 << "\n|Total de Maiores:" << cont2 <<  endl;
 system("pause");
}
