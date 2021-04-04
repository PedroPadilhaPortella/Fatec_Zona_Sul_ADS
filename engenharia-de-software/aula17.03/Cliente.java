public class Cliente extends Pessoa
{
    private String cpf;
	private String cidade;

	public Cliente(String nome, String celular, String cpf, String cidade) {
        super(nome, celular);
        this.cpf = cpf;
        this.cidade = cidade;
    }

    
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}