package br.com.zup.lidiane.facezup.mensagem;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MensagemRepository extends CrudRepository<Mensagem, Long> {

    List<Mensagem> findAllByVizualizadoFalseAndDestinoUsuarioemail(String emailUsuario);
    Integer countAllByVisualizadoFalseAndDestinoUsuarioEmail(String emailUsuario);

}
