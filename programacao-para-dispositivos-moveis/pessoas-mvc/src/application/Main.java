package application;
import javax.swing.JOptionPane;

import interfaces.InterfaceUsuario;
import interfaces.InterfaceDepartamento;
import interfaces.ManterPessoa;

public class Main
{
    public static void main(String[] args)
    {   
        while(true) {
        	int sistema = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - PESSOA, 2 - DEPARTAMENTO, 3 - USUARIO, 4 - SAIR",
                    "SISTEMA DE CADASTRO MVC", JOptionPane.QUESTION_MESSAGE));
        	
        	if(sistema == 1)
        	{
        		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
                        "PESSOAS", JOptionPane.QUESTION_MESSAGE));
        		
        		if(opcao == 1) { ManterPessoa.Inserir(); }
        		
        		if(opcao == 2) { ManterPessoa.Alterar(); }
        		
        		if(opcao == 3) { ManterPessoa.Buscar(); }
        		
        		if(opcao == 4) { ManterPessoa.Excluir(); }
        		
        		if(opcao == 5) { ManterPessoa.Listar(); }
        		
        	} else if(sistema == 2) {
        		
        		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
                        "DEPARTAMEMTO", JOptionPane.QUESTION_MESSAGE));
        		
        		if(opcao == 1) { InterfaceDepartamento.Inserir(); }
        		
        		if(opcao == 2) { InterfaceDepartamento.Alterar(); }
        		
        		if(opcao == 3) { InterfaceDepartamento.Buscar(); }
        		
        		if(opcao == 4) { InterfaceDepartamento.Excluir(); }
        		
        		if(opcao == 5) { InterfaceDepartamento.Listar(); }
        		
        	} else if(sistema == 3 ) {
        		
        		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
                        "USUARIOS", JOptionPane.QUESTION_MESSAGE));
        		
        		if(opcao == 1) { InterfaceUsuario.Inserir(); }
        		
        		if(opcao == 2) { InterfaceUsuario.Alterar(); }
        		
        		if(opcao == 3) { InterfaceUsuario.Buscar(); }
        		
        		if(opcao == 4) { InterfaceUsuario.Excluir(); }
        		
        		if(opcao == 5) { InterfaceUsuario.Listar(); }
        	
        	} else if(sistema == 4) {
        		
        		JOptionPane.showMessageDialog(null, "SAINDO...");
        		break;
        	
        	} else {
        		
        		JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.");
        	}
        }
    }
}