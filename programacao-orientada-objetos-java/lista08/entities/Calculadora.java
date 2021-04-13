package entities;
import javax.swing.JOptionPane;

public class Calculadora
{
    private double valor1;    
    private double valor2;    
    private String operador;
    private double resultado;    

    public Calculadora(double valor1, double valor2, String operador) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador = operador;
    }


    public double getValor1() {
        return this.valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return this.valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double calcular() {
        switch(this.operador) {
            case "+":
                return valor1 + valor2;
            case "-":
                return valor1 - valor2;
            case "*":
                return valor1 * valor2;
            case "/":
                if(this.valor2 == 0) {
                    JOptionPane.showMessageDialog(null, "O divisor não pode ser nulo.");
                    return 0;
                }
                return valor1 / valor2;
            default:
                JOptionPane.showMessageDialog(null, "Operador Inválido");
                return 0;
        }
    }
}
