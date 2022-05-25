package tce.br.relatus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tce.br.relatus.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}
