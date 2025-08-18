package br.fiap.modelo;

import br.fiap.modelo.Categoria;

import java.time.LocalDate;

public class Despesa {

    private Long id;
    private String descricao;
    private Double valor;
    private LocalDate data;
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}

