public class Robo {

	private String nome;
	private String dataDeFabricacao;
	private int bateria;

	public Robo(String nome, String dataDeFabricacao, int bateria) {
        this.nome = nome;
        this.dataDeFabricacao = dataDeFabricacao;
        this.bateria = bateria;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
        this.nome = nome;
	}

	public String getDataDeFabricacao() {
		return this.dataDeFabricacao;
	}
    
	public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
        this.bateria = bateria;
	}

    @Override
    public String toString() {
        return "Meu nome é " + getNome() + ", fui fabricado em " + getDataDeFabricacao() 
        + ", atualmente minha bateria esta em " + getBateria() + "%.";
    }
    
}
