package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private MensagemService mensagemService;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, MensagemService mensagemService){
        this.usuarioRepository = usuarioRepository;
        this.mensagemService = mensagemService;
    }

    public Usuario cadastrarUsario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean usuarioExistente(String email) {
        return usuarioRepository.existsById(email);
    }

    public Usuario buscarUsuarioPeloId(String email) {

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(email);

        if (usuarioOptional.isPresent()) {
            return usuarioOptional.get();
        }
        throw new RuntimeException( "Usuário não encontrado!" );

    }



}