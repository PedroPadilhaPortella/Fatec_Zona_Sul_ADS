#ifndef CARRO_H
#define CARRO_H

#include <string>
using namespace std;

class Carro{
	private:
		string marca;
		int ano;
		
	public:
		void setMarca(string marca);
		string getMarca();
		void setAno(int ano);
		int getAno();	
};

#endif
