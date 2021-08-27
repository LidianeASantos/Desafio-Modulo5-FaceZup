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

    public void cadastrarMensagem(String emailOrigem, String emailDestino, Mensagem mensagem) {
        Mensagem novaMensagem = new Mensagem();

        if (usuarioService.usuarioExistente( emailOrigem ) & usuarioService.usuarioExistente( emailDestino )) {
            Usuario usuarioOrigem = usuarioService.buscarUsuarioPeloId( emailOrigem );
            novaMensagem.setOrigem( emailOrigem );

            Usuario usuarioDestino = usuarioService.buscarUsuarioPeloId( emailDestino );
            novaMensagem.setDestino( emailDestino );
            novaMensagem.setMensagem( mensagem );
            novaMensagem.setVisualizado( false );

            mensagemRepository.save( novaMensagem );
        }
        throw new RuntimeException( "Usuário não encontrado!" );
    }



    }
