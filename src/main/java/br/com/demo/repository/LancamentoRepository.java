package br.com.demo.repository;

import br.com.demo.model.entity.Lançamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lançamento, Long> {
}
