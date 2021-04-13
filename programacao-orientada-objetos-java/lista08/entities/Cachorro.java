package entities;

public class Cachorro extends Animal
{
    public String nome;    
    public String raca;

    public Cachorro(String nome, String raca, String tipo, String cor) {
        super(tipo, cor);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return this.nome + " é do tipo " + this.tipo + ", da raça " + this.raca + " e da cor " + this.cor;
    }
}
