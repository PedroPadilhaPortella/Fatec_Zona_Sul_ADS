#include <iostream>
#include <locale.h>
#include <cstdlib>
#include <math.h>

using namespace std;

int calcularQuadradoDaDiferenca (int valor1, int valor2){
  int resultado = pow((valor1 - valor2), 2);
  return resultado;
}

int main() {
  setlocale(LC_ALL, "Portuguese");
  int a, b, resultado;

  cout << "Digite o primeiro valor: ";
  cin >> b;
  cout << "Digite o segundo valor: ";
  cin >> a;
  
  resultado = calcularQuadradoDaDiferenca (a, b);

  cout << "O resultado do Quadrado da Diferença entre "<<a<<" e "<<b<<" é "<<resultado<<"\n";
  system("pause");
  return 0;
}
