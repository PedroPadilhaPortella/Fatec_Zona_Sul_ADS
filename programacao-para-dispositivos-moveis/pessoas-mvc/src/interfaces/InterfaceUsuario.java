package interfaces;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import controllers.ControleUsuario;
import models.Usuario;

public class InterfaceUsuario
{
	static int id;
    static String login;
    static String senha;
    static String status;
    static String tipo;
    
    static ControleUsuario controleUsuario;
    
    public InterfaceUsuario() throws ClassNotFoundException, SQLException {
    	controleUsuario = new ControleUsuario();
    }
    
    public static void Inserir() throws SQLException
    {
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS (ATIVO / INATIVO)");
        tipo = JOptionPane.showInputDialog("TIPO (ADMINISTRADOR / PADRÃO)");
        Usuario data = new Usuario(login, senha, status, tipo);
        Usuario dominio = controleUsuario.inserir(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }
    
    public static void Alterar() throws SQLException
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS");
        tipo = JOptionPane.showInputDialog("TIPO");
        Usuario data = new Usuario(id, login, senha, status, tipo);
        Usuario dominio = controleUsuario.alterar(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }

    public static void Listar() throws SQLException
    {
        login = JOptionPane.showInputDialog("LOGIN");
        Usuario data = new Usuario(login);
        List<Usuario> dominios = controleUsuario.listar(data);
        JOptionPane.showMessageDialog(null, dominios.get(1).toString());
    }

    public static void Buscar() throws SQLException
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario data = new Usuario(id);
        Usuario dominio = controleUsuario.buscar(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }

    public static void Excluir() throws SQLException
    {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario data = new Usuario(id);
        Usuario dominio = controleUsuario.excluir(data);
        JOptionPane.showMessageDialog(null, dominio.toString());
    }
}