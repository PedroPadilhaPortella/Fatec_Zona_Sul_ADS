/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaodm2021n.modelos;

import java.util.ArrayList;
import java.util.List;
import revisaodm2021n.dados.Usuario;

/**
 *
 * @author User
 */
public class DaoUsuario {

    public Usuario excluir(Usuario uEntrada) {
        return uEntrada;
    }

    public Usuario buscar(Usuario uEntrada) {
        return uEntrada;
    }

    public List<Usuario> listar(Usuario uEntrada) {
        
        List<Usuario> listUsu = new ArrayList<>();
        listUsu.add(uEntrada);
        return listUsu;

    }

    public Usuario alterar(Usuario uEntrada) {
        return uEntrada;
    }

    public Usuario inserir(Usuario uEntrada) {
        return uEntrada;
    }
    
}
