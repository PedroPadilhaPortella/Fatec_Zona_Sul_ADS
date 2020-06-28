#include"iostream"
#include"cstdlib"
#include <iomanip>
using namespace std;

/* Quadro Resumo de funções/subrotinas */
double lerBase();
double lerAltura();
double calcularArea(double base, double altura);
double calcularMedia(double saldo, double contador);
void exibir (double base, double altura, double area, double media );

int main ( ) {
  double base, altura, area, acumulado = 0, media = 0, contador= 1;
  int tecla = 0;

  while (tecla != 4) {
    system("cls");
    cout << "\n====Menu====\n\n1 Ler Valores: \n2 Calcular Area: \n3 Exibir Resultado:\n4 Sair:\n__";
    cin >> tecla;

    if (tecla == 1 ){
      base = lerBase();
      altura = lerAltura();
    }else if (tecla ==2) {
      area = calcularArea(base,altura);
      acumulado = acumulado + area;
      contador += 1;
      media = calcularMedia(acumulado, contador);
      cout << "\nCalculo Concluido!" << endl;
      system("pause");
    }else if (tecla ==3 ) {
      exibir(base, altura, area, media);
	  system("pause"); 
	}
  }
  
cout << "\nPrograma finalizado!\n";
system("pause");
return 0;
}

double lerBase(){
  double base;
  cout << "\nLer Base:";
  cin >> base;
  return base;
}

double lerAltura(){
  double altura;
  cout << "\nLer Altura:";
  cin >> altura;
  return altura;
}
  
double calcularArea(double base, double altura) {
  double area;
  area = (base * altura)/2.00;
  return area;
}

double calcularMedia(double acc, double contador) {
  double media;
  media = acc / contador;
  return media; 
}
    
void exibir (double base, double altura, double area, double media ) {
    system("cls");
    cout << setprecision(2) << "\nValor Ultima Base: " << setfill(' ') << setw(7)<< base;
    cout << "\nValor Ultima Altura: " << setfill(' ') << setw(7) << altura;
    cout << "\nVlor Ultima Area: " << setfill(' ') << setw(7) << area;
    cout << "\nMedia: " << setfill(' ') << setw(15) << media << endl;
}
