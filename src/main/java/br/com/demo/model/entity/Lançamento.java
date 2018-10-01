package br.com.demo.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Lançamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "qtd", nullable = false)
    private int qtd;

    @OneToMany(mappedBy = "produtoID", fetch = FetchType.LAZY)
    private Produto produto;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

}
