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

    public void cadastrarMensagem(String origem, String destino, String mensagem) {
        Mensagem novaMensagem = new Mensagem();

        if (usuarioService.usuarioExistente( origem ) & usuarioService.usuarioExistente( destino )) {
            Usuario usuarioOrigem = usuarioService.buscarUsuarioPeloId( origem );
            novaMensagem.setOrigem( origem );

            Usuario usuarioDestino = usuarioService.buscarUsuarioPeloId( destino );
            novaMensagem.setDestino( destino );
            novaMensagem.setMensagem( mensagem );
            novaMensagem.setVisualizado( false );

            mensagemRepository.save( novaMensagem );
        }
        throw new RuntimeException( "Usuário não encontrado!" );
    }



    }
