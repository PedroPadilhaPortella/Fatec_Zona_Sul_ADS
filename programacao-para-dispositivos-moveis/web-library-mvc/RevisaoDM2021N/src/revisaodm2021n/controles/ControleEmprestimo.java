package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Emprestimo;

import revisaodm2021n.modelos.DaoEmprestimo;

public class ControleEmprestimo {

    static DaoEmprestimo service;
    
    public ControleEmprestimo() throws SQLException, ClassNotFoundException {
    	service = new DaoEmprestimo();
    }

    public Emprestimo inserir(Emprestimo pEntrada) throws SQLException {
        return service.inserir(pEntrada);
    }
    
    public List<Emprestimo> listarPorCliente(Emprestimo pEntrada) throws SQLException {
        return service.listarPorCliente(pEntrada);
    }

    public Emprestimo alterar(Emprestimo pEntrada) throws SQLException {
        return service.alterar(pEntrada);
    }

    public Emprestimo buscar(Emprestimo pEntrada) throws SQLException {
        return service.buscar(pEntrada);
    }

    public Emprestimo excluir(Emprestimo pEntrada) throws SQLException {
        return service.excluir(pEntrada);
    }   
}