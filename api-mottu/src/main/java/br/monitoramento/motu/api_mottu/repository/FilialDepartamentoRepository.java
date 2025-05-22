package br.monitoramento.motu.api_mottu.repository;

import br.monitoramento.motu.api_mottu.model.FilialDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialDepartamentoRepository extends JpaRepository<FilialDepartamento, Long> {
    // Podemos adicionar consultas personalizadas, se necessário
}