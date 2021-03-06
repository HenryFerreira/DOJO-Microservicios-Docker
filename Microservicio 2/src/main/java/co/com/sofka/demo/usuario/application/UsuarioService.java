package co.com.sofka.demo.usuario.application;

import co.com.sofka.demo.usuario.domain.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioService {


    Mono<Usuario> crearUsuario(Usuario usuario);
}
