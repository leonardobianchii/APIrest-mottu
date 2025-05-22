package br.monitoramento.motu.api_mottu.dto;

public class FilialDepartamentoDTO {

    private Long idFilialDepartamento;
    private String nomeFilialDepartamento;

    public Long getIdFilialDepartamento() {
        return idFilialDepartamento;
    }

    public void setIdFilialDepartamento(Long idFilialDepartamento) {
        this.idFilialDepartamento = idFilialDepartamento;
    }

    public String getNomeFilialDepartamento() {
        return nomeFilialDepartamento;
    }

    public void setNomeFilialDepartamento(String nomeFilialDepartamento) {
        this.nomeFilialDepartamento = nomeFilialDepartamento;
    }
}