package br.com.demo.model.entity;

import br.com.demo.model.enun.TipoDeChamado;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="chamado")
public class Chamado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "numeroDoIncidente", nullable = false)
    private String numeroDoIncidente;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoDeChamado tipo;

    @Column(name = "Descricao", nullable = false)
    private String Descricao;

    @Column(name = "solicitante", nullable = false)
    private String solicitante;

    @Column(name = "atendente", nullable = false)
    private String atendente;

    @Column(name = "produtoID", nullable = false)
    private String produtoID;

    @Column(name = "quantidade", nullable = false)
    private  int qtd;

    @Column(name = "resolucao", nullable = false)
    private String resolucao;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "debito_estoque_id")
//    private Estoque estoque;

    public Chamado(){

    }
}
