package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;

import revisaodm2021n.dados.Notebook;
import revisaodm2021n.modelos.DaoNotebook;

public class ControleNotebook {

    static DaoNotebook service;
    
    public ControleNotebook() throws SQLException, ClassNotFoundException {
    	service = new DaoNotebook();
    }

    public Notebook inserir(Notebook pEntrada) throws SQLException {
        return service.inserir(pEntrada);
    }

    public List<Notebook> listar(Notebook pEntrada) throws SQLException {
        return service.listar(pEntrada);
    }

    public Notebook alterar(Notebook pEntrada) throws SQLException {
        return service.alterar(pEntrada);
    }

    public Notebook buscar(Notebook pEntrada) throws SQLException {
        return service.buscar(pEntrada);
    }

    public Notebook excluir(Notebook pEntrada) throws SQLException {
        return service.excluir(pEntrada);
    }   
}