package br.com.demo.model.entity;

import br.com.demo.model.enun.TipoDeUsuario;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", nullable = false)
    private TipoDeUsuario tipoDeUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_ID")
    private Site site;
}
