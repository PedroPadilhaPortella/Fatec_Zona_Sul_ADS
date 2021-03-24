
/*
Criar uma classe para curso Superior contendo os seguintes atributos privativos à 
classe: N1, N2, N3. Deverá conter também o método público CalculaMedia().
Herdar da classe Superior os atributos e método gerando a subclasse Tecnico.
Na classe Superior:
N1 = Nota da P1;
N2 = Nota da P2;
N3 = Nota de trabalhos.
Média = (N1*0,35 + N2*0,5 + N3*0,15)
Na classe Tecnico:
N1 = Nota do 1º Trimestre;
N2 = Nota do 2º Trimestre;
N3 = Nota do 3º Trimestre;.
Média = (N1 + N2*2 + N3*2)/5;
Criar uma classe principal, instanciar um objeto a partir da classe Superior e outro 
objeto a partir da classe Tecnico.
Solicitar as notas e exibir as médias
*/
import javax.swing.JOptionPane;

public class Tecnico extends Superior
{
    Tecnico() {
        super();
    }

    Tecnico(double n1, double n2, double n3) {
        super(n1, n2, n3);
    }

    @Override
    public double CalculaMedia() {
        return (this.n1 + this.n2 * 2 + this.n3 * 2) / 5;
    }

    @Override
    public void setN1() {
        double n =  Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 1º trimestre do Tecnico"));
        if(n < 0) throw new NotaException();
        this.n1 = n;
    }

    @Override
    public void setN2() {
        double n =  Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 3º trimestre do Tecnico"));
        if(n < 0) throw new NotaException();
        this.n2 = n;
    }

    @Override
    public void setN3() {
        double n =  Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 3º trimestre do Tecnico"));
        if(n < 0) throw new NotaException();
        this.n3 = n;
    }
}