package tce.br.relatus.dto;

import tce.br.relatus.model.Colaborador;

public class ColaboradorDtoRequest {
    String nome;
    String email;
    Long matricula;

    public Colaborador convertToColaborador(){
        return new Colaborador(this.nome, this.email, this.matricula);
    }
}
