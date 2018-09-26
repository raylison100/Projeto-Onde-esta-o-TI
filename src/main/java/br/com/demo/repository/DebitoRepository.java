package br.com.demo.repository;

import br.com.demo.model.entity.Debito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitoRepository extends JpaRepository <Debito, Long> {
}
