package br.com.demo.model.entity;

import javax.persistence.*;

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String  nome;

    @OneToOne(mappedBy = "categoryID", fetch = FetchType.LAZY)
    private long categoryID;
}
