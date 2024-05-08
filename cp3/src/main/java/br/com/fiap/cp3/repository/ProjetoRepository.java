package br.com.fiap.cp3.repository;

import br.com.fiap.cp3.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
