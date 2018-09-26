package br.com.demo.model.entity;

import javax.persistence.*;

public class Debito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "chamado", fetch = FetchType.EAGER)
    private Chamado chamado;


}
