import javax.swing.JOptionPane;

public class Equacao
{
    private Integer a;    
    private Integer b;    
    private Integer c;
    
    public Equacao() { }

    public Equacao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcularRaiz() {
        double delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
        double r1 = 0;
        double r2 = 0;

        if(delta == 0) {
            r1 = this.b + (Math.sqrt(delta) / (2 * a));
            JOptionPane.showMessageDialog(null, "R1 = " + r1);
        } else if(delta > 0) {
            r1 = ((this.b * -1) + Math.sqrt(delta)) / (2 * a);
            r2 = ((this.b * -1) - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "R1 = " + r1 + ", R2 = " + r2);
        } else {
            JOptionPane.showMessageDialog(null, "Não existem raizes reais");
        }
    }

    public Integer getA() {
        return this.a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return this.c;
    }

    public void setC(Integer c) {
        this.c = c;
    }
}