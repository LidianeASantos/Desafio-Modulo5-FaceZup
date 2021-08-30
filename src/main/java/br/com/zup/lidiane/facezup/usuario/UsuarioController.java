package br.com.zup.lidiane.facezup.usuario;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto cadastrarUsuario(@RequestBody @Valid Usuario usuarioDTO){
        Usuario usuario = usuarioService.cadastrarUsario(usuarioDTO);

       return modelMapper.map( usuario, UsuarioDto.class );

    }




}
