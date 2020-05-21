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
    int valores [5];
    int tecla, i;
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
           	 	exit;
            	break;
        	default:
            	cout << "Opção inválida!!" << endl << endl;
            	exit;
    	}
    	
    	CODE:
    		cout << "Insira 5 valores diferentes:\n";
    		for(i = 0; i < 5; i++){
    			cin >> valores[i];
			}
    		
    		for(i = 0; i < 5; i++){
    			cout<<valores[i]<<"\n";
			}
			
			cout<<"Deseja testar novamente? [S/N]\n";
    		cin >> again;
    		if(again == 's' || again == 'S'){
    			goto RETORNO;
			}else{
				system("pause");
			}
	
    	return 0;
}
