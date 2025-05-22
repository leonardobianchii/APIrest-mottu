package br.monitoramento.motu.api_mottu.repository;

import br.monitoramento.motu.api_mottu.model.SensorRFID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRFIDRepository extends JpaRepository<SensorRFID, Long> {
}
