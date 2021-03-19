public class Pessoa
{
	private String nome;
	private String celular;

    public Pessoa(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}