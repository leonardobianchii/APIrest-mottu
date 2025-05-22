package br.monitoramento.motu.api_mottu.service;

import br.monitoramento.motu.api_mottu.dto.LocalizacaoMotoRFIDDTO;
import br.monitoramento.motu.api_mottu.exception.ResourceNotFoundException;
import br.monitoramento.motu.api_mottu.mapper.LocalizacaoMotoRFIDMapper;
import br.monitoramento.motu.api_mottu.model.LocalizacaoMotoRFID;
import br.monitoramento.motu.api_mottu.model.Moto;
import br.monitoramento.motu.api_mottu.model.SensorRFID;
import br.monitoramento.motu.api_mottu.repository.LocalizacaoMotoRFIDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class LocalizacaoMotoRFIDService {

    @Autowired
    private LocalizacaoMotoRFIDRepository localizacaoMotoRFIDRepository;

    @Autowired
    private LocalizacaoMotoRFIDMapper localizacaoMotoRFIDMapper;

    public LocalizacaoMotoRFIDDTO adicionarLocalizacao(LocalizacaoMotoRFIDDTO dto) {
        LocalizacaoMotoRFID localizacao = localizacaoMotoRFIDMapper.toEntity(dto);

        Moto moto = new Moto();
        moto.setIdMoto(dto.getIdMoto());
        localizacao.setMoto(moto);

        SensorRFID sensor = new SensorRFID();
        sensor.setIdSensor(dto.getIdSensor());
        localizacao.setSensorRFID(sensor);

        localizacao = localizacaoMotoRFIDRepository.save(localizacao);
        return localizacaoMotoRFIDMapper.toDTO(localizacao);
    }

    public LocalizacaoMotoRFIDDTO obterLocalizacao(Long id) {
        LocalizacaoMotoRFID localizacao = localizacaoMotoRFIDRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada com id " + id));
        return localizacaoMotoRFIDMapper.toDTO(localizacao);
    }

    public List<LocalizacaoMotoRFIDDTO> listarLocalizacoes() {
        return localizacaoMotoRFIDRepository.findAll().stream()
                .map(localizacaoMotoRFIDMapper::toDTO)
                .collect(Collectors.toList());
    }

    public LocalizacaoMotoRFIDDTO atualizarLocalizacao(Long id, LocalizacaoMotoRFIDDTO dto) {
        LocalizacaoMotoRFID localizacaoExistente = localizacaoMotoRFIDRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada com id " + id));

        localizacaoExistente.setNrX(dto.getNrX());
        localizacaoExistente.setNrY(dto.getNrY());
        localizacaoExistente.setDtLocalizacao(dto.getDtLocalizacao());
        // Atualizar as relações Moto e SensorRFID se necessário

        localizacaoExistente = localizacaoMotoRFIDRepository.save(localizacaoExistente);
        return localizacaoMotoRFIDMapper.toDTO(localizacaoExistente);
    }

    public void deletarLocalizacao(Long id) {
        LocalizacaoMotoRFID localizacao = localizacaoMotoRFIDRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Localização não encontrada com id " + id));
        localizacaoMotoRFIDRepository.delete(localizacao);
    }
}

