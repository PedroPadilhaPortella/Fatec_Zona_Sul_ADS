package dados;

public class Departamento {
    
    private int id;
    private String nome;
    private String descricao;
    private String centrodecusto;

    public Departamento(int id) {
        this.id = id;
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public Departamento(String nome, String descricao, String centrodecusto) {
        this.nome = nome;
        this.descricao = descricao;
        this.centrodecusto = centrodecusto;
    }

    public Departamento(int id, String nome, String descricao, String centrodecusto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.centrodecusto = centrodecusto;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCentrodecusto() {
        return centrodecusto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCentrodecusto(String centrodecusto) {
        this.centrodecusto = centrodecusto;
    }

    @Override
    public String toString() {
        return "Departamento { " + " id = " + id + ", nome = " + nome + ", descricao = " + descricao + ", centrodecusto = " + centrodecusto + " }";
    }

}
