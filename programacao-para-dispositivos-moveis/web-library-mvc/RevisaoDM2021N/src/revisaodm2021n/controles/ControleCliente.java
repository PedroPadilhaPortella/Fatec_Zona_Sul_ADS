package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;
import revisaodm2021n.dados.Cliente;
import revisaodm2021n.modelos.DaoCliente;

public class ControleCliente {

    static DaoCliente service;
    
    public ControleCliente() throws SQLException, ClassNotFoundException {
    	service = new DaoCliente();
    }

    public Cliente inserir(Cliente pEntrada) throws SQLException {
        return service.inserir(pEntrada);
    }

    public List<Cliente> listar(Cliente pEntrada) throws SQLException {
        return service.listar(pEntrada);
    }

    public Cliente alterar(Cliente pEntrada) throws SQLException {
        return service.alterar(pEntrada);
    }

    public Cliente buscar(Cliente pEntrada) throws SQLException {
        return service.buscar(pEntrada);
    }

    public Cliente excluir(Cliente pEntrada) throws SQLException {
        return service.excluir(pEntrada);
    }   
}