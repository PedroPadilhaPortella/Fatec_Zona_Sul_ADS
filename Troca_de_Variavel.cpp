#include <iostream>
#include <cstdlib>
using namespace std;

void menu(){
	
    cout << "*******" << endl;
    cout << "*      MULTIPLOS DE 2 E 4     *" << endl;
    cout << "*******" << endl;
    cout << "* 1 |  Executar *" << endl;
    cout << "* 2 |    Sair   *" << endl;
    cout << "*******" << endl;
}

int main(void){
	setlocale(LC_ALL, "Portuguese");
	
    int tecla, x, y, z;
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
            	cout << "Opção inválida!!" << endl << endl;
            	goto EXIT;
    	}
    	
    	CODE:
    		cout << "Insira 2 valores diferentes, que serão mostrados trocados:\n";
    		cout<< "X = ";
    		cin >> x;
    		cout<< "Y = ";
    		cin >> y;
    		z = x;
    		x = y;
    		y = z;
    		cout << "X = "<<x<< " e Y = "<<y<<"\n"; 
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
