#include <iostream>
#include <cstdlib>
using namespace std;
void menu(){
    cout << "************************" << endl;
    cout << "*      ANO BISSEXTO    *" << endl;
    cout << "************************" << endl;
    cout << "* 1 |  Executar *" << endl;
    cout << "* 2 |    Sair   *" << endl;
    cout << "*******" << endl;
}
int main(void){
	setlocale(LC_ALL, "Portuguese");
    int tecla, ano;
    char again;
    RETORNO:
    	system("cls");
    	    	menu();
    	cout << "Digite a opção desejada: ";
    	cin >> tecla;
    	switch (tecla){
     	   	case 1:
   	         	cout << endl;
      	      	goto CODE;
      	      	break;
      	  	case 2:
           	 	goto EXIT;
            	break;
        	default:
            	cout << "Op��o inv�lida!!" << endl << endl;
            	goto EXIT;
    	}
    	CODE:
    		cout << "Descubra se um ANO e ou nao Bissexto:\n Insira um ano aqui: ";
    		cin >> ano;
    		if(ano % 4 == 0){
    			cout << "Este ano e Bissexto!\n";
			}else{
				cout << "Esse ano nao e Bissexto!\n";
			}
    		
			cout<<"Deseja testar novamente? [S/N]\n";
    		cin >> again;
    		if(again == 's' || again == 'S'){
    			goto RETORNO;
			}else{
				system("pause");
			}
		EXIT:
    		return 0;
}
