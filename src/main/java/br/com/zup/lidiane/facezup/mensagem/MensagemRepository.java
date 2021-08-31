package br.com.zup.lidiane.facezup.mensagem;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MensagemRepository extends CrudRepository<Mensagem, Long> {

    long countByVisualizadoAndDestino(Boolean visualizado, String email);

    Optional<Mensagem> findById(String email);
}
