package revisaodm2021n.dados;

public class Livro {

	private int id;
	private String titulo;
	private String autor;
	private String editora;
	private String genero;
	private double preco;
	
	
	
	public Livro(int id, String titulo, String autor, String editora, String genero, double preco) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;
		this.preco = preco;
	}
	
	public Livro(String titulo, String autor, String editora, String genero, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.genero = genero;
		this.preco = preco;
	}
	
	public Livro(String titulo) {
        this.titulo = titulo;
    }
	
	public Livro(int id) {
        this.id = id;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", genero="
				+ genero + ", preco=" + preco + "]";
	}
}
