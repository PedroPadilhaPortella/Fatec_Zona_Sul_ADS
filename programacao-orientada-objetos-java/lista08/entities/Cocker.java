package entities;

public class Cocker extends Cachorro
{
    public boolean tosa;

    public Cocker (String nome, String raca, String tipo, String cor) {
        super(nome, raca, tipo, cor);
        this.tosa = false;
    }

    public boolean precisaTosa() {
        return this.tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return this.nome + " é um Cachorro do tipo Animal, da raça Cocker e da cor " + 
        this.cor  + " e ele precisa de tosa? " + this.tosa;
    }
}