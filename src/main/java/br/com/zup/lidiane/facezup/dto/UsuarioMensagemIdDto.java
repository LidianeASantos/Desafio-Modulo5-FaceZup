package br.com.zup.lidiane.facezup.dto;

import br.com.zup.lidiane.facezup.usuario.Usuario;


public class UsuarioMensagemIdDto {

    private Long id;

    public UsuarioMensagemIdDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static UsuarioMensagemIdDto converterModelParaDto(Usuario usuario){
        UsuarioMensagemIdDto usuarioMensagemIdDto = new UsuarioMensagemIdDto();
        usuarioMensagemIdDto.setId( usuarioMensagemIdDto.getId() );
        return usuarioMensagemIdDto;


    }

}
