package br.com.zup.lidiane.facezup.mensagem;

import br.com.zup.lidiane.facezup.dto.MensagemIdDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/chat")
public class MensagemController {

    private MensagemService mensagemService;
    private ModelMapper modelMapper;

    @Autowired
    public MensagemController(MensagemService mensagemService, ModelMapper modelMapper){
        this.mensagemService = mensagemService;
        this.modelMapper = modelMapper;
    }


    @PostMapping("/{email_id}")
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemDto cadastrarMensagemTeste(@RequestBody @Valid MensagemDto mensagemDto, @PathVariable String email_id ) {

        Mensagem mensagem = mensagemDto.converterDTOParaModel();
        mensagemService.cadastrarMensagem( email_id , mensagem );
        return MensagemDto.converterModelParaDTO(mensagem);

    }


    @GetMapping("/usuario/perfil/{emailUsuario}")
    public long informarMensagensNaoLidas(@RequestBody @PathVariable(value = "emailUsuario") String emailUsuario){

        return mensagemService.pesquisarMensagemNaoLida( emailUsuario );

    }

    @GetMapping("/{mensagemId}")
    public MensagemIdDto visualizarMensagem(@PathVariable(name = "mensagemId") Long id){
       Mensagem mensagem = mensagemService.pesquisarMensagemPorId(id);
        return modelMapper.map(mensagem, MensagemIdDto.class);
    }


}
