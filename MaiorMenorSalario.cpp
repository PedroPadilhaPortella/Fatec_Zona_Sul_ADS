#include "iostream"
#include "string.h"
using namespace std;

double cont = 0, salario, salariomaiorM, salariomenorM, salariomaiorF, salariomenorF; 
double media = 0, saldo = 0;
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
	

	saldo += salario; // somatório dos salarios
	media = saldo / cont;
	
 	if(sexo == 'M' || sexo == 'm'){
		salarioMasc();
	}else if(sexo == 'F' || sexo == 'f'){
		salarioFemin();
	}else{
		cout << "\nSexo Inválido!";
		goto Sexo;
	}
}

void salarioMasc(){
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
 cout << "\n|MASCULINO|\n|Maior Salario:" << salariomaiorM << " \n|Menor Salario:" << salariomenorM << "\n|Média:" << media << endl;
 cout << "#################";
 cout << "\n|FEMININO|\n|Maior Salario:" << salariomaiorF << " \n|Menor Salário:" << salariomenorF << "\n|Média:" << media <<  endl;
 cout << "---------------\nSaldo:" << saldo << endl;
 system("pause");
}
