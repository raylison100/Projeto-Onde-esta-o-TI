package br.com.demo.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="estoque")
public class Estoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(name = "qtd", nullable = false)
    private long qtd;

//    @OneToMany(mappedBy = "estoque", fetch = FetchType.LAZY)
//    private Chamado chamado;

 /*   @OneToMany(mappedBy = "estoque", fetch = FetchType.LAZY)
    private Lançamento lançamento;*/


}
