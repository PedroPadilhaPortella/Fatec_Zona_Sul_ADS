#include <iostream>
#include <cstdlib>
using namespace std;

void menu(){
	
    cout << "************************" << endl;
    cout << "*  MULTIPLOS DE 2 E 4  *" << endl;
    cout << "************************" << endl;
    cout << "* 1 |  Executar *" << endl;
    cout << "* 2 |    Sair   *" << endl;
    cout << "*******" << endl;
}

int main(void){
	setlocale(LC_ALL, "Portuguese");
    int valores [5], multiplos[5];
    int tecla, i, j = 0;
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
    		cout << "Insira 5 valores diferentes:\n";
    		for(i = 0; i < 5; i++){
    			cin >> valores[i];
    			if(valores[i] % 2 == 0 && valores[i] % 4 == 0){
    				multiplos[j] = valores[i];
    				j++;
				}
			}
    		cout<< "O valores que são multiplos de 2 e 4 simultaneamente são:\n";
    		for(i = 0; i < j; i++){
    			cout<<multiplos[i]<<"\n";
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
