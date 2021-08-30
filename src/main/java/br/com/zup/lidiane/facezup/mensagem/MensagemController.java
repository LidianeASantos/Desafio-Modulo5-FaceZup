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


    @PostMapping("/{email_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemDto cadastrarMensagemTeste(@RequestBody @Valid MensagemDto mensagemDto, @PathVariable String email_id ) {

        Mensagem mensagem = mensagemDto.converterDTOParaModel();
        mensagemService.cadastrarMensagem( email_id , mensagem );
        return MensagemDto.converterModelParaDTO(mensagem);


    }


}
