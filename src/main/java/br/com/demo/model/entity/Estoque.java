package br.com.demo.model.entity;

import java.util.List;

public class Estoque {

    private long id;
    private Produto produto;
    private long qtd;
    private List<Debito> debitos;
    private List<Lançamento> lançamentos;

}
