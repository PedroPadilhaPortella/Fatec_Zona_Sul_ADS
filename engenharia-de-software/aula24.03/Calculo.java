public class Calculo {

	private double numero1;
	private double numero2;
	private Robo robo;

    public Calculo(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

	public double getNumero1() {
		return this.numero1;
	}
    
	public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }

	public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Robo getRobo() {
        return this.robo;
    }

    public void setRobo(Robo robo) {
        this.robo = robo;
    }

    public double Soma() {
        return this.numero1 + this.numero2;
    }
}
