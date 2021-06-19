package revisaodm2021n.dados;

public class Notebook {

    private int id;
    private String nome;
    private String marca;
    private String processador;
    private String ram;
    private String preco;

    public Notebook(int id, String nome, String marca, String processador, String ram, String preco) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.processador = processador;
        this.ram = ram;
        this.preco = preco;
    }
    
    public Notebook(String nome, String marca, String processador, String ram, String preco) {
        this.nome = nome;
        this.marca = marca;
        this.processador = processador;
        this.ram = ram;
        this.preco = preco;
    }

    public Notebook(String nome) {
        this.nome = nome;
    }

    public Notebook(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Notebook{" + "id=" + id + ", nome=" + nome + ", marca=" + marca + ", processador=" + processador + ", ram=" + ram + ", preco=" + preco + '}';
    }
}
