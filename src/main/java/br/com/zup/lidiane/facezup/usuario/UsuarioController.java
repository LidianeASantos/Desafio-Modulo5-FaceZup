package br.com.zup.lidiane.facezup.usuario;

import br.com.zup.lidiane.facezup.mensagem.Mensagem;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;
    private ModelMapper modelMapper;

    @Autowired
    public UsuarioController(UsuarioService usuarioService, ModelMapper modelMapper){
        this.usuarioService = usuarioService;
        this.modelMapper = modelMapper;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto cadastrarUsuario(@RequestBody @Valid Usuario usuarioDTO){
        Usuario usuario = usuarioService.cadastrarUsario(usuarioDTO);

       return modelMapper.map( usuario, UsuarioDto.class );

    }






}
