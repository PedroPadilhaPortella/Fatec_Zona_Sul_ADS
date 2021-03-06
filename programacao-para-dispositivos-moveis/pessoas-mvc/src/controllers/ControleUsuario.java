package controllers;

import java.util.List;

import dao.UsuarioDAO;
import models.Usuario;

public class ControleUsuario
{
	static UsuarioDAO usuarioDao = new UsuarioDAO();
	   
    public Usuario inserir (Usuario usuario) {
        return usuarioDao.inserir(usuario);
    }
  
    public Usuario alterar (Usuario usuario) {
        return usuarioDao.alterar(usuario);
    }
 
    public Usuario excluir (Usuario usuario) {
        return usuarioDao.excluir(usuario);
    }
 
    public Usuario buscar (Usuario usuario) {
        return usuarioDao.buscar(usuario);
    }
    
    public List<Usuario> listar (Usuario usuario) {
        return usuarioDao.listar(usuario);
    }
}