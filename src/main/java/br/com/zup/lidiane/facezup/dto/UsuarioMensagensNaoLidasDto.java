package br.com.zup.lidiane.facezup.dto;

import br.com.zup.lidiane.facezup.usuario.Usuario;
import br.com.zup.lidiane.facezup.usuario.UsuarioDto;

public class UsuarioMensagensNaoLidasDto {

    private String id;
    private int quantidade;

    public UsuarioMensagensNaoLidasDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static UsuarioMensagensNaoLidasDto converterModelParaDto(Usuario usuario){
        UsuarioMensagensNaoLidasDto usuarioMensagensNaoLidasDto = new UsuarioMensagensNaoLidasDto();
        usuarioMensagensNaoLidasDto.setId( usuarioMensagensNaoLidasDto.getId() );
        usuarioMensagensNaoLidasDto.setQuantidade( usuarioMensagensNaoLidasDto.getQuantidade() );
        return usuarioMensagensNaoLidasDto;

    }
}
   