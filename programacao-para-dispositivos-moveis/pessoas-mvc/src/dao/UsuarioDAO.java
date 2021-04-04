package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Usuario;
import util.ConexaoDB;

public class UsuarioDAO
{
	private final Connection connection;
	   
    public UsuarioDAO() throws SQLException, ClassNotFoundException{
        this.connection = new ConexaoDB().getConnection();
    }
   
    public Usuario buscar (Usuario u) throws SQLException
    {
        String sql = "select * from usuario WHERE id = ?";
        Usuario usuario = null;
        ;
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            
            stmt.setInt(1,u.getId());
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                usuario = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
            rs.close();
        }
        connection.close();
        return usuario;
    }

    public Usuario inserir (Usuario usuario) throws SQLException
    {
        String sql = "insert into usuario (login, senha, status, tipo)" + " values (?, ?, ?, ?)";
   
        try (PreparedStatement stmt = this.connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1,usuario.getLogin());
            stmt.setString(2,usuario.getSenha());
            stmt.setString(3,usuario.getStatus());
            stmt.setString(4,usuario.getTipo());
            
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                usuario.setId(id);
            }
            rs.close();
        }
        connection.close();
        return usuario;
    }

    public Usuario alterar (Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET login = ?, senha = ?, status = ?, tipo = ? WHERE id = ?";
        
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getStatus());
            stmt.setString(4, usuario.getTipo());
            stmt.setInt(5, usuario.getId());
            stmt.execute();
        }
        return usuario;

    }

    public Usuario excluir (Usuario u) throws SQLException
    {
         String sql = "delete from usuario WHERE id = ?";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql))
        {
            stmt.setInt(1,u.getId());
            stmt.execute();
        }
        connection.close();
        return u;
    }

    public List<Usuario> listar (Usuario u) throws SQLException
    {
        List<Usuario> usuarios = new ArrayList<>();   
        String sql = "select * from usuario where login like ?";
        
        try (PreparedStatement stmt = this.connection.prepareStatement(sql))
        {
            stmt.setString(1,"%" + u.getLogin()+ "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                usuarios.add(usuario);
            }
            rs.close();
        }
        connection.close();
        return usuarios;
    }
}