package entities;

public class Faturar
{
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double valorItem;

    public Faturar(int numeroItem, String descricao, int quantidade, double valorItem) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        this.quantidade = quantidade > 0? quantidade : 0;
        this.valorItem = valorItem > 0? valorItem : 0;
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

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorItem() {
        return this.valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getFaturarTotal() {
        return this.quantidade * this.valorItem;
    }

    @Override
    public String toString() {
        return "Id: "+ numeroItem + ", Descrição: "+ descricao 
        +", Valor: R$ "+ valorItem + ", Quantidade: " + quantidade;
    }
}