package br.com.demo.model.entity;

import br.com.demo.model.enun.TipoDeChamado;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Chamado {

    private long id;
    private long numeroDoIncidente;
    private TipoDeChamado tipo;
    private String Descricao;
    private Usuario solicitante;
    private Usuario Atendente;
    private Produto produto;
    private  int qtd;
    private String resolucao;
    private LocalDateTime data;


    public Chamado(){

    }
}
