package entities;

public class Faturar {
    private int numeroItem;
    private String descricao;
    private int qtdComprada;
    private double valorItem;

    public Faturar(int numeroItem, String descricao, int qtdComprada, double valorItem) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        if (qtdComprada > 0) {
            this.qtdComprada = qtdComprada;
        } else {
            this.qtdComprada = 0;
        }
        if (valorItem > 0) {
            this.valorItem = valorItem;
        } else {
            this.valorItem = 0;
        }
    }

    public int getNumeroItem() {
        return this.numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return this.qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getValorItem() {
        return this.valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getFaturarTotal() {
        return this.qtdComprada * this.valorItem;
    }
}