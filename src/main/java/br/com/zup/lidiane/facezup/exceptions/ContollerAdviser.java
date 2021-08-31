package br.com.zup.lidiane.facezup.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ContollerAdviser {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErro manipularExcecoesDeValidacao(MethodArgumentNotValidException exception){
        List<FieldError> fildErros = exception.getBindingResult().getFieldErrors();

        List<Erro> erros = fildErros.stream().map(objeto -> new Erro(objeto.getDefaultMessage()))
                .collect( Collectors.toList());

        return new MensagemDeErro(400, erros);
    }

    @ExceptionHandler(MensagemNaoEncontradaException.class)
    public MensagemDeErro manipularMensagemNaoEncontrada(MensagemNaoEncontradaException exception){
        List<Erro> erros = Arrays.asList( new Erro( exception.getMessage()));

        return new MensagemDeErro( 400, erros );
    }

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public MensagemDeErro manipularUsuarioNaoEncontrado(UsuarioNaoEncontradoException exception){
        List<Erro> erros = Arrays.asList( new Erro( exception.getMessage()));

        return new MensagemDeErro( 400, erros );
    }

}
