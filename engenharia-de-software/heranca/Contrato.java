import java.util.Date;

public class Contrato
{
    private int codigo;
    private Date data;
    private Cliente cliente;
    private Plano plano;

    public Contrato(int codigo, Date data, Cliente cliente, Plano plano) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Plano getPlano() {
        return this.plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}