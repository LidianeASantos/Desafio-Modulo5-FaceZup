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
    public Usuario cadastrarUsuario(@RequestBody @Valid UsuarioDto usuarioDTO){
        Usuario usuarioModel = modelMapper.map(usuarioDTO, Usuario.class);

       return this.usuarioService.cadastrarUsario( usuarioModel );

    }



}
