package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.usuario.Usuario;
import br.com.zup.lidiane.facezup.usuario.UsuarioRepository;
import br.com.zup.lidiane.facezup.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;


@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;
    @Autowired
    private UsuarioService usuarioService;


    public Mensagem cadastrarMensagem(String email, Mensagem mensagem) {

        Usuario usuario = usuarioService.buscarUsuarioPeloId( email );

        mensagem.setUsuario(usuario);
        mensagem.setVisualizado( false );

        return mensagemRepository.save( mensagem );
    }

    public List<Mensagem> pesquisarMensagemNaoLida(String emailUsuario){
        usuarioService.usuarioExistente( emailUsuario );

        return mensagemRepository.findAllByVizualizadoFalseAndDestinoUsuarioemail( emailUsuario );
    }


}
