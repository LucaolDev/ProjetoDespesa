package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Conexao.conectar());
        CategoriaDAO dao = new CategoriaDAO();
        Categoria categoria = new Categoria(0L, "festa");
        dao.inserir(categoria);
    }
}
