package controllers;

import java.sql.SQLException;
import java.util.List;

import dao.UsuarioDAO;
import models.Usuario;

public class ControleUsuario
{
	static UsuarioDAO usuarioDao;
	
	public ControleUsuario() throws ClassNotFoundException, SQLException {
		usuarioDao = new UsuarioDAO();
	}
	   
    public Usuario inserir (Usuario usuario) throws SQLException {
        return usuarioDao.inserir(usuario);
    }
  
    public Usuario alterar (Usuario usuario) throws SQLException {
        return usuarioDao.alterar(usuario);
    }
 
    public Usuario excluir (Usuario usuario) throws SQLException {
        return usuarioDao.excluir(usuario);
    }
 
    public Usuario buscar (Usuario usuario) throws SQLException {
        return usuarioDao.buscar(usuario);
    }
    
    public List<Usuario> listar (Usuario usuario) throws SQLException {
        return usuarioDao.listar(usuario);
    }
}