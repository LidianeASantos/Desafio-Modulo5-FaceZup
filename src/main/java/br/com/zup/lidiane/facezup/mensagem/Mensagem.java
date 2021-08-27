package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.usuario.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "mensagens")
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
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;


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
    public String getDestino() {
        return destino;
    }


    public String getOrigem() {
        return origem;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Boolean getVisualizado() {
        return visualizado;
    }

    public void setVisualizado(Boolean visualizado) {
        this.visualizado = visualizado;
    }
}
