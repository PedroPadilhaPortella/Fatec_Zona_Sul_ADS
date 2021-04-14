package entities;

public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    public Data (int dia, int mes, int ano) throws Exception {
        if (dia > 0 && dia <= 31)
            this.dia = dia;
        else 
            throw new Exception("Dia Inválido");

        if (mes > 0 && mes <= 12)
            this.mes = mes;
        else
            throw new Exception("Mês Inválido");

        if (ano > 0)
            this.ano = ano;
        else
            throw new Exception("Ano Inválido");
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String displayData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
