package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.Despesa;
import br.fiap.modelo.DespesaDAO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Despesa despesa= new Despesa();
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //configurando os atributos do objeto
        //despesa.setId(102L);
        despesa.setDescricao("viagem de helicóptero para Paraty");
        despesa.setValor(65000.00);
        despesa.setData(LocalDate.parse("25/08/2025", mascara));
        despesa.setCategoria(new Categoria(1L, ""));
        dao.inserir(despesa);

    }
}
