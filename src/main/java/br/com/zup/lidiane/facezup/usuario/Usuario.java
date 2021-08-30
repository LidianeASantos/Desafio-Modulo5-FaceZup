package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USUARIO")
@JsonInclude
public class Usuario {

    @Id
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 50)
    private String sobreNome;

    @Column(nullable = false, length = 50)
    private String cargo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToMany(mappedBy = "usuario")
    private List<Mensagem> mensagens;

    public Usuario(String email, String nome, String sobreNome, String cargo, List<Mensagem> mensagens) {
        this.email = email;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cargo = cargo;
        this.mensagens = mensagens;
    }

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
