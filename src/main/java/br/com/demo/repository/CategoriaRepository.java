package br.com.demo.repository;

import br.com.demo.model.entity.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository <Categoria, Long> {



}
