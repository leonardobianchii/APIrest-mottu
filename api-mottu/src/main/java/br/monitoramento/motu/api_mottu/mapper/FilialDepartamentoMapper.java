package br.monitoramento.motu.api_mottu.mapper;

import br.monitoramento.motu.api_mottu.dto.FilialDepartamentoDTO;
import br.monitoramento.motu.api_mottu.model.FilialDepartamento;
import org.springframework.stereotype.Component;

@Component
public class FilialDepartamentoMapper {

    public FilialDepartamentoDTO toDTO(FilialDepartamento filialDepartamento) {
        FilialDepartamentoDTO dto = new FilialDepartamentoDTO();
        dto.setIdFilialDepartamento(filialDepartamento.getIdFilialDepartamento());
        dto.setNomeFilialDepartamento(filialDepartamento.getNomeFilialDepartamento());
        return dto;
    }

    public FilialDepartamento toEntity(FilialDepartamentoDTO dto) {
        FilialDepartamento filialDepartamento = new FilialDepartamento();
        filialDepartamento.setNomeFilialDepartamento(dto.getNomeFilialDepartamento());
        return filialDepartamento;
    }
}

