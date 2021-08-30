package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.usuario.Usuario;
import br.com.zup.lidiane.facezup.usuario.UsuarioDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@JsonInclude
public class MensagemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;
    @NotBlank
    private String mensagem;

    @Email(message = "{validacao.destino.mensagem}")
    private String destino;

    @Email(message = "{validacao.origem.mensagem}")
    private String origem;


    private boolean visualizado;

    public Boolean getVisualizado() {
        return visualizado;
    }

    public void setVisualizado(Boolean visualizado) {
        this.visualizado = visualizado;
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



    public MensagemDto() {
    }

    public Mensagem converterDTOParaModel() {
        Mensagem mensagem = new Mensagem();
        mensagem.setMensagem( this.mensagem );
        mensagem.setOrigem( this.origem );
        mensagem.setDestino( this.destino );

        return mensagem;
    }


    public static MensagemDto converterModelParaDTO(Mensagem mensagem) {
        MensagemDto mensagemDTO = new MensagemDto();
        UsuarioDto usuarioDto = UsuarioDto.converterModelParaDTO(mensagem.getUsuario());

        mensagemDTO.setId(mensagem.getId() );
        mensagemDTO.setOrigem(mensagem.getOrigem());
        mensagemDTO.setDestino( mensagem.getDestino());
        mensagemDTO.setMensagem(mensagem.getMensagem());
        mensagemDTO.setVisualizado(mensagem.isVisualizado());

        return mensagemDTO;
    }

}
