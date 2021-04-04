package controllers;

import java.util.List;

import dao.ProdutoDAO;
import models.Produto;

public class ControleProduto {
    
    static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public Produto inserir (Produto produto) {
        return produtoDAO.inserir(produto);
    }
    
    public Produto alterar (Produto produto) {
        return produtoDAO.alterar(produto);
    }

    public Produto buscar (Produto produto) {
        return produtoDAO.buscar(produto);
    }

    public Produto excluir (Produto produto) {
        return produtoDAO.excluir(produto);
    }

    public List<Produto> listar (Produto produto) {
        return produtoDAO.listar(produto);
    }
}