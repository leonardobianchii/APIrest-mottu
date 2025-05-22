package br.monitoramento.motu.api_mottu.mapper;

import br.monitoramento.motu.api_mottu.dto.MotoDTO;
import br.monitoramento.motu.api_mottu.model.Moto;
import org.springframework.stereotype.Component;

@Component
public class MotoMapper {

    public MotoDTO toDTO(Moto moto) {
        MotoDTO dto = new MotoDTO();
        dto.setIdMoto(moto.getIdMoto());
        dto.setPlaca(moto.getPlaca());
        dto.setStatusMoto(moto.getStatusMoto());
        dto.setKmRodado(moto.getKmRodado());
        return dto;
    }

    public Moto toEntity(MotoDTO dto) {
        Moto moto = new Moto();
        moto.setPlaca(dto.getPlaca());
        moto.setStatusMoto(dto.getStatusMoto());
        moto.setKmRodado(dto.getKmRodado());
        return moto;
    }
}

