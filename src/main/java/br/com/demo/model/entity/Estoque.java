package br.com.demo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "produtoID", fetch = FetchType.LAZY)
    private Produto produto;

    @Column(name = "qtd", nullable = false)
    private long qtd;

    @OneToMany(mappedBy = "debitoID", fetch = FetchType.LAZY)
    private List<Debito> debitos;

    @OneToMany(mappedBy = "lancamentoID", fetch = FetchType.LAZY)
    private List<Lançamento> lançamentos;

}
