package br.com.fiap.cp3.repository;

import br.com.fiap.cp3.models.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
}
