package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsario(Usuario usuario){
        return usuarioRepository.save( usuario );
    }

    public boolean usuarioExistente(String id) {
        return usuarioRepository.existsById(id);
    }

    public Usuario buscarUsuarioPeloId(String id){
        Optional<Usuario> contatoOptional = usuarioRepository.findById(id);

        if(contatoOptional.isPresent()){
            return contatoOptional.get();
        }
        throw new RuntimeException("Usuário não encontrado!");

    }




}
