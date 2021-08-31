package br.com.zup.lidiane.facezup.dto;

public class MensagemIdDto {

    private Long id;
    private String mensagem;
    private boolean visualizado;

    public MensagemIdDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(boolean visualizado) {
        this.visualizado = visualizado;
    }
}
