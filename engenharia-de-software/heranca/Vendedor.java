public class Vendedor extends Pessoa
{
    private float comissao;
    public Vendedor(String nome, String celular, float comissao) {
        super(nome, celular);
        this.comissao = comissao;
    }


    public float getComissao() {
        return this.comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}