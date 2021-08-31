package br.com.zup.lidiane.facezup.usuario;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    Optional<Usuario> findById(String email);
}
