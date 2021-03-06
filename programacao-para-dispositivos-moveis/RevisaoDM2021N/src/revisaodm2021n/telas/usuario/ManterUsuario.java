/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.telas.usuario;

import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleUsuario;
import revisaodm2021n.dados.Usuario;

/**
 *
 * @author User
 */
public class ManterUsuario {
    
    static int id;
    static String login;
    static String senha;
    static String status;
    static String tipo;
    
    static ControleUsuario contUsu = new ControleUsuario();
    
    public static void Inserir() {
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS");
        tipo = JOptionPane.showInputDialog("TIPO");
        Usuario uEntrada = new Usuario(login,senha,status,tipo);
        Usuario uSaida = contUsu.inserir(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }
    
    public static void Alterar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        login = JOptionPane.showInputDialog("LOGIN");
        senha = JOptionPane.showInputDialog("SENHA"); 
        status = JOptionPane.showInputDialog("STATUS");
        tipo = JOptionPane.showInputDialog("TIPO");
        Usuario uEntrada = new Usuario(id,login,senha,status,tipo);
        Usuario uSaida = contUsu.alterar(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

    public static void Listar() {
        login = JOptionPane.showInputDialog("LOGIN");
        Usuario uEntrada = new Usuario(login);
        List<Usuario> usSaida = contUsu.listar(uEntrada);
        JOptionPane.showMessageDialog(null,usSaida.get(0).toString());
        
    }

    public static void Buscar() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario uEntrada = new Usuario(id);
        Usuario uSaida = contUsu.buscar(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

    public static void Excluir() {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario uEntrada = new Usuario(id);
        Usuario uSaida = contUsu.excluir(uEntrada);
        JOptionPane.showMessageDialog(null,uSaida.toString());
    }

}
