package revisaodm2021n.dados;

public class Tenis {

    private int id;
    private String marca;
    private String tamanho;
    private String cor;
    private String origem;
    private String preco;

    public Tenis(int id, String marca, String tamanho, String cor, String origem, String preco) {
        this.id = id;
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.origem = origem;
        this.preco = preco;
    }

    public Tenis(String marca, String tamanho, String cor, String origem, String preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.origem = origem;
        this.preco = preco;
    }

    public Tenis(String marca) {
        this.marca = marca;
    }

    public Tenis(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Tenis{" + "id=" + id + ", marca=" + marca + ", tamanho=" + tamanho + ", cor=" + cor + ", origem=" + origem + ", preco=" + preco + '}';
    }
}
