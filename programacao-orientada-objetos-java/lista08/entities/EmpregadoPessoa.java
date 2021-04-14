package entities;

public class EmpregadoPessoa extends Pessoa 
{
    private double salario;
    
    public EmpregadoPessoa(String nome, int idade, double altura, String sexo, double salario) {
        super( nome, idade, altura,  sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucros(int meses) {
        return meses * this.salario;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.idade + "anos, " + this.altura
         + " m de altura, Sexo: " + this.sexo + ", Salário: R$" + this.salario;
    }
}
