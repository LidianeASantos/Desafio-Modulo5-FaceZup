package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.usuario.Usuario;
import br.com.zup.lidiane.facezup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    @Autowired
    private UsuarioService usuarioService;

    public Mensagem cadastrarMensagem(String id, Mensagem mensagem){
        if (usuarioService.usuarioExistente( id )) {
            Usuario usuarioObjeto = usuarioService.buscarUsuarioPeloId( id );

            usuarioService.cadastrarUsario( usuarioObjeto );
            return mensagem;
        }
        throw new RuntimeException("Usuário não encontrado");
    }


}
