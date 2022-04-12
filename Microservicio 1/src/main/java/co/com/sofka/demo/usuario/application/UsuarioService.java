package co.com.sofka.demo.usuario.application;

import co.com.sofka.demo.usuario.domain.Usuario;
import reactor.core.publisher.Flux;

public interface UsuarioService {
    Flux<Usuario> findAll();
}
