#include "iostream"
#include "string.h"
using namespace std;

double saldo, salario, salariomaiorM, salariomenorM, salariomaiorF, salariomenorF; 
double mediaM = 0, mediaF = 0, saldoM = 0, saldoF = 0, contM = 0, contF = 0, cont = 0;
char sexo;

void salarios();
void mostrar();
void salarioMasc();
void salarioFemin();

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
	cout << "\nSalário " << cont + 1 << ":";
	cin >> salario;  
	cont ++;  // cont = cont + 1
	Sexo:
	cout << "\nSexo [M/F]: ";
	cin >> sexo;
	
 	if(sexo == 'M' || sexo == 'm'){
		salarioMasc();
	}else if(sexo == 'F' || sexo == 'f'){
		salarioFemin();
	}else{
		cout << "\n\nSexo Inválido! Por favor, Insira o Sexo novamente!";
		system("pause");
		system("cls");
		goto Sexo;
	}
}

void salarioMasc(){
	saldoM += salario;
	contM ++;
	mediaM =  saldoM / contM; 
	if ( cont == 1 ){ 
     salariomenorM = salario;  
     salariomaiorM = salario; 
    }
 
	if ( salario < salariomenorF ) 
        salariomenorM = salario;
 
	if ( salario > salariomaiorM )  
        salariomaiorM = salario;
}

void salarioFemin(){
	saldoF += salario;
	contF ++;
	mediaF = saldoF / contF;
	if ( cont == 1 ){ 
     salariomenorF = salario;  
     salariomaiorF = salario; 
    }
 
	if ( salario < salariomenorF ) 
        salariomenorF = salario;
 
	if ( salario > salariomaiorF )  
        salariomaiorF = salario;
}
void mostrar() 
{
 cout << "\n|MASCULINO|\n|Maior Salario:" << salariomaiorM << " \n|Menor Salario:" << salariomenorM << "\n|Média:" << mediaM << endl;
 cout << "#################";
 cout << "\n|FEMININO|\n|Maior Salario:" << salariomaiorF << " \n|Menor Salário:" << salariomenorF << "\n|Média:" << mediaF <<  endl;
 cout << "---------------\nSaldo Masculino:" << saldoM << "\nSaldo Feminino:" << saldoF << endl;
 system("pause");
}
