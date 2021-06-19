package revisaodm2021n;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import revisaodm2021n.telas.ManterCliente;
import revisaodm2021n.telas.ManterPessoa;
import revisaodm2021n.telas.ManterUsuario;
import revisaodm2021n.telas.ManterDepartamento;
import revisaodm2021n.telas.ManterEmprestimo;
import revisaodm2021n.telas.ManterLivro;
import revisaodm2021n.telas.ManterNotebook;
import revisaodm2021n.telas.ManterTenis;

public class RevisaoDM2021N {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        while(true) {
             
            JOptionPane.showMessageDialog(null, "SISTEMA DE CADASTRO");
            JOptionPane.showMessageDialog(null, "ENTRE COM: 1 - PESSOAS, 2 - DEPARTAMENTO, 3 - USUARIO," + 
                    "\n 4 - LIVROS, 5- CLIENTES, 6 - EMPRESTIMOS," +
                    "\n 7 - NOTEBOOKS, 8 - TENIS, 0 - SAIR");
            int sistema = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

            if (sistema == 1 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOA");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTAR, 5 - EXCLUIR,");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterPessoa.Inserir(); }

                if(opcao == 2) { ManterPessoa.Alterar(); }

                if(opcao == 3) { ManterPessoa.Buscar(); }

                if(opcao == 4) { ManterPessoa.Listar(); }

                if(opcao == 5) { ManterPessoa.Excluir(); }
            }
            
            if(sistema == 2 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO DEPARTAMEMTO");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR,");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterDepartamento.Inserir(); }

                if(opcao == 2) { ManterDepartamento.Alterar(); }

                if(opcao == 3) { ManterDepartamento.Buscar(); }

                if(opcao == 4) { ManterDepartamento.Excluir(); }

                if(opcao == 5) { ManterDepartamento.Listar(); }
            }

            if(sistema == 3 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO USUARIO");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR, 6 - VALIDAR,");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterUsuario.Inserir(); }

                if(opcao == 2) { ManterUsuario.Alterar(); }

                if(opcao == 3) { ManterUsuario.Buscar(); }

                if(opcao == 4) { ManterUsuario.Listar(); }

                if(opcao == 5) { ManterUsuario.Excluir(); }

                if(opcao == 6) { ManterUsuario.Validar(); }
            }

            if(sistema == 4 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO LIVROS");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterLivro.Inserir(); }

                if(opcao == 2) { ManterLivro.Alterar(); }

                if(opcao == 3) { ManterLivro.Buscar(); }

                if(opcao == 4) { ManterLivro.Listar(); }

                if(opcao == 5) { ManterLivro.Excluir(); }
            }
            
            if(sistema == 5 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO CLIENTES");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterCliente.Inserir(); }

                if(opcao == 2) { ManterCliente.Alterar(); }

                if(opcao == 3) { ManterCliente.Buscar(); }

                if(opcao == 4) { ManterCliente.Listar(); }

                if(opcao == 5) { ManterCliente.Excluir(); }
            }
            
            if(sistema == 6 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO EMPRESTIMOS DE LIVROS");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - EMPRESTAR, 2 - ALTERAR, 3 - BUSCAR," +
                "4 - LISTAR POR CLIENTE, 5 - EXCLUIR");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterEmprestimo.Inserir(); }

                if(opcao == 2) { ManterEmprestimo.Alterar(); }

                if(opcao == 3) { ManterEmprestimo.Buscar(); }
                
                if(opcao == 4) { ManterEmprestimo.ListarPorCliente(); }

                if(opcao == 5) { ManterEmprestimo.Excluir(); }
            }
            
            if(sistema == 7 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO NOTEBOOKS");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterNotebook.Inserir(); }

                if(opcao == 2) { ManterNotebook.Alterar(); }

                if(opcao == 3) { ManterNotebook.Buscar(); }

                if(opcao == 4) { ManterNotebook.Listar(); }

                if(opcao == 5) { ManterNotebook.Excluir(); }
            }
            
            if(sistema == 8 ) {
                JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO TENIS");
                JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR");

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPÇÃO"));

                if(opcao == 1) { ManterTenis.Inserir(); }

                if(opcao == 2) { ManterTenis.Alterar(); }

                if(opcao == 3) { ManterTenis.Buscar(); }

                if(opcao == 4) { ManterTenis.Listar(); }

                if(opcao == 5) { ManterTenis.Excluir(); }
            }
            
            if(sistema == 0) {
                JOptionPane.showMessageDialog(null, "SAINDO...");
                break;
            }
        }
    }
}