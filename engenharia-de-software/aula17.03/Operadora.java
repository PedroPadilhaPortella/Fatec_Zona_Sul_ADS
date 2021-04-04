import java.util.List;

public class Operadora 
{
    private String name;
    private List<Plano> planos;

    public Operadora(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plano> getPlanos() {
        return this.planos;
    }

    public void addPlano(Plano plano) {
        this.planos.add(plano);
    }

    public void removePlano(Plano plano) {
        this.planos.remove(plano);
    }
}