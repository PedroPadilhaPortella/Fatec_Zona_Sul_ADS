#include <cstdlib>
#include <string>
#include <iostream>
using namespace std;

#include "Carro.h"
/*class Carro{
	private:
		string marca;
		int ano;
		
	public:
		void setMarca(string marca){
			this->marca = marca;
		};
		
		string getMarca(){
			return this->marca;
		};
		
		void setAno(int ano){
			if(ano > 1886){
				this->ano = ano;
			}else{
				this->ano = 1886;
			}
		};
		
		int getAno(){
			return this->ano;
		};	
};
*/
int main (int argc, char** argv){
	
	Carro car1;
	car1.setMarca("Volvo");
	car1.setAno(2018); 

	Carro car2;
	car2.setMarca("Fiat");
	car2.setAno(1650);
	

	cout << car1.getMarca() << endl;
	cout << car1.getAno() << endl;
	cout << car2.getMarca() << endl;
	cout << car2.getAno() << endl;
	return 0;
}
