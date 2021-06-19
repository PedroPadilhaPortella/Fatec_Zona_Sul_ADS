package revisaodm2021n.controles;

import java.sql.SQLException;
import java.util.List;

import revisaodm2021n.dados.Livro;
import revisaodm2021n.modelos.DaoLivro;

public class ControleLivro {

    static DaoLivro service;
    
    public ControleLivro() throws SQLException, ClassNotFoundException {
    	service = new DaoLivro();
    }

    public Livro inserir(Livro pEntrada) throws SQLException {
        return service.inserir(pEntrada);
    }

    public List<Livro> listar(Livro pEntrada) throws SQLException {
        return service.listar(pEntrada);
    }

    public Livro alterar(Livro pEntrada) throws SQLException {
        return service.alterar(pEntrada);
    }

    public Livro buscar(Livro pEntrada) throws SQLException {
        return service.buscar(pEntrada);
    }

    public Livro excluir(Livro pEntrada) throws SQLException {
        return service.excluir(pEntrada);
    }   
}