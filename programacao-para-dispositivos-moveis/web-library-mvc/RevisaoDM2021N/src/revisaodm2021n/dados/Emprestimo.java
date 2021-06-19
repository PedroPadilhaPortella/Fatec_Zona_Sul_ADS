
package revisaodm2021n.dados;

public class Emprestimo {
    
    private int id;
    private String idCliente;
    private String idLivro;
    private String dataEmprestimo;

    public Emprestimo(int id, String idCliente, String idLivro, String dataEmprestimo) {
        this.id = id;
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Emprestimo(String idLivro, String idCliente, String dataEmprestimo) {
        this.idLivro = idLivro;
        this.idCliente = idCliente;
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Emprestimo(int id) {
        this.id = id;   
    }
    
    public Emprestimo(String cliente) {
        this.idCliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idlivro) {
        this.idLivro = idlivro;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + ", livro=" + idLivro + ", Cliente=" + idCliente + ", dataEmprestimo=" + dataEmprestimo + '}';
    }
}
