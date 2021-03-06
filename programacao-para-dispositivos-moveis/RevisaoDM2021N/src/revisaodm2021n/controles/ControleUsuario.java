/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.controles;

import java.util.List;
import revisaodm2021n.dados.Usuario;
import revisaodm2021n.modelos.DaoUsuario;

/**
 *
 * @author User
 */
public class ControleUsuario {
    
    static DaoUsuario daoUsu = new DaoUsuario();
 

    public Usuario inserir(Usuario uEntrada) {
        return daoUsu.inserir(uEntrada);
    }

    public Usuario alterar(Usuario uEntrada) {
        return daoUsu.alterar(uEntrada);
    }

    public List<Usuario> listar(Usuario uEntrada) {
        return daoUsu.listar(uEntrada);
    }

    public Usuario buscar(Usuario uEntrada) {
        return daoUsu.buscar(uEntrada);
    }

    public Usuario excluir(Usuario uEntrada) {
        return daoUsu.excluir(uEntrada);
    }
    
}
