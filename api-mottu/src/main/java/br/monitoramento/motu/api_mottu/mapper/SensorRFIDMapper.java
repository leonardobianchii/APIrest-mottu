package br.monitoramento.motu.api_mottu.mapper;

import br.monitoramento.motu.api_mottu.dto.SensorRFIDDTO;
import br.monitoramento.motu.api_mottu.model.SensorRFID;
import org.springframework.stereotype.Component;

@Component
public class SensorRFIDMapper {

    public SensorRFIDDTO toDTO(SensorRFID sensorRFID) {
        SensorRFIDDTO dto = new SensorRFIDDTO();
        dto.setIdSensor(sensorRFID.getIdSensor());
        dto.setNomeSensor(sensorRFID.getNomeSensor());
        dto.setLocalizacao(sensorRFID.getLocalizacao());
        return dto;
    }

    public SensorRFID toEntity(SensorRFIDDTO dto) {
        SensorRFID sensor = new SensorRFID();
        sensor.setNomeSensor(dto.getNomeSensor());
        sensor.setLocalizacao(dto.getLocalizacao());
        return sensor;
    }
}