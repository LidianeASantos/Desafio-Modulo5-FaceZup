package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@Table(name = "MENSAGEM")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mensagem;

    @Column(nullable = false, length = 50)
    private String destino;

    @Column(nullable = false, length = 50)
    private String origem;

    @Column(nullable = false)
    private Boolean visualizado;

    @ManyToOne
    @JoinColumn(name = "email_id")
    private Usuario usuario;

    public Mensagem(Long id, String mensagem, String origem, String destino, Boolean visualizado, Usuario usuario) {
        this.id = id;
        this.mensagem = mensagem;
        this.origem = origem;
        this.destino = destino;
        this.visualizado = visualizado;
        this.usuario = usuario;
    }

    public Mensagem() {
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Boolean isVisualizado() {
        return visualizado;
    }

    public void setVisualizado(Boolean visualizado) {
        this.visualizado = visualizado;

    }

    public Boolean getVisualizado() {
        return visualizado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
