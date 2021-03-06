package application;
import javax.swing.JOptionPane;

import interfaces.InterfaceUsuario;
import interfaces.InterfaceDepartamento;
import interfaces.InterfacePessoa;
import interfaces.InterfacePessoaFisica;

public class Main
{
    public static void main(String[] args)
    {   
        while(true) {
        	int sistema = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - PESSOA, 2 - DEPARTAMENTO, 3 - USUARIO, 4 - PRODUTO, 5 - SAIR",
                    "SISTEMA DE CADASTRO MVC", JOptionPane.QUESTION_MESSAGE));
        	
        	if(sistema == 1)
        	{
        		int tipoPessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM 1 - PESSOA, 2 - PESSOA FÍSICA", "PESSOAS", JOptionPane.QUESTION_MESSAGE));
        		
        		if(tipoPessoa == 1)
        		{
	        		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
	                        "PESSOAS", JOptionPane.QUESTION_MESSAGE));
	        		
	        		if(opcao == 1) { InterfacePessoa.Inserir(); }
	        		
	        		if(opcao == 2) { InterfacePessoa.Alterar(); }
	        		
	        		if(opcao == 3) { InterfacePessoa.Buscar(); }
	        		
	        		if(opcao == 4) { InterfacePessoa.Excluir(); }
	        		
	        		if(opcao == 5) { InterfacePessoa.Listar(); }
	        		
        		} else if(tipoPessoa == 2) 
        		{
        			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
	                        "PESSOAS FÍSICAS", JOptionPane.QUESTION_MESSAGE));
	        		
	        		if(opcao == 1) { InterfacePessoaFisica.Inserir(); }
	        		
	        		if(opcao == 2) { InterfacePessoaFisica.Alterar(); }
	        		
	        		if(opcao == 3) { InterfacePessoaFisica.Buscar(); }
	        		
	        		if(opcao == 4) { InterfacePessoaFisica.Excluir(); }
	        		
	        		if(opcao == 5) { InterfacePessoaFisica.Listar(); }
	        		
        		}
        		
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

        		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTRE COM: 1 - INSERIR, 2 - ALTERAR, 3 - BUSCAR, 4 - EXCLUIR, 5 - LISTAR",
                        "PRODUTOS", JOptionPane.QUESTION_MESSAGE));
        		
        		if(opcao == 1) { InterfaceUsuario.Inserir(); }
        		
        		if(opcao == 2) { InterfaceUsuario.Alterar(); }
        		
        		if(opcao == 3) { InterfaceUsuario.Buscar(); }
        		
        		if(opcao == 4) { InterfaceUsuario.Excluir(); }
        		
        		if(opcao == 5) { InterfaceUsuario.Listar(); }
                
            } else if(sistema == 5){
                
        		JOptionPane.showMessageDialog(null, "SAINDO...");
        		break;

        	} else {
        		
        		JOptionPane.showMessageDialog(null, "OPCAO INVALIDA.");
        	}
        }
    }
}