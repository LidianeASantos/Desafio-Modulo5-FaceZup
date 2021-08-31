package br.com.zup.lidiane.facezup.dto;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;

public class MensagensNaoLidasDto {

    private int quantidade;

    public MensagensNaoLidasDto() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static MensagensNaoLidasDto converterModelParaDto(Mensagem mensagem){
        MensagensNaoLidasDto mensagensNaoLidasDto = new MensagensNaoLidasDto();
        mensagensNaoLidasDto.setQuantidade( mensagensNaoLidasDto.getQuantidade() );
        return mensagensNaoLidasDto;

    }
}
