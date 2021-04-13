package entities;

class Empregado {

    private String nome;
    private String sobrenome;
    private double salmensal;

    public Empregado(String nome, String sobrenome, double salmensal) {
        if (salmensal > 0) {
            this.salmensal = salmensal;
        } else {
            this.salmensal = 0;
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalmensal() {
        return this.salmensal;
    }

    public void setSalmensal(double salmensal) {
        this.salmensal = salmensal;
    }

    public double getSalarioAnual() {
        return this.salmensal * 12;
    }

    public void aumento(int porcentagem) {
        this.salmensal += (salmensal * porcentagem / 100);
    }
}