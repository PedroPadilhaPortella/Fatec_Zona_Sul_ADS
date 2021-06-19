package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;

import revisaodm2021n.dados.Livro;
import revisaodm2021n.dados.Tenis;
import revisaodm2021n.modelos.DaoLivro;
import revisaodm2021n.modelos.DaoTenis;

public class ControleTenis {

    static DaoTenis service;
    
    public ControleTenis() throws SQLException, ClassNotFoundException {
    	service = new DaoTenis();
    }

    public Tenis inserir(Tenis pEntrada) throws SQLException {
        return service.inserir(pEntrada);
    }

    public List<Tenis> listar(Tenis pEntrada) throws SQLException {
        return service.listar(pEntrada);
    }

    public Tenis alterar(Tenis pEntrada) throws SQLException {
        return service.alterar(pEntrada);
    }

    public Tenis buscar(Tenis pEntrada) throws SQLException {
        return service.buscar(pEntrada);
    }

    public Tenis excluir(Tenis pEntrada) throws SQLException {
        return service.excluir(pEntrada);
    }   
}