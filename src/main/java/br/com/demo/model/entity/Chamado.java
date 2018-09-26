package br.com.demo.model.entity;

import br.com.demo.model.enun.TipoDeChamado;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="chamado")
public class Chamado {

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

    @OneToOne(mappedBy = "produto", fetch = FetchType.EAGER)
    private Produto produto;

    @Column(name = "quantidade", nullable = false)
    private  int qtd;

    @Column(name = "resolucao", nullable = false)
    private String resolucao;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;


    public Chamado(){

    }
}
