#include "iostream"
#include "cstdlib"
#include "math.h"
#include "string"
using namespace std;

const string senhaCor = "1234";

string senhaDig; 


int main () 
{   

    setlocale(LC_ALL, "Portuguese");

	LEITURA: 
	   system("cls"); // apagar a tela
	   cout << "\nDigite a senha de acesso:";
	   getline(cin, senhaDig );
	   
	   
	if ( senhaDig != senhaCor )
	{    cout << "\nAcesso não permitido\n!";
	     system("pause");
	     goto LEITURA;
	}    
	
	else
	{
		 cout << "\nAcesso Permitido\n!";
	     system("pause");
	}

return 0;	
}