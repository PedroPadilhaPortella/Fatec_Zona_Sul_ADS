package entities;

public class Animal
{
    public String tipo;  
    public String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "O Animal é um " + this.tipo + ", e é da cor " + this.cor;
    }
}