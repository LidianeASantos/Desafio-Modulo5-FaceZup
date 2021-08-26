package br.com.zup.lidiane.facezup.mensagem;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/{chat}")
    public Mensagem cadastroDeMensagem(@RequestBody @Valid MensagemDto mensagemDto, @PathVariable String chat  ){
        Mensagem mensagemModel = modelMapper.map( mensagemDto, Mensagem.class );

        return mensagemService.cadastrarMensagem(chat, mensagemModel );

    }
}
