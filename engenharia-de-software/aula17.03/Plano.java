public class Plano
{
    private String nome;
    private double custoMinimo;
    private double creditoInicial;
    private Operadora operadora;


    public Plano(String nome, double custoMinimo, double creditoInicial) {
        this.nome = nome;
        this.custoMinimo = custoMinimo;
        this.creditoInicial = creditoInicial;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoMinimo() {
        return this.custoMinimo;
    }

    public void setCustoMinimo(double custoMinimo) {
        this.custoMinimo = custoMinimo;
    }

    public double getCreditoInicial() {
        return this.creditoInicial;
    }

    public void setCreditoInicial(double creditoInicial) {
        this.creditoInicial = creditoInicial;
    }

    public Operadora getOperadora() {
        return this.operadora;
    }
    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }
}