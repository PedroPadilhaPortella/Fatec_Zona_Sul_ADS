package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import revisaodm2021n.controles.ControleDepartamento;
import revisaodm2021n.dados.Departamento;


public class ManterDepartamento {
    
    static int id;
    static String nome;
    static String descricao;
    static String centrodecusto;
    
    static ControleDepartamento controle;
    
    public static void Inserir() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        
        controle = new ControleDepartamento();
        Departamento dEntrada = new Departamento(nome, descricao, centrodecusto);
        Departamento dSaida = controle.inserir(dEntrada);
        JOptionPane.showMessageDialog(null, dSaida.toString());
    }
    
    public static void Alterar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        nome = JOptionPane.showInputDialog("NOME");
        descricao = JOptionPane.showInputDialog("DESCRICAO"); 
        centrodecusto = JOptionPane.showInputDialog("CENTRODECUSTO");
        
        controle = new ControleDepartamento();
        Departamento dEntrada = new Departamento(id,nome,descricao,centrodecusto);
        Departamento dSaida = controle.alterar(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        nome = JOptionPane.showInputDialog("NOME");
        Departamento dEntrada = new Departamento(nome);
        
        controle = new ControleDepartamento();
        List<Departamento> dlSaida = controle.listar(dEntrada);
        dlSaida.forEach((dep) -> {
            JOptionPane.showMessageDialog(null,dep.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        
        controle = new ControleDepartamento();
        Departamento dEntrada = new Departamento(id);
        Departamento dSaida = controle.buscar(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }

    public static void Excluir() throws SQLException, ClassNotFoundException {
        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        
        controle = new ControleDepartamento();
        Departamento dEntrada = new Departamento(id);
        Departamento dSaida = controle.excluir(dEntrada);
        JOptionPane.showMessageDialog(null,dSaida.toString());
    }
}