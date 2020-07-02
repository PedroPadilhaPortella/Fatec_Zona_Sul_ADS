#include "iostream"
#include "string.h"
using namespace std;
 
int contZeros( string texto );
 
int main ( ) 
{
 int zeros = contZeros ("g0100e"); // chama a função contzeros
 
 cout << "\nQuantidade de zeros:"<< zeros << endl; return 0; 
}
 
int contZeros( string texto )
{ 
 int cont = 0, contzeros = 0; string caracter;
 
 int totLetras = texto.length();// contar caracteres inclusive espacos
 
 cout << "\ntexto" ;
 cout << "|cont ";
 cout << "|contzeros";
 cout << "|totLetras";
 cout << "|caracter "<< "|";
 
while ( cont <= totLetras )
{
 cout << "\n(" << cont <<") " << texto ;
 cout << " | " << cont;
 cout << " | " << contzeros;
 cout << " | " << totLetras;
 cout << " | " << caracter << "|";
 
 caracter = texto.substr( cont , 1 ); // pega um carácter
 
 if ( caracter == "0") 
 { 
 contzeros ++; // contzeros = contzeros + 1
 }
 
 cont ++; // cont = cont + 1
}//fim while
 
return contzeros; 
 
} // fim contzeros
