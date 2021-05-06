package revisaodm2021n.modelos;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import revisaodm2021n.dados.Usuario;
import revisaodm2021n.util.ConexaoDb;

public class DaoUsuario {
   
    private final Connection c;
   
    public DaoUsuario() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDb().getConnection();
    }
   

    public Usuario validar (Usuario u) throws SQLException {
        String sql = "select * from usu_usuario WHERE usu_login = ? and usu_senha = ?";
        Usuario retorno;

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());

            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {
            	
                retorno = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        }
        c.close();
        return retorno;
    }


    public Usuario buscar (Usuario u) throws SQLException {
        String sql = "select * from usu_usuario WHERE usu_id = ?";
        Usuario retorno;
        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {
        	
            stmt.setInt(1,u.getId());

            ResultSet rs = stmt.executeQuery();
            retorno = null;
            while (rs.next()) {

                retorno = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        }
        c.close();
        return retorno;
    }

    public Usuario inserir (Usuario u) throws SQLException {
        String sql = "insert into usu_usuario" + " (usu_login,usu_senha,usu_status,usu_tipo)" + " values (?,?,?,?)";
   
        try (
            PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            stmt.setString(3,u.getStatus());
            stmt.setString(4,u.getTipo());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                u.setId(id);
            }
        }
        c.close();
        return u;
    }

    public Usuario alterar (Usuario u) throws SQLException {
        String sql = "UPDATE usu_usuario SET usu_login = ?, usu_senha = ?, usu_status = ?, usu_tipo = ? WHERE usu_id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setString(1,u.getLogin());
            stmt.setString(2,u.getSenha());
            stmt.setString(3,u.getStatus());
            stmt.setString(4,u.getTipo());
            stmt.setInt(5,u.getId());

            stmt.execute();
        }
        return u;

    }

    public Usuario excluir (Usuario u) throws SQLException {
         String sql = "delete from usu_usuario WHERE usu_id = ?";

        try (PreparedStatement stmt = c.prepareStatement(sql)) {

            stmt.setInt(1,u.getId());

            stmt.execute();
        }
        c.close();
        return u;
    }

    public List<Usuario> listar (Usuario p) throws SQLException {

        List<Usuario> usus = new ArrayList<>();
       
        String sql = "select * from usu_usuario where usu_login like ?";

        try (PreparedStatement stmt = this.c.prepareStatement(sql)) {

            stmt.setString(1,"%" + p.getLogin()+ "%");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
            	
                Usuario uSaida = new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
                
                usus.add(uSaida);
            }
            
            rs.close();
        }
        return usus;
    }
}