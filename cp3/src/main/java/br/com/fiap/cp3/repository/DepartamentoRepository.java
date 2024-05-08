package br.com.fiap.cp3.repository;

import br.com.fiap.cp3.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
