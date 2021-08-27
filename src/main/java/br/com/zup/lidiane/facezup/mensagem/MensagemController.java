package br.com.zup.lidiane.facezup.mensagem;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    @Autowired
    private MensagemService mensagemService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void cadastrarMensagem(@RequestBody @Valid MensagemDto mensagemDto){
        mensagemService.cadastrarMensagem(mensagemDto.getOrigem(), mensagemDto.getDestino(), mensagemDto.getMensagem());
    }
}
