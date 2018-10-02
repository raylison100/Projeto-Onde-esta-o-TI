package br.com.demo.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false)
    private String  nome;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoria_ID")
    private Categoria categoria;

//    @OneToOne(mappedBy = "produto")
//    private Estoque estoque;
}
