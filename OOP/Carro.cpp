#include "Carro.h"

#include <string>
using namespace std;

void Carro::setMarca(string marca){
	this->marca = marca;
}

string Carro::getMarca(){
	return this->marca;
}

void Carro::setAno(int ano){
	if(ano > 1886){
		this->ano = ano;
	}else{
		this->ano = 1886;
	}
}

int Carro::getAno(){
	return this->ano;
}
