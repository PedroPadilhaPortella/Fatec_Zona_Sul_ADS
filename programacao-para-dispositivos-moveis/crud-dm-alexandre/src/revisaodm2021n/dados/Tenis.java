package revisaodm2021n.dados;

public class Tenis {

	private int id;
	private String marca;
	private int tamanho;
	private String cor;
	private double preco;
	
	public Tenis(int id, String marca, int tamanho, String cor, double preco) {
		this.id = id;
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
		this.preco = preco;
	}
	
	public Tenis(String marca, int tamanho, String cor, double preco) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
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

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Tenis [id=" + id + ", marca=" + marca + ", tamanho=" + tamanho + ", cor=" + cor + ", preco=" + preco
				+ "]";
	}
}
