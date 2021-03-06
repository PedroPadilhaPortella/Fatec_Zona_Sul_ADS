package models;

public class Produto
{
	private int id;
    private String nome;
    private String preco;
    private String quantidade;
    
	public Produto(int id) { this.id = id; }

	public Produto(String nome, String preco, String quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(int id, String nome, String preco, String quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [ id =" + id + ", nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade + " ]";
	}
	
	
	
	
    
    
}
