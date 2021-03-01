package controles;

import java.util.List;
import dados.Pessoa;
import modelos.DaoPessoa;

public class ControlePessoa {
    
    static DaoPessoa daoPes = new DaoPessoa();
   
    public Pessoa inserir (Pessoa p) {
        return daoPes.inserir(p);
    }
  
    public Pessoa alterar (Pessoa p) {
        return daoPes.alterar(p);
    }
 
    public Pessoa excluir (Pessoa p) {
        return daoPes.excluir(p);
    }
 
    public Pessoa buscar (Pessoa p) {
        return daoPes.buscar(p);
    }
    
    public List<Pessoa> listar (Pessoa p) {
        List<Pessoa> pes = daoPes.listar(p);
        return pes;
    }
    
}
