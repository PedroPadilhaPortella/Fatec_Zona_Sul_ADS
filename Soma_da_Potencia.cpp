#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <stdio.h>
#include <iostream>

using namespace std;

int calcularSomaDaPotencia (int valor1, int valor2, int valor3){
  int resultado = (pow(valor1, 2) + pow(valor2, 2) + pow(valor3, 2));
  return resultado;
}
int main() {
  setlocale(LC_ALL, "Portuguese");
  int firstValue, secondValue, thirdValue, result;
  cout << "AVISO : Insira apenas valores Inteiros!!";
  cout << "Digite o primeiro valor: ";
  cin >> firstValue;
  cout << "Digite o segundo valor: ";
  cin >> secondValue;
  cout << "Digite o terceiro valor: ";
  cin >> thirdValue;
  result = calcularSomaDaPotencia (firstValue, secondValue, thirdValue);
  cout << "O resultado da Soma da Potencia elevada a dois entre "<< firstValue <<", "<< secondValue <<" e "<< thirdValue <<" é "<<result<<"\n";
  getchar();
  return 0;
}

