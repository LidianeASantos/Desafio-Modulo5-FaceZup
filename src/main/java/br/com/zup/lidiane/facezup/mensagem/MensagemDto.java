package br.com.zup.lidiane.facezup.mensagem;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class MensagemDto {

    @NotBlank(message = "{validacao.mensagem.mensagemdto}")
    private String mensagem;
    @Email(message = "{validacao.destino.mensagem}")
    private String destino;
    @Email(message = "{validacao.origem.mensagem}")
    private String origem;

    public MensagemDto() {
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}