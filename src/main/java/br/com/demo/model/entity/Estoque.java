package br.com.demo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="estoque")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Produto produto;
    private long qtd;
    private List<Debito> debitos;
    private List<Lançamento> lançamentos;

}
