package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private String sobreNome;
    @Id
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false, length = 50)
    private String cargo;

    @OneToMany(mappedBy = "usuario")
    private List<Mensagem> mensagens;

    public Usuario() {
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
}
