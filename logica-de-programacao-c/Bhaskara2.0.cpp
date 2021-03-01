#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <iomanip>
using namespace std;

/* Quadro resumo de funções ou Declarações de funções/subrotinas */
  double ler_A ( );
  double ler_B ( );
  double ler_C ( );
  double cal_Delta ( double a, double b, double c);
  double cal_x1 ( double a, double b, double delta );
  double cal_x2 ( double a, double b, double delta );
  void exibir ( double a, double b, double c, double delta );
/* Quadro resumo de funções ou Declarações de funções/subrotinas */

int main () 
{ 
  setlocale(LC_ALL, "Portuguese");
  double a, b, c, delta; int tecla;

MENU: /* marca um ponto no código para retornar aqui depois */
system("cls");
cout << "\nCALCULADORA DE BASKHARA\n=======================\n1 Executar [1]\n2 Finalizar[2]\n__"; 
cin >> tecla;

switch ( tecla )
{  
   case 1: a = ler_A ( );
           b = ler_B ( );
           c = ler_C ( );
           if ( a == 0 ) 
           { 
             cout << "\nErro!'A' deve ser diferente de zero!";
             system("sleep 3"); 
             exit(0); 
            }

          else 
            { 
              delta = cal_Delta ( a, b, c );
              exibir ( a, b, c, delta );
            } 
            break;


case 2: cout << "\nO programa será finalizado!"; 
        system ("sleep 3"); 
        exit ( 0 ); 
        break;
}
goto MENU; /* executa novamente a partir do ponto marcado */
return 0; } 



double ler_A ( ) 
{ 
  double va; 
  cout << "\nValor de A:";
  cin >> va;
  return va; 
}

double ler_B ( ) 
{ 
  double vb; 
  cout << "Valor de B:";
  cin >> vb;
  return vb;
}

double ler_C ( ) 
{ 
  double vc; 
  cout << "Valor de C:";
  cin >> vc;
  return vc; 
}

double cal_Delta ( double a, double b, double c) 
{
   double d = pow(b,2) - 4 * a * c;
   return d; 
}

double cal_x1 ( double a, double b, double delta ) 
{
   double x = (-b + sqrt(delta))/(2*a);
   return x; 
}

double cal_x2 ( double a, double b, double delta ) 
{
   double x = (-b - sqrt(delta))/(2*a);
   return x; 
}



void exibir ( double a, double b, double c, double delta )
{
 cout << " " << setfill('=') << setw(27) <<  " " << endl;
 cout << "\n=Valor de A:" << a;
 cout << "\n=Valor de B:" << b;
 cout << "\n=Valor de C:" << c;
 cout << "\n=Valor do Delta:" << delta << "\n";
 cout << " " << setfill('=') << setw(27) <<  " " << endl;

if ( delta > 0 )
 { 
   double x1 = cal_x1 ( a , b , delta);
   double x2 = cal_x2( a , b , delta);
   
   cout << "\nValor de X1:" << x1;
   cout << "\nValor de X2:" << x2 << endl;
   cout << " " << setfill('=') << setw(27) <<  " " << endl;
  }
else if( delta == 0)
{
	double xValue = cal_x1 ( a , b , delta );
	cout << "\nSó há um Valor de X";
	cout << "\nValor de X:" << xValue;	
	cout << " " << setfill('=') << setw(27) <<  " " << endl;
}
{ 
  cout << "\nImpossível calcular x1 e x2\nDelta é Negativo!\n";
  cout << " " << setfill('=') << setw(27) <<  " " << endl;
}
system("pause"); }


