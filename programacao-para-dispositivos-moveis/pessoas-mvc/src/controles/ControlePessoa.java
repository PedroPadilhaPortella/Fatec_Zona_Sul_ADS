package controles;

import java.util.List;
import dados.Pessoa;
import modelos.PessoaDAO;

public class ControlePessoa {
    
    static PessoaDAO pessoaDAO = new PessoaDAO();
   
    public Pessoa inserir (Pessoa pessoa) {
        return pessoaDAO.inserir(pessoa);
    }
  
    public Pessoa alterar (Pessoa pessoa) {
        return pessoaDAO.alterar(pessoa);
    }
 
    public Pessoa excluir (Pessoa pessoa) {
        return pessoaDAO.excluir(pessoa);
    }
 
    public Pessoa buscar (Pessoa pessoa) {
        return pessoaDAO.buscar(pessoa);
    }
    
    public List<Pessoa> listar (Pessoa pessoa) {
        return pessoaDAO.listar(pessoa);
    }
    
}
