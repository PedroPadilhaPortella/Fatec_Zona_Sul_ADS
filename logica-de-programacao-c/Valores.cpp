#include <iostream>
#include <string>
#include <locale.h>
#include <cstdlib>
#include <math.h>
#include <iomanip>

using namespace std;

void menu();
float lerA();
float lerB();
float lerC();
float cal_S(float a, float b, float c);
float cal_AH(float a, float b, float c, float s);
void exibir(float a, float b, float c, float s, float ah);

void menu(){
	cout << "************************" << endl;
    cout << "*      ATIVIDADE 2    *" << endl;
    cout << "************************" << endl;
    cout << "1 - Ler 3 Valores" << endl;
    cout << "2 - Calcular os Valores" << endl;
    cout << "3 - Exibir os Valores"<< endl;
    cout << "4 - Sair do Programa" << endl;
    cout << "Escolha uma opcao:\n__";
}

int main() {
    int tecla = 0;
    float a, b, c, s, ah;

    MENU:
    system("cls");
	menu();
    cin >> tecla;
    if(tecla == 1) {
        a = lerA();
        b = lerB();
        c = lerC();
        cout << "Valores Lidos com sucesso!!\nPressione ENTER apra voltar a tela inicial\n\n";
        system("pause");
        goto MENU;
    } else if(tecla == 2) {
        s = cal_S(a, b, c);
        ah = cal_AH(a, b, c, s);
            cout << "Calculos executados\nPressione ENTER apra voltar a tela inicial\n\n" << endl;
    	system("pause");
        goto MENU;
    } else if(tecla == 3) {
        exibir(a, b, c, s, ah);
        cout << "\nPressione ENTER apra voltar a tela inicial\n\n";
		system("pause");
        goto MENU;
    } else {
        cout << "Encerrando o programa... ...\n\n" << endl;
        system("pause");
        exit(0);
    }
}

// Ler o valor de A
float lerA() {
    float a;
    cout << "Digite o valor de A ";
    cin >> a;
    return a;
}

// Ler o valor de B
float lerB() {
    float b;
    cout << "Digite o valor de B ";
    cin >> b;
    return b;
}

// Ler o valor de C
float lerC() {
    float c;
    cout << "Digite o valor de C ";
    cin >> c;
    return c;
}

// Cálculo S
float cal_S(float a, float b, float c) {
    return (a + b + c) / 2;
}

// Cálculo AH
float cal_AH(float a, float b, float c, float s) {
    return pow(s * (s - a) * (s - b) * (s - c) , 2);

}

// Exibir
void exibir(float a, float b, float c, float s, float ah) {
    cout << "O valor de A e: " << a << endl;
    cout << "O valor de B e: " << b << endl;
    cout << "O valor de C e: " << c << endl;
    cout << "O valor de S e: " << s << endl;
    cout << "O valor de AH e: " << ah << endl;
}
