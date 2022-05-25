package tce.br.relatus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tce.br.relatus.model.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
}
