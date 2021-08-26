package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsario(Usuario usuario){
        return usuarioRepository.save( usuario );
    }

    public boolean contatoExistente(String id) {
        return usuarioRepository.existsById(id);
    }


}
