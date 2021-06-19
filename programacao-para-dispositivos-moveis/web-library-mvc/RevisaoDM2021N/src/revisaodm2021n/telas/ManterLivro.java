package revisaodm2021n.telas;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import revisaodm2021n.controles.ControleLivro;
import revisaodm2021n.dados.Livro;

public class ManterLivro {

    static int id;
    static String titulo;
    static String autor;
    static String editora;
    static String genero;

    static ControleLivro controle;

    public static void Inserir() throws SQLException, ClassNotFoundException {

        titulo = JOptionPane.showInputDialog("TITULO");
        autor = JOptionPane.showInputDialog("AUTOR");
        editora = JOptionPane.showInputDialog("EDITORA");
        genero = JOptionPane.showInputDialog("GENERO");

        Livro pEntrada = new Livro(titulo, autor, editora, genero);
        controle = new ControleLivro();
        Livro pSaida = controle.inserir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Alterar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        titulo = JOptionPane.showInputDialog("TITULO");
        autor = JOptionPane.showInputDialog("AUTOR");
        editora = JOptionPane.showInputDialog("EDITORA");
        genero = JOptionPane.showInputDialog("GENERO");

        Livro pEntrada = new Livro(id, titulo, autor, editora, genero);
        controle = new ControleLivro();
        Livro pSaida = controle.alterar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }

    public static void Listar() throws SQLException, ClassNotFoundException {
        titulo = JOptionPane.showInputDialog("TITULO");

        Livro pEntrada = new Livro(titulo);
        controle = new ControleLivro();
        List<Livro> psSaida = controle.listar(pEntrada);

        psSaida.forEach((livro) -> {
            JOptionPane.showMessageDialog(null, livro.toString());
        });
    }

    public static void Buscar() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Livro pEntrada = new Livro(id);
        controle = new ControleLivro();
        Livro pSaida = controle.buscar(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());

    }

    public static void Excluir() throws SQLException, ClassNotFoundException {

        id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Livro pEntrada = new Livro(id);
        controle = new ControleLivro();
        Livro pSaida = controle.excluir(pEntrada);
        JOptionPane.showMessageDialog(null, pSaida.toString());
    }
}