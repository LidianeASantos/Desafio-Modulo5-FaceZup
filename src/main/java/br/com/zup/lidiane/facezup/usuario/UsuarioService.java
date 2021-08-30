package br.com.zup.lidiane.facezup.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsario(Usuario usuario) {
        return usuarioRepository.save( usuario );
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