package br.com.zup.lidiane.facezup.mensagem;

import javax.validation.constraints.Email;

public class MensagemDto {


    private Mensagem mensagem;
    @Email(message = "{validacao.destino.mensagem}")
    private String destino;
    @Email(message = "{validacao.origem.mensagem}")
    private String origem;

    public MensagemDto() {
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
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
