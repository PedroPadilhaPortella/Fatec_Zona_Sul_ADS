package revisaodm2021n;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import revisaodm2021n.telas.ManterDepartamento;
import revisaodm2021n.telas.ManterLivro;
import revisaodm2021n.telas.ManterPessoa;
import revisaodm2021n.telas.ManterUsuario;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    	while(true) {
    		
	        JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOAS, DEPARTAMENTO, USUARIO E LIVROS");
	        JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - PESSOAS, 2 - DEPARTAMENTO, 3 - USUARIO, 4 - LIVROS 5 - SAIR");
	        int sistema = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPCAO"));
	
	        if(sistema == 1 ) {
	            
	            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO PESSOA");
	            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTAR, 5 - EXCLUIR,");
	
	            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPCAO"));
	    
	            if(opcao == 1) { ManterPessoa.Inserir(); }
	
	            if(opcao == 2) { ManterPessoa.Alterar(); }
	
	            if(opcao == 3) { ManterPessoa.Buscar(); }
	
	            if(opcao == 4) { ManterPessoa.Listar(); }
	
	            if(opcao == 5) { ManterPessoa.Excluir(); }
	
	          }
	
	        if(sistema == 2 ) {
	
	            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO DEPARTAMEMTO");
	            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR,");
	        
	            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPCAO"));
	        
	            if(opcao == 1) { ManterDepartamento.Inserir(); }
	
	            if(opcao == 2) { ManterDepartamento.Alterar(); }
	
	            if(opcao == 3) { ManterDepartamento.Buscar(); }
	
	            if(opcao == 4) { ManterDepartamento.Excluir(); }
	
	            if(opcao == 5) { ManterDepartamento.Listar(); }
	
	        }
	
	        if(sistema == 3 ) {
	
	            JOptionPane.showMessageDialog(null,"SISTEMA DE CADASTRO USUARIO");
	            JOptionPane.showMessageDialog(null,"ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - LISTA, 5 - EXCLUIR, 6 - VALIDAR,");
	
	            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPCAO"));
	        
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
	
	            int opcao = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM A OPCAO"));
	        
	            if(opcao == 1) { ManterLivro.Inserir(); }
	
	            if(opcao == 2) { ManterLivro.Alterar(); }
	
	            if(opcao == 3) { ManterLivro.Buscar(); }
	
	            if(opcao == 4) { ManterLivro.Listar(); }
	
	            if(opcao == 5) { ManterLivro.Excluir(); }
	        }
	        
	        if(sistema == 5) {
	        	break;
	        }
    	}
    }    
}
