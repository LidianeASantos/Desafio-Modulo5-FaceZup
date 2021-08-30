package br.com.zup.lidiane.facezup.usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioDto {

    @NotBlank(message = "{validacao.nome.usuario}")
    private String nome;
    @NotBlank(message = "{validacao.sobreNome.usuario}")
    private String sobreNome;
    @Email(message = "{validacao.email.usuario}")
    private String email;
    @NotBlank(message = "{validacao.cargo}")
    private String cargo;

    public UsuarioDto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static UsuarioDto converterModelParaDTO(Usuario usuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setEmail(usuario.getEmail());
        usuarioDto.setNome(usuario.getNome());
        usuarioDto.setSobreNome(usuario.getSobreNome());
        usuarioDto.setCargo( usuario.getCargo() );
        return usuarioDto;
    }
}
