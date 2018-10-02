package br.com.demo.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="lancamento")
public class Lançamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "qtd", nullable = false)
    private int qtd;

    @Column(name = "puduto_ID", nullable = false)
    private String produto;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "lancamento_estoque_id")
//    private Estoque estoque;

}
